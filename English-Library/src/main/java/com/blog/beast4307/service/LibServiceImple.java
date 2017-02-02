package com.blog.beast4307.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibServiceImple implements LibService {

	@Autowired
	private LibDao dao;
	
	//ȸ������
	@Override
	public int insertMember(Member member) {
		//��ȭ��ȣ �Է� : ������ �Է������� ���� ��ȣ�� �ϳ��� ��ħ
		member.setMemberPhone(member.getPhone1()+member.getPhone2()+member.getPhone3());
		//ȸ�� ���� ���� : �����ϸ� N���� �ʱ�ȭ �ϰ� �Ա� Ȯ�� �� Y�� ����
		member.setMemberPaymentStatus('N');
		//�뿩Ƚ�� : ���Խ� 0���� �ʱ�ȭ
		member.setRentalCount(0);
		return dao.insertMember(member);
	}
	
	//���������
	@Override
	public int insertLib(Lib lib) {

		return dao.insertLib(lib);
	}
	
	//���� �߰�
	@Override
	public int insertBook(Books books) {
		//������ �ڵ� �߰�->���� �߰� �� �����Ұ�
		books.setLibCode(0001);
		//���Ⱑ�ɿ��� ���� : ������� �ϸ� �ٷ� ������ ����
		books.setCurrentStatus("Y");
		//�뿩Ƚ�� : ó�� ����̱⿡ 0���� �ʱ�ȭ
		books.setRentalCount(0);
		//�뿩��¥ : ó�� ����̱⿡ 0���� �ʱ�ȭ
		books.setRentalDays(0);
		
		return dao.insertBook(books);
	}

	//��� ���(�����)��������
	@Override
	public List<Member> selectMember() {
		List<Member> list =dao.selectMember();
		for(int i=0;i<list.size();i++){
			Member member=list.get(i);
			member.setPhone1(member.getMemberPhone().substring(0, 3));
			member.setPhone2(member.getMemberPhone().substring(3, 7));
			member.setPhone3(member.getMemberPhone().substring(7, 11));
		}
		return list;
	}

	//ȸ�� ���� ������Ʈ(ȸ�� Ȯ�� �� ����)
	@Override
	public int updatePayMember(String[] memberId) {
		int result=0;
		for(int i=0;i<memberId.length;i++){
			result=dao.updatePayMember(memberId[i]);
		}
		
		return result;
	}

	//������ ��� ��������
	@Override
	public List<Lib> selectLibrary() {
		// TODO Auto-generated method stub
		return dao.selectLib();
	}
	
	//Admin ������������ & ���̵� ���üũ
	@Override
	public Admin selectAdmin(Admin admin) {
		logger.info(admin.toString());
		Admin returnAdmin = new Admin();
		//�Է� ���̵� ���
		String loginId = admin.getAdminId();
		String loginPw = admin.getAdminPw();
		System.out.println("�Է� ���̵� : "+ loginId+"�Է� ���: "+loginPw);
		//db���� ��������
		Admin getAdmin = dao.selectAdmin(loginId);
		String dbId = getAdmin.getAdminId();
		String dbPw = getAdmin.getAdminPw();
		int libCode = getAdmin.getLibCode();
		logger.info(getAdmin.toString());
		if(dbId.equals(loginId)){
			if(dbPw.equals(loginPw)){
				//���̵� ��� ������ ������ ������ admin���� ����
				returnAdmin.setAdminId(dbId);
				returnAdmin.setLibCode(libCode);
				returnAdmin.setResult(1);
			}else{
				returnAdmin.setResult(2);
			}
		}else{
			returnAdmin.setResult(3);
		}

		return returnAdmin;
	}
	//rent ��� ���� ��������
	@Override
	public Member rentMemberSelect(String memberId) {
		// TODO Auto-generated method stub
		return dao.rentMemberSelect(memberId);
	}
	//rent ���� ���� ��������
	@Override
	public Books rentBookSelect(String bookCode) {
		//�뿩������ : ������ ��¥
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nowDate=sdf.format(date);

		
		//�뿩 ������ : ���� ��¥ +3
		
		/*Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.getDateFormatSymbols());
		cal.add(Calendar.DATE, 3);
		System.out.println(cal.getTime());*/
	
		Books returnBooks = dao.rentBookSelect(bookCode);
		returnBooks.setRentalStartDay(nowDate);
	//	returnBooks.setRentalFinishDay(finishDate);
		return returnBooks;
	}

}