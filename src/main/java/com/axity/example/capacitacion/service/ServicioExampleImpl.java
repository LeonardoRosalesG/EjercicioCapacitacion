package com.axity.example.capacitacion.service;

import com.axity.example.capacitacion.commons.ClientTO;
import com.axity.example.capacitacion.commons.ResultDataTO;
import com.axity.example.capacitacion.model.ClientDO;
import com.axity.example.capacitacion.persistence.ClientRepository;
import com.axity.example.capacitacion.persistence.TableDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicioExampleImpl implements ServicioExample{
    @Autowired
    TableDAO tableDAO;

    @Override
    public List<ResultDataTO> consultarData() {
        return tableDAO.getAll();
    }

    @Autowired
    ClientRepository clientRepository;

    public List<ClientTO> consultarCLiente(){
        List<ClientTO> clientTOS = new ArrayList<>();
        clientRepository.findAll().forEach(e ->{
            clientTOS.add(transformDOtoTO(e));
        });
        return clientTOS;
    }

    public ClientTO transformDOtoTO(ClientDO clientDO){
        ClientTO clientTO = new ClientTO();
        clientTO.setId(clientDO.getId());
        clientTO.setDirecccion(clientDO.getDireccion());
        clientTO.setEmail(clientDO.getEmail());
        clientTO.setNombre(clientDO.getNombre());
        return clientTO;
    }
}
