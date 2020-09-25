package ar.ucc.edu.arqsoftII.actividad2.dao;

import ar.ucc.edu.arqsoftII.actividad2.model.Invoice;
import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;

import java.util.List;

public interface InvoiceDao extends GenericDao<Invoice, Long> {
        public List<Invoice> findByNumber(Long number);
}
