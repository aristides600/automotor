package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MarcaAuto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long mar_id;
    private String mar_nombre;
    @OneToMany(mappedBy="marcaAuto", fetch= FetchType.EAGER)
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public long getMar_id() {
        return mar_id;
    }

    public void setMar_id(long mar_id) {
        this.mar_id = mar_id;
    }

    public String getMar_nombre() {
        return mar_nombre;
    }

    public void setMar_nombre(String mar_nombre) {
        this.mar_nombre = mar_nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
