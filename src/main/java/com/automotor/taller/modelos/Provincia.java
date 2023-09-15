package com.automotor.taller.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    long pro_id;
    String pro_nombre;

    @OneToMany(mappedBy="provincia", fetch= FetchType.EAGER)
    private List<Localidad> localidades = new ArrayList<>();

    public Provincia() {
    }

    public Provincia(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public long getPro_id() {
        return pro_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    @JsonIgnore
    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }

    public void addLocalidad(Localidad localidad){
        localidad.setProvincia(this);
        localidades.add(localidad);
    }




}
