package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class lunbo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*"src": "#",//跳转链接
    "img": "../img/1.jpg",//图链接
    "title": "震惊！震惊！震惊！震惊！震惊！震惊！震惊！震惊！震惊！震惊！震惊！震惊！",//标题
    "text": "文本，文本，文本，文本，文本，文本，文本，文本，文本，文本，文本，文本，文本，文本文本，文本，文本，文本，文本，文本，文本，文本，"//文本
*/  
	private String img;
	private String title;
	private String text;
	private String src;
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
