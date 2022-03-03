package com.axity.example.capacitacion.commons;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class ResultDataTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 3935898772240077188L;
    private Integer id;
    private String name;
    private Date creationDate;

    public ResultDataTO(int id, String name, int date) {
    }

    public ResultDataTO(Integer id, String name, Date creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
