package com.cn.ssm.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ssm.mapper.IndexMapper;
import com.cn.ssm.pojo.index.*;

import utils.TimeManager;

@Service
public class IndexServiceImpl implements IndexService {
	
	@Autowired
	private IndexMapper im;
	
	private ArrayList<nav> nav;
	
	//��ȡ�ֲ�ͼ����Ϣ���� 
	public ArrayList<lunbo> getLunbo(int size){
		ArrayList<lunbo> lunbo = im.selectLunbo(size);
		
		for(lunbo lb:lunbo){
			lb.setSrc("#");
		}
		
		return lunbo;
	}

	//�������£��ṩ���飬��һ���ṩͼƬ��ʣ�µĲ���ͼƬ
	public ArrayList<hot> getHot(int size) {
		ArrayList<hot> hot = im.selectHot(size);
		
		for(hot h:hot) h.setSrc("#");
		
		for(int i=size-1;i>0;i--) hot.get(i).setImg(null);
		return hot;
	}

	//"recommend":[{//�����Ƽ����֣��ṩ4��
	public ArrayList<recommend> getRecommend(int size) {
		ArrayList<recommend> recommend = im.selectRecommend(size);
		
		for(recommend r:recommend) r.setSrc("#");
		
		return recommend;
	}

	//"nav":[{//���ർ����4-6��
	public ArrayList<nav> getNav(int size) {
		if(nav == null) nav = im.selectNav(size);
		return nav; 
	}
	
	//"swift":[{//��Ѷ��9������
	public ArrayList<swift> getSwift(int size) {
		ArrayList<swift> swift = im.selectSwift(size);
		
		//ʱ��Ϊ    ���·���;������ڵ�ʱ��  �磺10����ǰ
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		for(swift s:swift){
			Date date = null;
			try {
				date = format.parse(s.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.getStackTrace();
			}
			
			Integer l = (int) (System.currentTimeMillis() -  date.getTime());
			String str = "";
			if(l >= 24*60*60*1000){
				l=null;
				str="һ��ǰ";
			}
			else if(l >= 60*60*1000){
				l /=60*60*1000;
				str = "Сʱ";
			}else if(l >= 60*1000){
				l/=60*1000;
				str="����";
			}else if(l >=1000){
				l = 0;
				str = "�ո�";
			}
			
			if(l==null) s.setTime(str);
			else s.setTime(l.toString()+str);
			
			
			s.setSrc("#");
		}
		return swift;
	}
	
	// "box":[{//���岿�֣�14��  
	public ArrayList<box> getBox(int size) {
		ArrayList<box> box = im.selectBox(size);
		for(box b:box){
			String str = b.getTime();
			b.setTime(TimeManager.timeManager(str));
			
			
			b.setSrc("#");
			b.setLabelSrc("#");
			
		}
		return box;
	}
}
