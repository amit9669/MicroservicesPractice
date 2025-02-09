package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable> {

	@Query("select s.companyStockPrice from StockPrice as s where s.companyName=:cName")
	Double findStockPriceByCompanyName(String cName);

}
