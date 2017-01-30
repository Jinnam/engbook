package com.blog.beast4307.service;

public class Member {
	private String MEMBERID;
	private String MEMBERPW;
	private String MEMBERNAME;
	private int MEMBERBIRTHDAY;
	private String MEMBERPHONE;
	private String PHONE1;
	private String PHONE2;
	private String PHONE3;
	private String MEMBERADDR;
	private String JOINDAY;
	private int LIBCODE;
	private int RENTALCOUNT;
	private String MEMBERPAYMENTSTATUS;
	
	public String getPHONE1() {
		return PHONE1;
	}
	public void setPHONE1(String pHONE1) {
		PHONE1 = pHONE1;
	}
	public String getPHONE2() {
		return PHONE2;
	}
	public void setPHONE2(String pHONE2) {
		PHONE2 = pHONE2;
	}
	public String getPHONE3() {
		return PHONE3;
	}
	public void setPHONE3(String pHONE3) {
		PHONE3 = pHONE3;
	}
	public String getMEMBERID() {
		return MEMBERID;
	}
	public void setMEMBERID(String mEMBERID) {
		MEMBERID = mEMBERID;
	}
	public String getMEMBERPW() {
		return MEMBERPW;
	}
	public void setMEMBERPW(String mEMBERPW) {
		MEMBERPW = mEMBERPW;
	}
	public String getMEMBERNAME() {
		return MEMBERNAME;
	}
	public void setMEMBERNAME(String mEMBERNAME) {
		MEMBERNAME = mEMBERNAME;
	}
	public int getMEMBERBIRTHDAY() {
		return MEMBERBIRTHDAY;
	}
	public void setMEMBERBIRTHDAY(int mEMBERBIRTHDAY) {
		MEMBERBIRTHDAY = mEMBERBIRTHDAY;
	}
	public String getMEMBERPHONE() {
		return MEMBERPHONE;
	}
	public void setMEMBERPHONE(String mEMBERPHONE) {
		MEMBERPHONE = mEMBERPHONE;
	}
	public String getMEMBERADDR() {
		return MEMBERADDR;
	}
	public void setMEMBERADDR(String mEMBERADDR) {
		MEMBERADDR = mEMBERADDR;
	}
	public String getJOINDAY() {
		return JOINDAY;
	}
	public void setJOINDAY(String jOINDAY) {
		JOINDAY = jOINDAY;
	}
	public int getLIBCODE() {
		return LIBCODE;
	}
	public void setLIBCODE(int lIBCODE) {
		LIBCODE = lIBCODE;
	}
	public int getRENTALCOUNT() {
		return RENTALCOUNT;
	}
	public void setRENTALCOUNT(int rENTALCOUNT) {
		RENTALCOUNT = rENTALCOUNT;
	}
	public String getMEMBERPAYMENTSTATUS() {
		return MEMBERPAYMENTSTATUS;
	}
	public void setMEMBERPAYMENTSTATUS(String mEMBERPAYMENTSTATUS) {
		MEMBERPAYMENTSTATUS = mEMBERPAYMENTSTATUS;
	}
	@Override
	public String toString() {
		return "Member [MEMBERID=" + MEMBERID + ", MEMBERPW=" + MEMBERPW + ", MEMBERNAME=" + MEMBERNAME
				+ ", MEMBERBIRTHDAY=" + MEMBERBIRTHDAY + ", MEMBERPHONE=" + MEMBERPHONE + ", MEMBERADDR=" + MEMBERADDR
				+ ", JOINDAY=" + JOINDAY + ", LIBCODE=" + LIBCODE + ", RENTALCOUNT=" + RENTALCOUNT
				+ ", MEMBERPAYMENTSTATUS=" + MEMBERPAYMENTSTATUS + "]";
	}
	
}
