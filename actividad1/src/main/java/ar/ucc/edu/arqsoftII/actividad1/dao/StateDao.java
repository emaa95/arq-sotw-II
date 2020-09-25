package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.State;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;


public interface StateDao extends GenericDao<State, Long> {
    public List<State> findByName(String name);
}


