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
	
	

	//ȸ�� ��� ��������(ȸ�� �ȳ� ȸ��)
	@RequestMapping(value="/approval")
	public String selectMember(Model model){
		List<Member> list = libService.selectMember();
		model.addAttribute("list",list);
		logger.info("Controller approval: "+list.toString());
		return "ApprovalMember";
	}
	//ȸ�� ��� ������Ʈ(ȸ�� ��)
	@RequestMapping(value="/approval", method=RequestMethod.POST)
	public String updatePayMember(List<Member> memberList){
		logger.debug("������?");
		libService.updatePayMember(memberList);
		logger.info(memberList.toString());
		return "redirect://approval";
	}
	
	//���� �߰� �� �̵�
	@RequestMapping(value="/addbook")
	public String addBook(){
		return "AddBook";
	}
	//���� �߰� �� �׼�
	@RequestMapping(value="/addbook", method=RequestMethod.POST)
	public String addBook(Books books){
		libService.insertBook(books);
		return "AddBook";
	}
	
	//������ ��� �� �̵�
	@RequestMapping(value="/addlib")
	public String addLib(){
		return "AddLibrary";
	}
	//������ ��� �׼�
	@RequestMapping(value="/addlib", method=RequestMethod.POST)
	public String addLib(Lib lib){
		libService.insertLib(lib);
		return "AddLibrary";
	}
	
	//�α��� �� �̵�
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	//�α��� �׼�
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(RequestParam ID, RequestParam PW){
		
		return "";
	}
	
	//index�� �̵�(ȸ������)
	@RequestMapping(value="/index")
	public String index(Model model){
		//������ ���
		List<Lib> list= libService.selectLibrary();
		model.addAttribute("library",list);
		logger.info(list.toString());
		return "index";
	}
	//ȸ������ �׼� �� index�� �̵�
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String inserMember(Member member){
		libService.insertMember(member);
		return "index";
	}
}
