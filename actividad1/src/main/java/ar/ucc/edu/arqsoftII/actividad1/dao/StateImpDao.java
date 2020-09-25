package ar.ucc.edu.arqsoftII.actividad1.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ar.ucc.edu.arqsoftII.actividad1.model.State;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;
import org.springframework.stereotype.Repository;



@Repository
public class StateImpDao extends GenericDaoImp<State, Long> implements StateDao{

    @Override
    public List<State> findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<State> criteria = builder.createQuery(State.class);
        Root<State> entity = criteria.from(State.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();
    }
}