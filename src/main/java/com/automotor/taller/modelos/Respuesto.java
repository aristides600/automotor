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

    public long getRes_id() {
        return res_id;
    }

    public void setRes_id(long res_id) {
        this.res_id = res_id;
    }

    public String getRes_nombre() {
        return res_nombre;
    }

    public void setRes_nombre(String res_nombre) {
        this.res_nombre = res_nombre;
    }

    public String getRes_codigo() {
        return res_codigo;
    }

    public void setRes_codigo(String res_codigo) {
        this.res_codigo = res_codigo;
    }

    public int getRes_stock() {
        return res_stock;
    }

    public void setRes_stock(int res_stock) {
        this.res_stock = res_stock;
    }

    public float getRes_precio() {
        return res_precio;
    }

    public void setRes_precio(float res_precio) {
        this.res_precio = res_precio;
    }

    public MarcaRespuesto getMarcaRespuesto() {
        return marcaRespuesto;
    }

    public void setMarcaRespuesto(MarcaRespuesto marcaRespuesto) {
        this.marcaRespuesto = marcaRespuesto;
    }

    public List<DetalleOrden> getDetalleOrdenes() {
        return detalleOrdenes;
    }

    public void setDetalleOrdenes(List<DetalleOrden> detalleOrdenes) {
        this.detalleOrdenes = detalleOrdenes;
    }

    private float res_precio;
    @ManyToOne
    @JoinColumn(name = "marcarespuesto_id")
    private MarcaRespuesto marcaRespuesto;

    @OneToMany(mappedBy="respuesto", fetch= FetchType.EAGER)
    private List<DetalleOrden> detalleOrdenes = new ArrayList<>();
}
