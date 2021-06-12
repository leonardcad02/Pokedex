package com.pokedexApiRest.persistence.mapper;

import com.pokedexApiRest.domain.Category;
import com.pokedexApiRest.persistence.entity.Categorias;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Categorias categorias);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categorias toCategoria(Category category);
}
