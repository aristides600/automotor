package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

@Entity
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long det_id;
    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Orden orden;
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name = "respuesto_id")
    private Respuesto respuesto;
    private int det_cantidad;
    private float det_precio;


}
