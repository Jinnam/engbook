package com.blog.beast4307.service;

import java.util.List;
import java.util.Map;

public interface LibDao {
	//ȸ������
	int insertMember(Member member);
	//���������
	int insertLib(Lib lib);
	//���� ���
	int insertBook(Books books);
	//ȸ�� ��� ��������
	List<Member> selectMember();
	//ȸ�� ���� ����(�Ա� Ȯ��)
	int updatePayMember(String MEMBERID);
	//ȸ�����Խ� ������ ��� ��������
	List<Lib> selectLib();

}
