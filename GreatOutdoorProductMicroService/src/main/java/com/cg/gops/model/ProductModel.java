package com.cg.gops.model;

import com.cg.gops.entity.ProductCategory;

public class ProductModel {
	
	    private String productId;
	    private String productName;
	    private Integer productPrice;
	    private String productColor;
	    private ProductCategory productCategory;
	    private Integer productQuantity;
	    private String productSpecification;
	    
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
		public Integer getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(Integer productPrice) {
			this.productPrice = productPrice;
		}
		public String getProductColor() {
			return productColor;
		}
		public void setProductColor(String productColor) {
			this.productColor = productColor;
		}
		public ProductCategory getProductCategory() {
			return productCategory;
		}
		public void setProductCategory(ProductCategory productCategory) {
			this.productCategory = productCategory;
		}
		public Integer getProductQuantity() {
			return productQuantity;
		}
		public void setProductQuantity(Integer productQuantity) {
			this.productQuantity = productQuantity;
		}
		public String getProductSpecification() {
			return productSpecification;
		}
		public void setProductSpecification(String productSpecification) {
			this.productSpecification = productSpecification;
		}
	    
	    

}
