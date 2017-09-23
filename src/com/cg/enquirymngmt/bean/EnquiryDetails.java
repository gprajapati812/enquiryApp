package com.cg.enquirymngmt.bean;

public class EnquiryDetails {

	private int enId;
	private String en_fName;
	private String en_lName;
	private long en_phone;
	private String domain;
	public int getEnId() {
		return enId;
	}
	public void setEnId(int enId) {
		this.enId = enId;
	}
	public String getEn_fName() {
		return en_fName;
	}
	public void setEn_fName(String en_fName) {
		this.en_fName = en_fName;
	}
	public String getEn_lName() {
		return en_lName;
	}
	public void setEn_lName(String en_lName) {
		this.en_lName = en_lName;
	}
	public long getEn_phone() {
		return en_phone;
	}
	public void setEn_phone(long en_phone) {
		this.en_phone = en_phone;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "" + enId + "\t" + en_fName
				+ "\t" + en_lName + "\t" + en_phone
				+ "\t" + domain ;
	}
	
}
