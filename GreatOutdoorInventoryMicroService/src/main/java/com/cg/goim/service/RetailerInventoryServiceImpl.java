package com.cg.goim.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.goim.dao.RetailerInventoryDao;
import com.cg.goim.entity.RetailerInventoryEntity;
import com.cg.goim.exception.RetailerInventoryException;
import com.cg.goim.model.RetailerInventoryModel;


@Service
public class RetailerInventoryServiceImpl implements RetailerInventoryService{

	@Autowired
	private RetailerInventoryDao retailerDao;

	
	private RetailerInventoryModel of(RetailerInventoryEntity source) {
		RetailerInventoryModel result=null;
		if(source!=null) {
			result=new RetailerInventoryModel();
			result.setInventoryId(source.getInventoryId());
			result.setRetailerId(source.getRetailerId());
			result.setProductCategory(source.getProductCategory());
			result.setProductId(source.getProductId());
			result.setProductName(source.getProductName());
			result.setProductQuantity(source.getProductQuantity());
			result.setTotalAmount(source.getTotalAmount());
			result.setProductReceiveTimeStamp(source.getProductReceiveTimeStamp());
			result.setProductSaleTimeStamp(source.getProductSaleTimeStamp());
		}
		return result;
	}
	
	private RetailerInventoryEntity of(RetailerInventoryModel source) {
		RetailerInventoryEntity result=null;
		if(source!=null) {
			result=new RetailerInventoryEntity();
			result.setInventoryId(source.getInventoryId());
			result.setRetailerId(source.getRetailerId());
			result.setProductCategory(source.getProductCategory());
			result.setProductId(source.getProductId());
			result.setProductName(source.getProductName());
			result.setProductQuantity(source.getProductQuantity());
			result.setTotalAmount(source.getTotalAmount());
			result.setProductReceiveTimeStamp(source.getProductReceiveTimeStamp());
			result.setProductSaleTimeStamp(source.getProductSaleTimeStamp());
		}
		return result;
	}

	@Override
	public RetailerInventoryModel addProduct(RetailerInventoryModel product) throws RetailerInventoryException {
		if(product!=null) {
			if(retailerDao.findByProductIdAndRetailerId(product.getProductId(), product.getRetailerId()).isPresent()) {
				throw new RetailerInventoryException("There exists a product with the given ID");
			}
			else{
				product=of(retailerDao.save(of(product)));
			}
		}
		return product;
	}

	@Override
	public RetailerInventoryModel updateProductStock(RetailerInventoryModel product) throws RetailerInventoryException {
		if(product!=null) {
			Optional<RetailerInventoryEntity> entity=retailerDao.findByProductIdAndRetailerId(product.getProductId(), product.getRetailerId());
			RetailerInventoryModel oldStock=entity.isPresent()?of(entity.get()):null;
			if(oldStock==null) {
				throw new RetailerInventoryException("There does not exists a product with the given ID");
			}
			else {
				product=of(retailerDao.save(of(product)));
			}
		}
		return product;
	}

	@Override
	public List<RetailerInventoryModel> getAllByRetailerId(String retailerId) {
		
		return retailerDao.findAllByRetailerId(retailerId).stream().map((entity)->of(entity)).collect(Collectors.toList());
	}

	@Override
	public RetailerInventoryModel findProductByInventoryId(String inventoryId) {
	
		return of(retailerDao.findById(inventoryId).orElse(null));
	}

	@Override
	public void deleteInventoryById(String inventoryId) {
		retailerDao.deleteById(inventoryId);
		
	}


	/*public RetailerInventoryModel findProductById(String id) {
		return of(retailerDao.findById(id).orElse(null));
	}*/



	
}
