package com.itwillbs.dao;

import java.util.List;
import java.util.Map;

import com.itwillbs.domain.ProductDTO;

public interface ProductDAO {
	
	public List<ProductDTO> getPrdFromTheLatest();
	
	public List<ProductDTO> getPrdTopViews();
	
	public List<ProductDTO> getPrdTopWishList();
	
	public Map<String, Object> getProductInfo(String productNum);
	
	public List<Map<String, Object>> getSellerProduct(Map<String, Object> productMap);
}
