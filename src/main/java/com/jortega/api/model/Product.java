package com.jortega.api.model;

import javax.persistence.*;

@Entity
public class Product {

	private @Id @GeneratedValue Long id;
	
	@Column(nullable=false)
	private String productName;
	
	@Column(nullable=false)
	private String productTypeName;
	
	@Column(nullable=false)
	private Long numeracioTerminal;
	
	@Column(nullable=false)
	private String soldAt;
	
	@Column(nullable=false)
	private Long customerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public Long getNumeracioTerminal() {
		return numeracioTerminal;
	}

	public void setNumeracioTerminal(Long numeracioTerminal) {
		this.numeracioTerminal = numeracioTerminal;
	}

	public String getSoldAt() {
		return soldAt;
	}

	public void setSoldAt(String soldAt) {
		this.soldAt = soldAt;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}
