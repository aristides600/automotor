package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long ord_id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ord_ingreso;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ord_egreso;
    private int ord_km;
    private String ord_problema;
    private String ord_diagnostico;
    private float ord_importemdo;
    private float ord_importeres;

    private Boolean ord_estado;
    @OneToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "mecanico_id")
    private Mecanico mecanico;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;

}
