package com.cg.goris.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.goris.entity.RetailerInventoryEntity;
import com.cg.goris.exception.RetailerInventoryException;
import com.cg.goris.model.RetailerInventoryModel;
import com.cg.goris.service.RetailerInventoryService;

@RestController
@RequestMapping("/inventory")
@CrossOrigin
public class RetailerInventoryController {

	@Autowired
	private RetailerInventoryService retailerService;
	
	@PostMapping
	public ResponseEntity<RetailerInventoryModel> createProduct(@Valid @RequestBody RetailerInventoryModel inventory) throws RetailerInventoryException{
		System.out.print(inventory.toString());
		inventory=retailerService.addProduct(inventory);
		return new ResponseEntity<>(inventory,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<RetailerInventoryModel>> getAllProdcuts(){
		
		return new ResponseEntity<>(retailerService.findAllProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/{retailerId}")
	public List<RetailerInventoryEntity> getRetailerId(@PathVariable Long retailerId){
	    return retailerService.getAll(retailerId);
	}
	
	@PutMapping
	public ResponseEntity<RetailerInventoryModel> updateTrainee(@RequestBody RetailerInventoryModel productStock) throws RetailerInventoryException {
		productStock = retailerService.updateProductStock(productStock);
		return new ResponseEntity<>(productStock, HttpStatus.OK);
	}
	
	@GetMapping("/{id:[A-Z][A-Z][0-9]{1,6}}")
	public ResponseEntity<RetailerInventoryModel> findById(@PathVariable("id") String productId) {
		
		ResponseEntity<RetailerInventoryModel> response = null;

		RetailerInventoryModel product = retailerService.findProductById(productId);

		if (product == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(product, HttpStatus.OK);
		}
  
		return response;
	}
	
	@DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("productId") String productId) {

        ResponseEntity<Void> response = null;

        RetailerInventoryModel product = retailerService.findProductById(productId);

        if (product == null) {
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            retailerService.deleteProductById(productId);
            response = new ResponseEntity<>(HttpStatus.OK);
        }

        return response;
    }
	
//	@GetMapping("/{ids:[1-9][0-9]{1,4}}")
//	public ResponseEntity<RetailerInventoryModel> findByProductId(@PathVariable("ids") Long productId) {
//		
//		ResponseEntity<RetailerInventoryModel> response = null;
//
//		RetailerInventoryModel product = retailerService.findByProductId(productId);
//
//		if (product == null) {
//			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		} else {
//			response = new ResponseEntity<>(product, HttpStatus.OK);
//		}
//
//		return response;
//	}
	
	
}
