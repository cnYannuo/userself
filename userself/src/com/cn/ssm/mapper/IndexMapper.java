package com.cn.ssm.mapper;


import java.util.ArrayList;

import com.cn.ssm.pojo.index.*;

public interface IndexMapper {

	////获取轮播图的信息资料  4-6组
	public ArrayList<lunbo> selectLunbo(int size);
	
	//热门文章，提供三组，第一组提供图片，剩下的不给图片
	public ArrayList<hot> selectHot(int size);
	
	//"recommend":[{//名博推荐部分，提供4组
	public ArrayList<recommend> selectRecommend(int size);

	//"nav":[{//分类导航，4-6组
	public ArrayList<nav> selectNav(int size);
	
	//"swift":[{//快讯，9组左右
	public ArrayList<swift> selectSwift(int size);

	// "box":[{//主体部分，14组  
	public ArrayList<box> selectBox(int size);
}
