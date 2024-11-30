package com.example.demo.binding;

import lombok.*;

@Data
@Getter
@Setter
public class StockPriceResponse {

	private String companyName;
	private Double companyStockPrice;
	private Integer portNumber;
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
	public Integer getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

}
