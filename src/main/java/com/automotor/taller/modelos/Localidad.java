package com.automotor.taller.modelos;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long loc_id;
    private String loc_nombre;
    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;
    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Localidad() {
    }
    public Localidad(String loc_nombre){
        this.loc_nombre = loc_nombre;
    }

    public long getLoc_id() {
        return loc_id;
    }

    public String getLoc_nombre() {
        return loc_nombre;
    }

    public void setLoc_nombre(String loc_nombre) {
        this.loc_nombre = loc_nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
