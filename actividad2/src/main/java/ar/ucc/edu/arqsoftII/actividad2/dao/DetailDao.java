package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.Detail;
import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;

public interface DetailDao extends GenericDao<Detail, Long> {
    public List<Detail> findByProduct(Product product);
}
