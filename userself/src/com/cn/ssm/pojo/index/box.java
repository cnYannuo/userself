package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class box implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *  "src": "#",//文章链接
		    "img": "../img/1.jpg",//文章图片
		    "title": "标题标题标题标题标标题标题标题标题标标题标题标题标题标题标题标题标题标题",//标题
		    "time": "9-23 13:41",//发表时间
		    "label": "标签",//文章标签
		    "labelSrc": "#",//标签链接
		    "visitor": 100//访问量
	 */
	private String src;
	private String img;
	private String time;
	private String label;
	private String labelSrc;
	private String visitor;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLabelSrc() {
		return labelSrc;
	}
	public void setLabelSrc(String labelSrc) {
		this.labelSrc = labelSrc;
	}
	public String getVisitor() {
		return visitor;
	}
	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}
	
}
