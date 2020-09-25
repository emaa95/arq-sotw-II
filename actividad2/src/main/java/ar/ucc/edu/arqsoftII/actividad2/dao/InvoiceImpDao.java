package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.Invoice;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class InvoiceImpDao extends GenericDaoImp<Invoice,Long> implements InvoiceDao {

    @Override
    public List<Invoice> findByNumber(Long number){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Invoice> criteria = builder.createQuery(Invoice.class);
        Root<Invoice> entity = criteria.from(Invoice.class);
        criteria.select(entity).where(builder.equal(entity.get("number"), number));
        return em.createQuery(criteria).getResultList();
    }


}
