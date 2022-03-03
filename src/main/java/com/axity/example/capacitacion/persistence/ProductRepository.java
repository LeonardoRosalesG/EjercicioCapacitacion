package com.axity.example.capacitacion.persistence;

import com.axity.example.capacitacion.model.ProductDO;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductDO, Integer> {
}
