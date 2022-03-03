package com.axity.example.capacitacion.controllers;


import com.axity.example.capacitacion.commons.ClientTO;
import com.axity.example.capacitacion.commons.ResultDataTO;
import com.axity.example.capacitacion.service.ServicioExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins ="*", allowedHeaders = "*") //Consumo de API desde cualquier origen de aplicativo
@RestController
@RequestMapping("exhibitor")

public class WebController {
    @Autowired
    ServicioExample servicioExample;

    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getValuesTest(){
        return new ResponseEntity<>("Prueba OK", HttpStatus.OK);
    }

    @GetMapping(value = "/table", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ResultDataTO>> getValueBD(){
        List<ResultDataTO> responde = servicioExample.consultarData();
        return new ResponseEntity<List<ResultDataTO>>(responde, HttpStatus.OK);
    }



    @GetMapping(value = "/client", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ClientTO>> getClients(){
        List<ClientTO> response = servicioExample.consultarCLiente();
        return new ResponseEntity<List<ClientTO>>(response, HttpStatus.OK);
    }
}
