package com.nttdata.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nttdata.bootcamp.productservice.dto.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${bootcamp.price-service.url.port}")
	private String endopoint;
	
	private final RestTemplate restTemplate= new RestTemplate();
	
	public Product getProductId (String id) {
		Product product = new Product();
		product.setProductId(id);
		
		product.setChannel("GET");
		product.setServerPort(serverPort);
		
		return product;
	}
	
	public Product post(String id) {
		Product product = new Product();
		product.setProductId(id);
		return product;
	}

	@Override
	public Product get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
