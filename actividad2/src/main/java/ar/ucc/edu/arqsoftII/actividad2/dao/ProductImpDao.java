package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ProductImpDao extends GenericDaoImp<Product,Long> implements ProductDao {

    @Override
    public List<Product> findByName(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
        Root<Product> entity = criteria.from(Product.class);
        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();


    }
}

