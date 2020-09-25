package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.actividad2.model.User;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;

public interface ProductDao extends GenericDao<Product, Long> {
    public List<Product> findByName(String name);
}
