package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.bindings.StockPriceResponse;
import com.example.demo.repository.StockPriceRepository;
import com.example.demo.service.StockPriceService;

@Service
public class StockPriceServiceImpl implements StockPriceService{
	
	@Autowired
	private StockPriceRepository priceRepository;
	
	@Autowired
	private Environment environment;

	@Override
	public StockPriceResponse getStockPrice(String companyName) {
		// TODO Auto-generated method stub
		
		Double stockPrice = priceRepository.findStockPriceByCompanyName(companyName);
		
		StockPriceResponse priceResponse = new StockPriceResponse();
		priceResponse.setCompanyName(companyName);
		priceResponse.setCompanyStockPrice(stockPrice);
		priceResponse.setPortNumber(Integer.parseInt(environment.getProperty("server.port")));
		return priceResponse;
	}

}
