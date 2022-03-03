package com.axity.example.capacitacion.commons;

import java.io.Serial;
import java.io.Serializable;

public class ClientTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -8344003185060531136L;

    private Integer id;
    private String nombre;
    private String direcccion;
    private String email;

    public ClientTO() {
    }

    public ClientTO(Integer id, String nombre, String direcccion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.direcccion = direcccion;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
