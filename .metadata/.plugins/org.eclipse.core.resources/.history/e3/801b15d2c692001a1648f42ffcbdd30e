package com.cg.goris.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.goris.entity.RetailerInventoryEntity;


@Repository
public interface RetailerInventoryDao extends JpaRepository<RetailerInventoryEntity,String> {
  
 @Query("select r from RetailerInventoryEntity r where r.retailerId = ?1")
 List<RetailerInventoryEntity> getAll(Long retailerId);
}
