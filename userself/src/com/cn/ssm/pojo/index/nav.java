package com.cn.ssm.pojo.index;

import java.io.Serializable;

public class nav implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * "id":"id1",//请求另一个接口时需要的id
		    "name":"最新"//名称
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
