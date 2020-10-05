package ar.ucc.edu.arqsoftII.actividad2.service;

import ar.ucc.edu.arqsoftII.actividad2.dao.ProductDao;
import ar.ucc.edu.arqsoftII.actividad2.dto.ProductRequestDto;
import ar.ucc.edu.arqsoftII.actividad2.dto.ProductResponseDto;
import ar.ucc.edu.arqsoftII.actividad2.model.Product;
import ar.ucc.edu.arqsoftII.common.dao.GenericDao;
import ar.ucc.edu.arqsoftII.common.dto.ModelDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public ProductResponseDto getStateById(Long id) {
        Product product = ProductDao.load(id);

        ProductResponseDto response = (ProductResponseDto) new ModelDtoConverter().convertToDto(product, new ProductResponseDto());
        return response;
    }


    public ProductResponseDto insertProduct(ProductRequestDto request) {

        Product product = (Product) new ModelDtoConverter().convertToEntity(new Product(), request);

        ProductDao.insert(product);

        ProductResponseDto response = (ProductResponseDto) new ModelDtoConverter().convertToDto(product, new ProductResponseDto());

        return response;
    }
}
