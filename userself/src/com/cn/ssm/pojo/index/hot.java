package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class hot implements Serializable  {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*	"hot":[{//�������£��ṩ���飬��һ���ṩͼƬ��ʣ�µĲ���ͼƬ
    "img": "../img/4.jpg",
    "text": "�ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı�",
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
