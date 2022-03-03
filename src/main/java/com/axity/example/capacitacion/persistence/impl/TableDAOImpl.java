package com.axity.example.capacitacion.persistence.impl;

import com.axity.example.capacitacion.commons.ResultDataTO;
import com.axity.example.capacitacion.persistence.TableDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@Service
public class TableDAOImpl implements TableDAO {

    @Override
    public List<ResultDataTO> getAll() {
        List<ResultDataTO> response = new ArrayList<>();
        response.add(new ResultDataTO(1, "Dato 1", Calendar.getInstance().getTime()));
        return response;
    }
}
