package com.blog.beast4307.service;

import java.util.List;

public interface LibDao {
	//rent �������� ��������
	Books rentBookSelect(String bookCode);
	//rent ȸ������ ��������
	Member rentMemberSelect(String memberId);
	//admin ������������
	Admin selectAdmin(String adminId);
	//ȸ������
	int insertMember(Member member);
	//���������
	int insertLib(Lib lib);
	//���� ���
	int insertBook(Books books);
	//ȸ�� ��� ��������
	List<Member> selectMember();
	//ȸ�� ���� ����(�Ա� Ȯ��)
	int updatePayMember(String memberId);
	//ȸ�����Խ� ������ ��� ��������
	List<Lib> selectLib();
}
