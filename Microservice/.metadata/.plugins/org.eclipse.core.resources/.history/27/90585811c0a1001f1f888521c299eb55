package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.binding.StockPriceResponse;

@FeignClient(name="Stock-Price-API")
public interface StockPriceClient {

	@GetMapping("/stockPrice/{cName}")
	public StockPriceResponse invokeStockPriceAPI(@PathVariable String cName);
}
