package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class hot implements Serializable  {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*	"hot":[{//热门文章，提供三组，第一组提供图片，剩下的不给图片
    "img": "../img/4.jpg",
    "text": "文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本",
    "src": "#"
  }],*/
	private String img;
	private String text;
	private String src;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	
}
