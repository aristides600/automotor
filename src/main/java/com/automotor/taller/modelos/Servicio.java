package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long ser_id;
    private String ser_nombre;
    @OneToMany(mappedBy="servicio", fetch= FetchType.EAGER)
    private List<DetalleOrden> detalleOrdenes = new ArrayList<>();
}
