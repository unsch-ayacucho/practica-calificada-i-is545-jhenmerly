package edu.pe.unsch.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.unsch.dao.ProductDao;

import edu.pe.unsch.entities.Producto;

@Service("productService")
@Transactional
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductDao productDoa;
	@Override
	public Producto find(Integer id) {
		// TODO Auto-generated method stub
		return productDoa.find(id);
	}

}
