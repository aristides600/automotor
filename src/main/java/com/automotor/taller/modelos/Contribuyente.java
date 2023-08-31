package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Contribuyente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long con_id;
    private String con_nombre;

    public long getCon_id() {
        return con_id;
    }

    public void setCon_id(long con_id) {
        this.con_id = con_id;
    }

    public String getCon_nombre() {
        return con_nombre;
    }

    public void setCon_nombre(String con_nombre) {
        this.con_nombre = con_nombre;
    }
}
