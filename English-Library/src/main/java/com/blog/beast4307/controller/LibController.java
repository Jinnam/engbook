package com.blog.beast4307.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.beast4307.service.Books;
import com.blog.beast4307.service.Lib;
import com.blog.beast4307.service.LibService;
import com.blog.beast4307.service.Member;

@Controller
public class LibController {
	private static final Logger logger = LoggerFactory.getLogger(LibController.class);
	@Autowired
	private LibService libService;
	Lib lib = new Lib();
	
	

	//회원 목록 가져오기(회비 안낸 회원)
	@RequestMapping(value="/approval")
	public String selectMember(Model model){
		List<Member> list = libService.selectMember();
		model.addAttribute("list",list);
		logger.info("Controller approval: "+list.toString());
		return "ApprovalMember";
	}
	//회원 목록 업데이트(회비 냄)
	@RequestMapping(value="/approval", method=RequestMethod.POST)
	public String updatePayMember(List<Member> memberList){
		logger.debug("나오나?");
		libService.updatePayMember(memberList);
		logger.info(memberList.toString());
		return "redirect://approval";
	}
	
	//도서 추가 폼 이동
	@RequestMapping(value="/addbook")
	public String addBook(){
		return "AddBook";
	}
	//도서 추가 폼 액션
	@RequestMapping(value="/addbook", method=RequestMethod.POST)
	public String addBook(Books books){
		libService.insertBook(books);
		return "AddBook";
	}
	
	//도서관 등록 폼 이동
	@RequestMapping(value="/addlib")
	public String addLib(){
		return "AddLibrary";
	}
	//도서관 등록 액션
	@RequestMapping(value="/addlib", method=RequestMethod.POST)
	public String addLib(Lib lib){
		libService.insertLib(lib);
		return "AddLibrary";
	}
	
	//로그인 폼 이동
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	//로그인 액션
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(RequestParam ID, RequestParam PW){
		
		return "";
	}
	
	//index로 이동(회원가입)
	@RequestMapping(value="/index")
	public String index(Model model){
		//도서관 목록
		List<Lib> list= libService.selectLibrary();
		model.addAttribute("library",list);
		logger.info(list.toString());
		return "index";
	}
	//회원가입 액션 후 index로 이동
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String inserMember(Member member){
		libService.insertMember(member);
		return "index";
	}
}
