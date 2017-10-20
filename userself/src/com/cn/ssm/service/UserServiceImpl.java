package com.cn.ssm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ssm.mapper.userMapper;
import com.cn.ssm.pojo.QueryVo;
import com.cn.ssm.pojo.user.*;

import utils.TimeManager;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private userMapper um;
	
	//通过账号和密码查询是否有这个用户
	public boolean exist(QueryVo vo) {
		return um.exist(vo)>0?true:false;
	}
	
	//通过帐号和密码查询用户ID
	public int selectUserIdByQueryVo(QueryVo vo){
		return um.selectUserIdByQueryVo(vo);
	}

	@Override
	public Intro selectIntroByUserId(int id) {
		Intro intro = um.selectIntroByUserId(id);
/*		String str = intro.getUser_birthday();
		//处理字符串   yyyy年MM月dd日
		intro.setUser_birthday(TimeManager.timeManager(str));*/
		return intro;
	}
	//通过账户密码查询ID，然后返回所有文章
	public List<Essay> selectEssayByUserId(int id){
		List<Essay> essay = new ArrayList<Essay>();
		essay = um.selectEssayByUserId(id);
		for(Essay e:essay){
			e.setAirtical_src("#");
			String string = e.getAirtical_date();
			e.setAirtical_date(TimeManager.timeyyyyMMdd(string));
		}
		return essay;
	}
	
	//通过用户ID查询用户的相册
	public List<PhotoAlbum> selectPhotoAlbumByUserId(int id){
		List<PhotoAlbum> photoAlbum = new ArrayList<PhotoAlbum>();
		List<String> string = new ArrayList<String>();
		string = um.selectPhotoNameByUserId(id);
		for(String str:string){
			PhotoAlbum album = new PhotoAlbum();
			album.setPhoto_name(str);
			album.setPhoto_src(um.selectPhotoAlbumByPhotoName(str));
			photoAlbum.add(album);
		}
		return photoAlbum;
	};
	
	//修改用户信息
	public boolean updateUser(Intro intro){
		return true;
	}
	
	

}
