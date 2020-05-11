package com.cg.goris.service;


import java.util.List;

import com.cg.goris.entity.RetailerInventoryEntity;
import com.cg.goris.exception.RetailerInventoryException;
import com.cg.goris.model.RetailerInventoryModel;

public interface RetailerInventoryService {
	public RetailerInventoryModel addProduct(RetailerInventoryModel product) throws RetailerInventoryException;
    public RetailerInventoryModel updateProductStock(RetailerInventoryModel productStock) throws RetailerInventoryException;
//	public RetailerInventoryModel updateSaleTime(RetailerInventoryModel saleTime) throws RetailerInventoryException;
//    public RetailerInventoryModel findByProductId(long productId);
	public RetailerInventoryModel findProductById(String id);
	public List<RetailerInventoryModel> findAllProducts();
	public void deleteProductById(String id);
	public List<RetailerInventoryEntity> getAll(Long retailerId);

}
