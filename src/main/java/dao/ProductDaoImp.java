package edu.pe.unsch.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import edu.pe.unsch.entities.Producto;
@Repository("productDao")
public class ProductDaoImp implements ProductDao{

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public Producto find(Integer id) {
		// TODO Auto-generated method stub
		return entityManager 
				.find(Producto.class, id);
	}

}
