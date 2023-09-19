package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long mod_id;
    private String mod_nombre;
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private MarcaAuto marcaAuto;
}
