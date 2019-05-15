package com.example.SMP.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SMP.DAOs.SanPhamDAO;
import com.example.SMP.models.SanPham;
import com.example.SMP.service.productService;

@Repository
public class productServiceImpl implements productService {
	
	@Autowired
	private SanPhamDAO spDAO;
	
	@Override
	public List<SanPham> getListProduct() {
		
		List<SanPham> lstProduct = spDAO.lstProduct();
 		return lstProduct;
	}

}
