package com.cn.ssm.mapper;

import java.util.ArrayList;
import java.util.List;

import com.cn.ssm.pojo.QueryVo;
import com.cn.ssm.pojo.user.*;

public interface userMapper {

	//ͨ���˺ź������ѯ�Ƿ�������û�
	public int exist(QueryVo vo);
	
	//ͨ���ʺ������ѯ����û�
	public Intro selectIntroByUserId(int id);
	
	//ͨ���ʺ����� ��ѯID
	public int selectUserIdByQueryVo(QueryVo vo);
	
	//ͨ��ID��ѯ�û���������
	public ArrayList<Essay> selectEssayByUserId(int id);
	
	//ͨ���û�ID��ѯ������
	public List<String> selectPhotoNameByUserId(int id);
	
	//ͨ���������ѯ�û������
	public List<String> selectPhotoAlbumByPhotoName(String name);
	
	//vo�޸��û�����
	void updateUserByQueryVo(QueryVo vo);
	
	//ɾ���û�����
	void deleteUserByQueryVo(QueryVo vo);

}
