package com.cn.ssm.service;

import java.util.List;

import com.cn.ssm.pojo.QueryVo;
import com.cn.ssm.pojo.user.*;

public interface UserService {

	
	//ͨ���˺ź������ѯ�Ƿ�������û�
	public boolean exist(QueryVo vo);
	
	//ͨ���ʺ������ѯ����û�
	public Intro selectIntroByUserId(int id);
	
	//ͨ���˻������ѯID��Ȼ�󷵻���������
	public List<Essay> selectEssayByUserId(int id);
		
	
	//�޸��û���Ϣ
	public boolean updateUser(Intro intro);
}
