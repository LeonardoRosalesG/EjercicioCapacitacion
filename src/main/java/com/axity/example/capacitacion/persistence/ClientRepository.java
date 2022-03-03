package com.axity.example.capacitacion.persistence;

import com.axity.example.capacitacion.model.ClientDO;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientDO, Integer> {

}
