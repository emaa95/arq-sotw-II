package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.Customer;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CustomerImpDao extends GenericDaoImp<Customer, Long> implements CustomerDao{
    @Override
    public List<Customer> findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
        Root<Customer> entity = criteria.from(Customer.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();
    }
}
