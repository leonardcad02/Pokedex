package com.pokedexApiRest.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id-categoria")
    private Integer idCategoria;

    private String descripcion;
    private Boolean estado;

    @OneToMany(mappedBy = "categorias")
    private List<Producto> productos;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


}
