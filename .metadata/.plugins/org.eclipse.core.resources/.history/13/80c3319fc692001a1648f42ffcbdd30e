package com.cg.goris.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RETAILER_INVENTORY")
public class RetailerInventoryEntity {
	
	
	@Column(name = "RETAILER_ID", nullable = false)
	private long retailerId;

	@Column(name = "PRODUCT_CATEGORY", nullable = false)
	private String productCategory;
	
	@Id
	@Column(name = "PRODUCT_UID", nullable = false)
	private String productId;
	
	@Column(name = "PRODUCT_NAME", nullable = false)
	private String productName;
	
	@Column(name = "PRODUCT_QUANTITY", nullable = false)
	private Integer productQuantity;
	
	@Column(name = "TOTAL_AMOUNT", nullable = false)
	private Double totalAmount;

	@Column(name = "PRODUCT_RECEIVE_TIME", nullable = false)
	private long productReceiveTimeStamp; 


	public long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(long retailerId) {
		this.retailerId = retailerId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public long getProductReceiveTimeStamp() {
		return productReceiveTimeStamp;
	}

	public void setProductReceiveTimeStamp(long productReceiveTimeStamp) {
		this.productReceiveTimeStamp = productReceiveTimeStamp;
	}


	

	

	

	
	
	

}
