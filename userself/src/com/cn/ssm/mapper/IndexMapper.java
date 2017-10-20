package com.cn.ssm.mapper;


import java.util.ArrayList;

import com.cn.ssm.pojo.index.*;

public interface IndexMapper {

	////��ȡ�ֲ�ͼ����Ϣ����  4-6��
	public ArrayList<lunbo> selectLunbo(int size);
	
	//�������£��ṩ���飬��һ���ṩͼƬ��ʣ�µĲ���ͼƬ
	public ArrayList<hot> selectHot(int size);
	
	//"recommend":[{//�����Ƽ����֣��ṩ4��
	public ArrayList<recommend> selectRecommend(int size);

	//"nav":[{//���ർ����4-6��
	public ArrayList<nav> selectNav(int size);
	
	//"swift":[{//��Ѷ��9������
	public ArrayList<swift> selectSwift(int size);

	// "box":[{//���岿�֣�14��  
	public ArrayList<box> selectBox(int size);
}
