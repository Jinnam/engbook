package com.blog.beast4307.service;

public class Lib {
	private int LIBCODE;
	private String LIBNAME;
	private String LIBLOCATION;
	
	
	public int getLIBCODE() {
		return LIBCODE;
	}


	public void setLIBCODE(int lIBCODE) {
		LIBCODE = lIBCODE;
	}


	public String getLIBNAME() {
		return LIBNAME;
	}


	public void setLIBNAME(String lIBNAME) {
		LIBNAME = lIBNAME;
	}


	public String getLIBLOCATION() {
		return LIBLOCATION;
	}


	public void setLIBLOCATION(String lIBLOCATION) {
		LIBLOCATION = lIBLOCATION;
	}


	@Override
	public String toString() {
		return "Lib [LIBCODE=" + LIBCODE + ", LIBNAME=" + LIBNAME + ", LIBLOCATION=" + LIBLOCATION + "]";
	}



	
}
