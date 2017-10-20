package com.cn.ssm.service;

import java.util.List;

import com.cn.ssm.pojo.QueryVo;
import com.cn.ssm.pojo.user.*;

public interface UserService {

	
	//通过账号和密码查询是否有这个用户
	public boolean exist(QueryVo vo);
	
	//通过帐号密码查询这个用户
	public Intro selectIntroByUserId(int id);
	
	//通过账户密码查询ID，然后返回所有文章
	public List<Essay> selectEssayByUserId(int id);
		
	
	//修改用户信息
	public boolean updateUser(Intro intro);
}
