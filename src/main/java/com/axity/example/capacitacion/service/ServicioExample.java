package com.axity.example.capacitacion.service;

import com.axity.example.capacitacion.commons.ClientTO;
import com.axity.example.capacitacion.commons.ResultDataTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioExample {
    List<ResultDataTO> consultarData();
    List<ClientTO> consultarCLiente();
}
