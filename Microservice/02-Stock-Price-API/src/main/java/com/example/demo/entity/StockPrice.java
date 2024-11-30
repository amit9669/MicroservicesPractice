package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_price")
public class StockPrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_price_id")
	private Long stockPriceId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "comapny_stock_price")
	private Double companyStockPrice;

	public Long getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(Long stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyStockPrice() {
		return companyStockPrice;
	}

	public void setCompanyStockPrice(Double companyStockPrice) {
		this.companyStockPrice = companyStockPrice;
	}
}
