package ar.ucc.edu.arqsoftII.actividad2.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ar.ucc.edu.arqsoftII.actividad2.model.User;
import ar.ucc.edu.arqsoftII.common.dao.GenericDaoImp;
import org.springframework.stereotype.Repository;


@Repository
public class UserImpDao extends GenericDaoImp<User, Long> implements UserDao{

	@Override
	public List<User> findByName(String name) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        Root<User> entity = criteria.from(User.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();
	}
}
