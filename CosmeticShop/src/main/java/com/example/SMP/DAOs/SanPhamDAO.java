package com.example.SMP.DAOs;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.SMP.models.SanPham;

@Repository
@Transactional
public class SanPhamDAO extends JdbcDaoSupport{
	@Autowired
	private SessionFactory sessionFactory;
	public SanPhamDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public List<SanPham> listNhanVien(){
		String sql = "from SanPham";
		Session session = this.sessionFactory.getCurrentSession();
		Query<SanPham> query = session.createQuery(sql, SanPham.class);
		return query.getResultList();
	}
}
