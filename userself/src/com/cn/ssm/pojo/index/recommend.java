package com.cn.ssm.pojo.index;

import java.io.Serializable;

/*
 * "recommend":[{//�����Ƽ����֣��ṩ4��
		    "name": "username1",//�û���
		    "img": "../img/1.jpg",//ͷ��
		    "label": ["java","���繥��","����"],//�û���ǩ
		    "src": "#"//������ҳ����
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
