package com.blog.beast4307.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LibDaoImple implements LibDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String NS="com.blog.beast4307.service.LibMapper.";
	
	//회원가입
	@Override
	public int insertMember(Member member) {
				
		return sqlSession.insert(NS+"memberInsert",member);
	}

	//도서관 등록
	@Override
	public int insertLib(Lib lib) {

		return sqlSession.insert(NS+"libraryInsert",lib);
	}
	
	//도서 등록
	@Override
	public int insertBook(Books books) {
		// TODO Auto-generated method stub
		return sqlSession.insert(NS+"bookInsert",books);
	}

	//회원목록 가져오기(입금 확인)
	@Override
	public List<Member> selectMember() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"memberSelect");
	}

	//입금 확인 후 입금상태 업데이트
	@Override
	public int updatePayMember(String memberId) {
		// TODO Auto-generated method stub
		return sqlSession.update(NS+"memberPayUpdate", memberId);
	}

	//도서관 목록 가져오기
	@Override
	public List<Lib> selectLib() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"librarySelect");
	}

	//Admin정보 가져오기
	@Override
	public Admin selectAdmin(String adminId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+"adminSelect",adminId);
	}
	//rent 멤버 정보 가져오기
	@Override
	public Member rentMemberSelect(String memberId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+"rentMemberSelect",memberId);
	}

	//rent 도서 정보 가져오기
	@Override
	public Books rentBookSelect(String bookCode) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+"rentBookSelect",bookCode);
	}
	
	

}