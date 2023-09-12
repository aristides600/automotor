package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Respuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long res_id;
    private String res_nombre;
    private String res_codigo;
    private int res_stock;
    private float res_precio;
    @ManyToOne
    @JoinColumn(name = "marcarespuesto_id")
    private MarcaRespuesto marcaRespuesto;

    @OneToMany(mappedBy="respuesto", fetch= FetchType.EAGER)
    private List<DetalleOrden> detalleOrdenes = new ArrayList<>();
}
