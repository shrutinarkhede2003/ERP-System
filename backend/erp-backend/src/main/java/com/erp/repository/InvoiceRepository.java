package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}