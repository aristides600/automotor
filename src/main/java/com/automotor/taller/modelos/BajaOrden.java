package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BajaOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long baj_id;
    @OneToOne
    @JoinColumn(name = "orden_id")
    private Orden orden;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date baj_fecha;

}
