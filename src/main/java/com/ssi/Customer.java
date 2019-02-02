package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String code;
	private String cname;
	private Address caddress;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getCaddress() {
		return caddress;
	}
	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}
	public Customer(String code, String cname, Address caddress) {
		super();
		this.code = code;
		this.cname = cname;
		this.caddress = caddress;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", cname=" + cname + ", caddress="
				+ caddress + "]";
	}

}
