package ar.ucc.edu.arqsoftII.actividad2.test.dao;


import ar.ucc.edu.arqsoftII.actividad2.dao.ProductDao;
import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class ProductDaoTest {
    private static final Logger logger = LogManager.getLogger(ProductDaoTest.class);

    @Autowired
    private ProductDao productDao;

    @Test
    public void testFindById() {
        logger.info("Test de busqueda de State por ID");
        Product product = ProductDao.load((long) 2);
        Assert.assertEquals("Heladera", product.getName());
        return;
    }

    @Test
    public void testRegister() {

        logger.info("Test de Registro de Product");
        Product product = new Product();
        product.setName("Cocina");
        product.setUnitPrice((double) 20000);

        ProductDao.insert(product);
        Assert.assertEquals(3, product.getId().longValue());
        return;
    }

    @Test
    public void testUpdate() {

        logger.info("Test de actualización de Product");
        Product product = ProductDao.load((long) 1);
        product.setName("Ventilador");
        ProductDao.update(product);

        Product product1 = ProductDao.load((long) 1);
        Assert.assertEquals("Ventilador", product1.getName());
        return;
    }

    @Test
    public void testfindByName() {

        logger.info("Test de busqueda de Product por Nombre");
        List<Product> products= ProductDao.findByName("Heladera");
        Assert.assertEquals(1, products.size());
        return;
    }

    @Test
    public void testGetAll() {

        logger.info("Test de busqueda de todos los Products");
        List<Product> products= ProductDao.getAll();
        Assert.assertNotNull(products);
        return;
    }
}
