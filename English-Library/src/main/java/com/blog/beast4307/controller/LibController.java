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
	
	
	//���� �뿩 �� �̵�
	@RequestMapping(value="/rentbook")
	public String rentBook(){
		return "RentBook";
	}
	
	//���� �뿩 �׼�
	@RequestMapping(value="/rentbook", method=RequestMethod.POST)
	public String rentBook(Books books){
		
		return "redirect:RentBook";
	}
	//rent ���� ���� ��ȸ
	@RequestMapping(value="/selectbook", method=RequestMethod.POST)
	public @ResponseBody Books selectRentBook(@RequestParam("bookCode") String bookCode){
		Books returnBook = libService.rentBookSelect(bookCode);
		logger.info(returnBook.toString());
		return returnBook;
	}
	
	//rent ��� ���� ��ȸ
	@RequestMapping(value="/rentmember", method=RequestMethod.POST)
	public @ResponseBody Member selectRentMember(@RequestParam("memberId") String memberId){
		Member returnMember = libService.rentMemberSelect(memberId);
		return returnMember;
	}
	//���� �ݳ� �� �̵�
	@RequestMapping(value="/returnbook")
	public String returnBook(){
		return "ReturnBook";
	}
		
	//���� �ݳ� �׼�
	@RequestMapping(value="/returnbook", method=RequestMethod.POST)
	public String returnBook(Books books){
			
		return "redirect:ReturnBook";
	}
	//������� �� �̵�
	@RequestMapping(value="/deletebook")
	public String deleteBook(){
		return "DeleteBook";
	}
		
	//���� ��� �׼�
	@RequestMapping(value="/deletebook", method=RequestMethod.POST)
	public String deleteBook(Books books){
			
		return "redirect:DeleteBook";
	}
	
	//ȸ�� ��� ��������(ȸ�� �ȳ� ȸ��)
	@RequestMapping(value="/approval")
	public String selectMember(Model model){
		List<Member> list = libService.selectMember();
		model.addAttribute("list",list);
		logger.info(list.toString());
		return "ApprovalMember";
	}
	//ȸ�� ��� ������Ʈ(ȸ�� ��)
	@RequestMapping(value="/approval", method=RequestMethod.POST)
	public String updatePayMember(@RequestParam(value="memberId") String[] memberId){
		libService.updatePayMember(memberId);
		return "redirect:approval";
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
	public String login(Admin admin, HttpSession session){
		logger.info(admin.toString());
		String result="";
		Admin resultAdmin = libService.selectAdmin(admin);
		logger.info(resultAdmin.toString());
		//���ϰ� 1: ����, 2: �������ġ, 3: ���̵� ����ġ
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
	
	//�α׾ƿ�
	@RequestMapping(value="/logout")
	public String logoutAction(HttpSession session){
		session.invalidate();
		return "login";
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
