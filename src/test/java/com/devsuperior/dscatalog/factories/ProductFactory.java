package com.devsuperior.dscatalog.factories;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

import java.time.Instant;

public class ProductFactory {

    public static Product createProduct(){
        Product product = new Product(1L,"Phone","Good Phone",800.00,
                "https://img.com.png", Instant.parse("2020-10-20T03:00:00Z"));
        product.getCategories().add(createCategory());

        return product;
    }

    public static ProductDTO createProductDTO(){
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }

    public static Category createCategory(){
        return new Category(1L, "Eletronics");
    }
}
