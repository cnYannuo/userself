package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class nav implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * "id":"id1",//������һ���ӿ�ʱ��Ҫ��id
		    "name":"����"//����
	 */
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
