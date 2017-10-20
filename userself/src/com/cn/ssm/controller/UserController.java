package com.cn.ssm.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.ssm.pojo.QueryVo;
import com.cn.ssm.service.IndexServiceImpl;
import com.cn.ssm.service.UserServiceImpl;
import com.cn.ssm.pojo.index.*;
import com.cn.ssm.pojo.user.Intro;
import com.cn.ssm.pojo.user.User;

import utils.ImageCode;

@Controller
public class UserController {
	
	private String code;
	@Autowired
	private UserServiceImpl usi;
	@Autowired
	private IndexServiceImpl isi;
	
	//首页提供数据
	@Value("${lunbo}")
	private int lunbo;
	@Value("${hot}")
	private int hot;
	@Value("${recommend}")
	private int recommend;
	@Value("${nav}")
	private int nav;
	@Value("${swift}")
	private int swift;
	@Value("${box}")
	private int box;
	
	
	//进入首页
	@RequestMapping(value = "index")
	public String in(){
		return "index";
	}
	
	
	//首页所需的JSON
	@RequestMapping(value = "indexJson")
	public @ResponseBody
	index index(){
		
		index index = new index();
		
		index.setLunbo(isi.getLunbo(lunbo));
		index.setHot(isi.getHot(hot));
		index.setRecommend(isi.getRecommend(recommend));
		index.setNav(isi.getNav(nav));
		index.setSwift(isi.getSwift(swift));
		index.setBox(isi.getBox(box));
		
		return index;
	}
	
	//login登录
	@RequestMapping(value = "login.action")
	public String login(QueryVo vo,Model model){
		if(vo == null) return "login";
		if(usi.exist(vo)&&vo.getCheckcode().toLowerCase().equals(code.toLowerCase())){
			model.addAttribute("id", usi.selectUserIdByQueryVo(vo));
			
			return "index";
		}
		return "login";
	}
	
	//生成验证码入口
	@RequestMapping(value = "getCode.action")
	public void getCode(HttpServletResponse response){
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		ImageCode imageCode = new ImageCode();
		this.code = imageCode.getCode(stream);
		try {
			stream.writeTo(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//User  后台的入口
	@RequestMapping(value = "getUser.action")
	public @ResponseBody
	User getUser(int id){
			User user = new User();
			user.setEssay(usi.selectEssayByUserId(id));
			user.setIntro(usi.selectIntroByUserId(id));
			user.setPhotoAlbum(usi.selectPhotoAlbumByUserId(id));
			
			return user;
	}
	
	//修改用户数据
	@RequestMapping(value = "user_update.action")
	public@ResponseBody
	Intro update(Intro intro){
		usi.updateUser(intro);
		return intro;
	}
}
