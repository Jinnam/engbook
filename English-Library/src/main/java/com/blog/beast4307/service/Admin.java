package com.blog.beast4307.service;

public class Admin {
	private String adminId;
	private String adminPw;
	private int libCode;
	private int result;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public int getLibCode() {
		return libCode;
	}
	public void setLibCode(int libCode) {
		this.libCode = libCode;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPw=" + adminPw + ", libCode=" + libCode + ", result=" + result
				+ "]";
	}
	
	
}
