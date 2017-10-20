package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class swift implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * "text":"文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本",//标题
		    "src": "#",//文章链接
		    "time": "10分钟前"//服务器计算文章发布距离现在的时间
	 */
	private String text;
	private String time;
	private String src;
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
