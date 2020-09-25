package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.State;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;


public interface StateDao extends GenericDao<State, Long> {
    public List<State> findByName(String name);
}


