package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.Payment;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

public class PaymentImpDao extends GenericDaoImp<Payment, Long> implements PaymentDao{
    @Override
    public List<Payment> findByDate(Date date) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Payment> criteria = builder.createQuery(Payment.class);
        Root<Payment> entity = criteria.from(Payment.class);

        criteria.select(entity).where(builder.equal(entity.get("date"), date));
        return em.createQuery(criteria).getResultList();
    }
}