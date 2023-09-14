package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long col_id;
    private String col_nombre;
    @OneToMany(mappedBy="color", fetch= FetchType.EAGER)
    private List<Vehiculo> vehiculos = new ArrayList<>();
}
