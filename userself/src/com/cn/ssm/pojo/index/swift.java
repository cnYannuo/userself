package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class swift implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * "text":"�ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı��ı�",//����
		    "src": "#",//��������
		    "time": "10����ǰ"//�������������·����������ڵ�ʱ��
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
