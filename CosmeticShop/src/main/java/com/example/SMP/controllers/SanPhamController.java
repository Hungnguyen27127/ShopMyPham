package com.example.SMP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.SMP.models.SanPham;
import com.example.SMP.service.productService;
 
@Controller
 public class SanPhamController {
	
	private static String PAGE_PRODUCT = "sanpham";
	
	
	@Autowired
	private productService prService;
	
	@RequestMapping(name="/sanpham", method=RequestMethod.GET)
	public String getLisSanPham(Model model) {
		List<SanPham> lstProduct = prService.getListProduct();
		model.addAttribute("lstProduct", lstProduct);
		return "PAGE_PRODUCT";
	}
	
	
}
