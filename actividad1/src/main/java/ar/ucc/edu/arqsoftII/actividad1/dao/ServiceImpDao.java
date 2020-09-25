package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.Service;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ServiceImpDao extends GenericDaoImp<Service, Long> implements ServiceDao{
    @Override
    public List<Service> findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Service> criteria = builder.createQuery(Service.class);
        Root<Service> entity = criteria.from(Service.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();
    }
}
