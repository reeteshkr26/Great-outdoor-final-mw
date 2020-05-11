package com.cg.goris.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.goris.dao.RetailerInventoryDao;
import com.cg.goris.entity.RetailerInventoryEntity;
import com.cg.goris.exception.RetailerInventoryException;
import com.cg.goris.model.RetailerInventoryModel;

@Service
public class RetailerInventoryServiceImpl implements RetailerInventoryService{

	@Autowired
	private RetailerInventoryDao retailerDao;
	
//	@Autowired
//	private RestTemplate rest;
//	
//	@Value("${url}")
//	private String url;
	
	private RetailerInventoryModel of(RetailerInventoryEntity source) {
		RetailerInventoryModel result=null;
		if(source!=null) {
			result=new RetailerInventoryModel();
			result.setRetailerId(source.getRetailerId());
			result.setProductCategory(source.getProductCategory());
			result.setProductId(source.getProductId());
			result.setProductName(source.getProductName());
			result.setProductQuantity(source.getProductQuantity());
			result.setTotalAmount(source.getTotalAmount());
			result.setProductReceiveTimeStamp(source.getProductReceiveTimeStamp());
		}
		return result;
	}
	
	private RetailerInventoryEntity of(RetailerInventoryModel source) {
		RetailerInventoryEntity result=null;
		if(source!=null) {
			result=new RetailerInventoryEntity();
			result.setRetailerId(source.getRetailerId());
			result.setProductCategory(source.getProductCategory());
			result.setProductId(source.getProductId());
			result.setProductName(source.getProductName());
			result.setProductQuantity(source.getProductQuantity());
			result.setTotalAmount(source.getTotalAmount());
			result.setProductReceiveTimeStamp(source.getProductReceiveTimeStamp());
		}
		return result;
	}

	@Override
	public RetailerInventoryModel addProduct(RetailerInventoryModel product) throws RetailerInventoryException {
		if(product!=null) {
			if(retailerDao.existsById(product.getProductId())) {
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
			RetailerInventoryModel oldStock=of(retailerDao.findById(product.getProductId()).orElse(null));
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
	public RetailerInventoryModel findProductById(String id) {
		return of(retailerDao.findById(id).orElse(null));
	}

	@Override
	public void deleteProductById(String id) {
		retailerDao.deleteById(id);
		
	}

	@Override
	public List<RetailerInventoryModel> findAllProducts() {
		return retailerDao.findAll().stream().map(entity->of(entity)).collect(Collectors.toList());
	}

    @Override
    public List<RetailerInventoryEntity> getAll(Long retailerId) {
        return retailerDao.getAll(retailerId);
    }

//	@Override
//	public RetailerInventoryModel findByProductId(long productId) {
//		return of(retailerDao.findByProductId(productId));
//	}

	
}
