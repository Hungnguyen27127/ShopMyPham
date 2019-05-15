package com.example.SMP.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SanPham")
public class SanPham {
	@Id
	@GeneratedValue
	@Column(name = "IDSanPham", nullable = false)
	private int idsanpham;	
	@Column(name = "TenSanPham", nullable = true)
	private String tensanpham;
	@Column(name = "IDLoaiSanPham", nullable = true)
	private int idloaisanpham;
	@Column(name = "AnhSanPham", nullable = true)
	private String anhsanpham;
	@Column(name = "ThuongHieu", nullable = true)
	private String thuonghieu;
	@Column(name = "NoiSanXuat", nullable = true)
	private String noisanxuat;
	@Column(name = "HanSuDung", nullable = true)
	private String hansudung;
	@Column(name = "TrongLuong", nullable = true)
	private String trongluong;
	@Column(name = "HDSuDung", nullable = true)
	private String hdsudung;
	@Column(name = "HDBaoQuan", nullable = true)
	private String hdbaoquan;
	@Column(name = "TrangThai", nullable = true)
	private Boolean trangthai;
	@Column(name = "MoTa", nullable = true)
	private String mota;
	@Column(name = "GiaBan", nullable = true)
	private BigDecimal giaban;
	@Column(name = "GiaKhuyenMai", nullable = true)
	private BigDecimal giakhuyenmai;
	public int getIdsanpham() {
		return idsanpham;
	}
	public void setIdsanpham(int idsanpham) {
		this.idsanpham = idsanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public int getIdloaisanpham() {
		return idloaisanpham;
	}
	public void setIdloaisanpham(int idloaisanpham) {
		this.idloaisanpham = idloaisanpham;
	}
	public String getAnhsanpham() {
		return anhsanpham;
	}
	public void setAnhsanpham(String anhsanpham) {
		this.anhsanpham = anhsanpham;
	}
	public String getThuonghieu() {
		return thuonghieu;
	}
	public void setThuonghieu(String thuonghieu) {
		this.thuonghieu = thuonghieu;
	}
	public String getNoisanxuat() {
		return noisanxuat;
	}
	public void setNoisanxuat(String noisanxuat) {
		this.noisanxuat = noisanxuat;
	}
	public String getHansudung() {
		return hansudung;
	}
	public void setHansudung(String hansudung) {
		this.hansudung = hansudung;
	}
	public String getTrongluong() {
		return trongluong;
	}
	public void setTrongluong(String trongluong) {
		this.trongluong = trongluong;
	}
	public String getHdsudung() {
		return hdsudung;
	}
	public void setHdsudung(String hdsudung) {
		this.hdsudung = hdsudung;
	}
	public String getHdbaoquan() {
		return hdbaoquan;
	}
	public void setHdbaoquan(String hdbaoquan) {
		this.hdbaoquan = hdbaoquan;
	}
	public Boolean getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(Boolean trangthai) {
		this.trangthai = trangthai;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public BigDecimal getGiaban() {
		return giaban;
	}
	public void setGiaban(BigDecimal giaban) {
		this.giaban = giaban;
	}
	public BigDecimal getGiakhuyenmai() {
		return giakhuyenmai;
	}
	public void setGiakhuyenmai(BigDecimal giakhuyenmai) {
		this.giakhuyenmai = giakhuyenmai;
	}

}
