package com.blog.beast4307.service;

import java.util.List;
import java.util.Map;

public interface LibDao {
	//회원가입
	int insertMember(Member member);
	//도서관등록
	int insertLib(Lib lib);
	//도서 등록
	int insertBook(Books books);
	//회원 목록 가져오기
	List<Member> selectMember();
	//회원 정보 수정(입금 확인)
	int updatePayMember(String MEMBERID);
	//회원가입시 도서관 목록 가져오기
	List<Lib> selectLib();

}
