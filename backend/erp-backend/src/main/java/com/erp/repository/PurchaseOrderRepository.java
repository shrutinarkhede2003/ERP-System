package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.entity.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

}