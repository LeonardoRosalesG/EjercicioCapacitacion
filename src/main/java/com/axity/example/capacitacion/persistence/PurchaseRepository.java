package com.axity.example.capacitacion.persistence;

import com.axity.example.capacitacion.model.PurchaseDO;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<PurchaseDO, Integer> {


}
