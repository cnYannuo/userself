package com.cn.ssm.service;

import java.util.List;

import com.cn.ssm.pojo.index.lunbo;

public interface IndexService {

	//获取轮播图的信息资料  4-6组
	public List<lunbo> getLunbo(int size);
	
}
