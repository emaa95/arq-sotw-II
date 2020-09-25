package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.Customer;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;

public interface CustomerDao extends GenericDao<Customer, Long> {
    public List<Customer> findByName(String name);
}
