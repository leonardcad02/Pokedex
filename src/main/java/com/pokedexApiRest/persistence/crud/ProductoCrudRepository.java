package com.pokedexApiRest.persistence.crud;

import com.pokedexApiRest.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.xml.validation.Validator;
import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository  extends CrudRepository<Producto, Integer> {
    //@Query(value = "Select * FROM productos WHERE id_categoria = ?", nativeQuery = true)

     List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
     Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);



}
