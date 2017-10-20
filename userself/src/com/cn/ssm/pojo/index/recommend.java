package com.cn.ssm.pojo.index;

import java.io.Serializable;

/*
 * "recommend":[{//名博推荐部分，提供4组
		    "name": "username1",//用户名
		    "img": "../img/1.jpg",//头像
		    "label": ["java","网络攻防","测试"],//用户标签
		    "src": "#"//个人主页链接
		  }],
 */
public class recommend implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String img;
	private String label;
	private String src;
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
