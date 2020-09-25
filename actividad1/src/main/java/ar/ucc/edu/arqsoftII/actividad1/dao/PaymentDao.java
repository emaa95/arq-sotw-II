package ar.ucc.edu.arqsoftII.actividad1.dao;

import ar.ucc.edu.arqsoftII.actividad1.model.Payment;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.Date;
import java.util.List;

public interface PaymentDao extends GenericDao<Payment, Long> {
        public List<Payment> findByDate(Date date);
}
