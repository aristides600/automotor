package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MarcaRespuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long mre_id;
    private String mre_nombre;

    @OneToMany(mappedBy="marcaRespuesto", fetch= FetchType.EAGER)
    private List<Respuesto> marcaRespuestos = new ArrayList<>();
}
