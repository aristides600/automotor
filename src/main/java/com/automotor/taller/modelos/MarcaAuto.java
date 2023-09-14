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


}
