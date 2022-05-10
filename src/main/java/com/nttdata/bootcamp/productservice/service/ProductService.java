package com.nttdata.bootcamp.productservice.service;

import com.nttdata.bootcamp.productservice.dto.Product;

public interface ProductService {
	
	Product get(String id);
	
	Product post(String id);

}
