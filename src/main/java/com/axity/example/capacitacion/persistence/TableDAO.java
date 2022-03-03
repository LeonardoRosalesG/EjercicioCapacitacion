package com.axity.example.capacitacion.persistence;

import com.axity.example.capacitacion.commons.ResultDataTO;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TableDAO {
    List<ResultDataTO> getAll();
}
