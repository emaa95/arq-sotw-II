package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.User;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;



public interface UserDao extends GenericDao<User, Long> {
    
    public List<User> findByName(String name);
}
