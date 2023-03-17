package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entities.Producto;
import org.springframework.data.repository.CrudRepository;

//se le pasa la clase y el tipo de datos de la pk
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
