package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StockPriceService;

@RestController
public class StockCalcController {
	
	@Autowired
	private StockPriceService priceService;
	
	@GetMapping("/calc/{cName}/{quantity}")
	public ResponseEntity<?> getstocksCost(@PathVariable String cName,@PathVariable Integer quantity){
		return new ResponseEntity<>(priceService.getStocksCost(cName, quantity),HttpStatus.OK);
	}

}
