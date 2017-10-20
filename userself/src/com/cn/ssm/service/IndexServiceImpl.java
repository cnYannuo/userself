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
	
	//获取轮播图的信息资料 
	public ArrayList<lunbo> getLunbo(int size){
		ArrayList<lunbo> lunbo = im.selectLunbo(size);
		
		for(lunbo lb:lunbo){
			lb.setSrc("#");
		}
		
		return lunbo;
	}

	//热门文章，提供三组，第一组提供图片，剩下的不给图片
	public ArrayList<hot> getHot(int size) {
		ArrayList<hot> hot = im.selectHot(size);
		
		for(hot h:hot) h.setSrc("#");
		
		for(int i=size-1;i>0;i--) hot.get(i).setImg(null);
		return hot;
	}

	//"recommend":[{//名博推荐部分，提供4组
	public ArrayList<recommend> getRecommend(int size) {
		ArrayList<recommend> recommend = im.selectRecommend(size);
		
		for(recommend r:recommend) r.setSrc("#");
		
		return recommend;
	}

	//"nav":[{//分类导航，4-6组
	public ArrayList<nav> getNav(int size) {
		if(nav == null) nav = im.selectNav(size);
		return nav; 
	}
	
	//"swift":[{//快讯，9组左右
	public ArrayList<swift> getSwift(int size) {
		ArrayList<swift> swift = im.selectSwift(size);
		
		//时间为    文章发表和距离现在的时间  如：10分钟前
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
				str="一天前";
			}
			else if(l >= 60*60*1000){
				l /=60*60*1000;
				str = "小时";
			}else if(l >= 60*1000){
				l/=60*1000;
				str="分钟";
			}else if(l >=1000){
				l = 0;
				str = "刚刚";
			}
			
			if(l==null) s.setTime(str);
			else s.setTime(l.toString()+str);
			
			
			s.setSrc("#");
		}
		return swift;
	}
	
	// "box":[{//主体部分，14组  
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
