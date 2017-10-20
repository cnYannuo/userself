package com.cn.ssm.pojo.user;

import java.util.List;

public class PhotoAlbum {

	private String photo_name;
	private List<String> photo_src;
	public String getPhoto_name() {
		return photo_name;
	}
	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}
	public List<String> getPhoto_src() {
		return photo_src;
	}
	public void setPhoto_src(List<String> photo_src) {
		this.photo_src = photo_src;
	}
	
}
