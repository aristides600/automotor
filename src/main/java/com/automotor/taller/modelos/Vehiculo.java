package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long veh_id;
    private String veh_patente;
    private int veh_anio;
    private String veh_carroceria;
    private String veh_motor;
    private boolean veh_estado;
    @OneToMany(mappedBy="vehiculo", fetch= FetchType.EAGER)
    private List<Orden> ordenes = new ArrayList<>();
}
