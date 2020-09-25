package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.Detail;
import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class DetailImpDao extends GenericDaoImp<Detail,Long> implements DetailDao {

    @Override
    public List<Detail> findByProduct(Product product){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Detail> criteria = builder.createQuery(Detail.class);
        Root<Detail> entity = criteria.from(Detail.class);
        criteria.select(entity).where(builder.equal(entity.get("product"), product));
        return em.createQuery(criteria).getResultList();
    }

}
