package ar.ucc.edu.arqsoftII.actividad2.test.service;

import ar.ucc.edu.arqsoftII.actividad2.dto.ProductRequestDto;
import ar.ucc.edu.arqsoftII.actividad2.dto.ProductResponseDto;
import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.actividad2.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class ProductServiceTest {

    @Autowired
    private ProductService stateService;

    @Test
    public void testFindById() {
        ProductResponseDto response = ProductService.getStateById((long) 2);

        Assert.assertEquals("Heladera", response.getName());
        return;
    }

    @Test
    public void testInsert() {
        ProductRequestDto request = new ProductRequestDto();
        request.setName("Catamarca");

        ProductResponseDto response = ProductService.insertProduct(request);

        Assert.assertEquals("Cocina",response.getName());
        return;
    }
}
