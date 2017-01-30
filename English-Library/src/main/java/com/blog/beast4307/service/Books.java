package com.blog.beast4307.service;

public class Books {
	private int BOOKCODE;
	private int LIBCODE;
	private String BOOKNAME;
	private String WRITER;
	private String PUBLISHER;
	private String CATEGORY;
	private String GENRE;
	private String BOOKLOCATION;
	private String CURRENTSTATUS;
	private String FIRSTRENTALDAY;
	private int RENTALCOUNT;
	private int RENTALDAYS;
	public int getBOOKCODE() {
		return BOOKCODE;
	}
	public void setBOOKCODE(int bOOKCODE) {
		BOOKCODE = bOOKCODE;
	}
	public int getLIBCODE() {
		return LIBCODE;
	}
	public void setLIBCODE(int lIBCODE) {
		LIBCODE = lIBCODE;
	}
	public String getBOOKNAME() {
		return BOOKNAME;
	}
	public void setBOOKNAME(String bOOKNAME) {
		BOOKNAME = bOOKNAME;
	}
	public String getWRITER() {
		return WRITER;
	}
	public void setWRITER(String wRITER) {
		WRITER = wRITER;
	}
	public String getPUBLISHER() {
		return PUBLISHER;
	}
	public void setPUBLISHER(String pUBLISHER) {
		PUBLISHER = pUBLISHER;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public String getGENRE() {
		return GENRE;
	}
	public void setGENRE(String gENRE) {
		GENRE = gENRE;
	}
	public String getBOOKLOCATION() {
		return BOOKLOCATION;
	}
	public void setBOOKLOCATION(String bOOKLOCATION) {
		BOOKLOCATION = bOOKLOCATION;
	}
	public String getCURRENTSTATUS() {
		return CURRENTSTATUS;
	}
	public void setCURRENTSTATUS(String cURRENTSTATUS) {
		CURRENTSTATUS = cURRENTSTATUS;
	}
	public String getFIRSTRENTALDAY() {
		return FIRSTRENTALDAY;
	}
	public void setFIRSTRENTALDAY(String fIRSTRENTALDAY) {
		FIRSTRENTALDAY = fIRSTRENTALDAY;
	}
	public int getRENTALCOUNT() {
		return RENTALCOUNT;
	}
	public void setRENTALCOUNT(int rENTALCOUNT) {
		RENTALCOUNT = rENTALCOUNT;
	}
	public int getRENTALDAYS() {
		return RENTALDAYS;
	}
	public void setRENTALDAYS(int rENTALDAYS) {
		RENTALDAYS = rENTALDAYS;
	}
	@Override
	public String toString() {
		return "Books [BOOKCODE=" + BOOKCODE + ", LIBCODE=" + LIBCODE + ", BOOKNAME=" + BOOKNAME + ", WRITER=" + WRITER
				+ ", PUBLISHER=" + PUBLISHER + ", CATEGORY=" + CATEGORY + ", GENRE=" + GENRE + ", BOOKLOCATION="
				+ BOOKLOCATION + ", CURRENTSTATUS=" + CURRENTSTATUS + ", FIRSTRENTALDAY=" + FIRSTRENTALDAY
				+ ", RENTALCOUNT=" + RENTALCOUNT + ", RENTALDAYS=" + RENTALDAYS + "]";
	}
	
	
}
