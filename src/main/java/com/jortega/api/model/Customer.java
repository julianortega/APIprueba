package com.jortega.api.model;

import javax.persistence.*;

@Entity
public class Customer {

	private @Id @GeneratedValue Long id;
	
	@Column(nullable=false)
	private String docType;
	
	@Column(nullable=false, unique=true)
	private String docNum;
	
	@Column(nullable=false, unique=true)
	private String email;
	
	@Column(nullable=false, unique=true)
	private Long customerId;
	
	private String givenName;
	
	private String familyName1;
	
	private Long phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName1() {
		return familyName1;
	}

	public void setFamilyName1(String familyName1) {
		this.familyName1 = familyName1;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
}
