package com.example.SMP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.SMP.DAOs.SanPhamDAO;
import com.example.SMP.models.SanPham;

@Controller

public class SanPhamController {
	@Autowired
	private SanPhamDAO sanphamDAO;
	
	@RequestMapping(name="/sanpham", method=RequestMethod.GET)
	public String getLisSanPham(Model model) {
		List<SanPham> list = sanphamDAO.listNhanVien();
		model.addAttribute("lstSanPham", list);
		return "sanpham";
	}
	
	
}
