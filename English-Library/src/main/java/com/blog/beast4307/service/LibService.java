package com.blog.beast4307.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface LibService {
	static final Logger logger = LoggerFactory.getLogger(LibService.class);
	//회원가입
	int insertMember(Member member);
	//도서관 등록
	int insertLib(Lib lib);
	//도서 등록
	int insertBook(Books book);
	//회원 목록
	List<Member> selectMember();
	//회원 목록 업데이트(회비 냄)
	int updatePayMember(String[] MEMBERID);
	//도서관 목록 가져오기
	List<Lib> selectLibrary();
}
