package com.cn.ssm.pojo.user;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Intro intro;
	private int user_count;
	private List<Essay> essay;
	private List<PhotoAlbum> photoAlbum;
	
	public Intro getIntro() {
		return intro;
	}
	public void setIntro(Intro intro) {
		this.intro = intro;
	}
	public List<Essay> getEssay() {
		return essay;
	}
	public void setEssay(List<Essay> essay) {
		this.essay = essay;
	}
	public List<PhotoAlbum> getPhotoAlbum() {
		return photoAlbum;
	}
	public void setPhotoAlbum(List<PhotoAlbum> photoAlbum) {
		this.photoAlbum = photoAlbum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getUser_count() {
		return user_count;
	}
	public void setUser_count(int user_count) {
		this.user_count = user_count;
	}

	
}
