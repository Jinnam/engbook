package com.blog.beast4307.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.beast4307.service.Admin;
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
	
	
	//도서 대여 폼 이동
	@RequestMapping(value="/rentbook")
	public String rentBook(){
		return "RentBook";
	}
	
	//도서 대여 액션
	@RequestMapping(value="/rentbook", method=RequestMethod.POST)
	public String rentBook(Books books){
		
		return "redirect:RentBook";
	}
	//rent 도서 정보 조회
	@RequestMapping(value="/selectbook", method=RequestMethod.POST)
	public @ResponseBody Books selectRentBook(@RequestParam("bookCode") String bookCode){
		Books returnBook = libService.rentBookSelect(bookCode);
		logger.info(returnBook.toString());
		return returnBook;
	}
	
	//rent 멤버 정보 조회
	@RequestMapping(value="/rentmember", method=RequestMethod.POST)
	public @ResponseBody Member selectRentMember(@RequestParam("memberId") String memberId){
		Member returnMember = libService.rentMemberSelect(memberId);
		return returnMember;
	}
	//도서 반납 폼 이동
	@RequestMapping(value="/returnbook")
	public String returnBook(){
		return "ReturnBook";
	}
		
	//도서 반납 액션
	@RequestMapping(value="/returnbook", method=RequestMethod.POST)
	public String returnBook(Books books){
			
		return "redirect:ReturnBook";
	}
	//도서폐기 폼 이동
	@RequestMapping(value="/deletebook")
	public String deleteBook(){
		return "DeleteBook";
	}
		
	//도서 폐기 액션
	@RequestMapping(value="/deletebook", method=RequestMethod.POST)
	public String deleteBook(Books books){
			
		return "redirect:DeleteBook";
	}
	
	//회원 목록 가져오기(회비 안낸 회원)
	@RequestMapping(value="/approval")
	public String selectMember(Model model){
		List<Member> list = libService.selectMember();
		model.addAttribute("list",list);
		logger.info(list.toString());
		return "ApprovalMember";
	}
	//회원 목록 업데이트(회비 냄)
	@RequestMapping(value="/approval", method=RequestMethod.POST)
	public String updatePayMember(@RequestParam(value="memberId") String[] memberId){
		libService.updatePayMember(memberId);
		return "redirect:approval";
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
	public String login(Admin admin, HttpSession session){
		logger.info(admin.toString());
		String result="";
		Admin resultAdmin = libService.selectAdmin(admin);
		logger.info(resultAdmin.toString());
		//리턴값 1: 성공, 2: 비번불일치, 3: 아이디 불일치
		if(resultAdmin.getResult()==1){
			session.setAttribute("adminId", resultAdmin.getAdminId());
			session.setAttribute("libCode", resultAdmin.getLibCode());
			session.setAttribute("result", resultAdmin.getResult());
			result="AddLibrary";
		}else{
			result="redirect:login";
		}
		return result;

		
	}
	
	//로그아웃
	@RequestMapping(value="/logout")
	public String logoutAction(HttpSession session){
		session.invalidate();
		return "login";
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
