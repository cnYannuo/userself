package com.cn.ssm.mapper;

import java.util.ArrayList;
import java.util.List;

import com.cn.ssm.pojo.QueryVo;
import com.cn.ssm.pojo.user.*;

public interface userMapper {

	//通过账号和密码查询是否有这个用户
	public int exist(QueryVo vo);
	
	//通过帐号密码查询这个用户
	public Intro selectIntroByUserId(int id);
	
	//通过帐号密码 查询ID
	public int selectUserIdByQueryVo(QueryVo vo);
	
	//通过ID查询用户所有文章
	public ArrayList<Essay> selectEssayByUserId(int id);
	
	//通过用户ID查询相册类别
	public List<String> selectPhotoNameByUserId(int id);
	
	//通过相册类别查询用户的相册
	public List<String> selectPhotoAlbumByPhotoName(String name);
	
	//vo修改用户数据
	void updateUserByQueryVo(QueryVo vo);
	
	//删除用户数据
	void deleteUserByQueryVo(QueryVo vo);

}
