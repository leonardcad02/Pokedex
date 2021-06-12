package com.pokedexApiRest.domain.service;


import com.pokedexApiRest.domain.Product;
import com.pokedexApiRest.persistence.ProductoRepository;
import com.pokedexApiRest.persistence.crud.ProductoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ProductService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Product> getAll(){
        return productoRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productoRepository.getProduct(productId);
    }
    public Optional<List<Product>> getByCategory(int categoryId){
        return productoRepository.getByCategory(categoryId);
    }

    public Product save(Product product){
        return productoRepository.save(product);
    }
    public boolean delete (int productid){
        return getProduct(productid).map(product -> {
            productoRepository.delete(productid);
            return true;
        }).orElse(false);
    }
}
