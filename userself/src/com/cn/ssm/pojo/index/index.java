package com.cn.ssm.pojo.index;

import java.io.Serializable;
import java.util.List;

public class index implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<lunbo> lunbo;
	private List<hot> hot;
	private List<recommend> recommend;
	private List<nav> nav;
	private List<swift> swift;
	private List<box> box;
	public List<lunbo> getLunbo() {
		return lunbo;
	}
	public void setLunbo(List<lunbo> lunbo) {
		this.lunbo = lunbo;
	}
	public List<hot> getHot() {
		return hot;
	}
	public void setHot(List<hot> hot) {
		this.hot = hot;
	}
	public List<recommend> getRecommend() {
		return recommend;
	}
	public void setRecommend(List<recommend> recommend) {
		this.recommend = recommend;
	}
	public List<nav> getNav() {
		return nav;
	}
	public void setNav(List<nav> nav) {
		this.nav = nav;
	}
	public List<swift> getSwift() {
		return swift;
	}
	public void setSwift(List<swift> swift) {
		this.swift = swift;
	}
	public List<box> getBox() {
		return box;
	}
	public void setBox(List<box> box) {
		this.box = box;
	}
	
}
