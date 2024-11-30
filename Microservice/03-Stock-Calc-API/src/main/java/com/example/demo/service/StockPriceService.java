package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.binding.StockCalcResponse;
import com.example.demo.binding.StockPriceResponse;
import com.example.demo.client.StockPriceClient;

@Service
public class StockPriceService {

	@Autowired
	private StockPriceClient client;
	
	@Autowired
	private Environment environment;
	
	public StockCalcResponse getStocksCost(String cName, Integer quantity) {
		
		StockCalcResponse response = new StockCalcResponse();
		
		StockPriceResponse priceResponse  = client.invokeStockPriceAPI(cName);
		
		Double companyStockPrice = priceResponse.getCompanyStockPrice();
		
		Double totalCost = companyStockPrice * quantity;
		
		response.setCompanyName(cName);
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);
		response.setPortNumber(priceResponse.getPortNumber());
		
		return response;
	}
}
