package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.Service;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;

public interface ServiceDao extends GenericDao<Service, Long> {
    public List<Service> findByName(String name);
}
