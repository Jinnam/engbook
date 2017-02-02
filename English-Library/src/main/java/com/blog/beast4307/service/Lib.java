package com.blog.beast4307.service;

public class Lib {
	private int libCode;
	private String libName;
	private String libLocation;
	public int getLibCode() {
		return libCode;
	}
	public void setLibCode(int libCode) {
		this.libCode = libCode;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getLibLocation() {
		return libLocation;
	}
	public void setLibLocation(String libLocation) {
		this.libLocation = libLocation;
	}
	@Override
	public String toString() {
		return "Lib [libCode=" + libCode + ", libName=" + libName + ", libLocation=" + libLocation + "]";
	}
	
	
	
}
