package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long veh_id;
    private String veh_patente;
    private int veh_anio;
    private String veh_carroceria;
    private String veh_motor;
    private boolean veh_estado;
    @ManyToOne
    @JoinColumn(name = "marcaauto_id")
    private MarcaAuto marcaAuto;

    public long getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(long veh_id) {
        this.veh_id = veh_id;
    }

    public String getVeh_patente() {
        return veh_patente;
    }

    public void setVeh_patente(String veh_patente) {
        this.veh_patente = veh_patente;
    }

    public int getVeh_anio() {
        return veh_anio;
    }

    public void setVeh_anio(int veh_anio) {
        this.veh_anio = veh_anio;
    }

    public String getVeh_carroceria() {
        return veh_carroceria;
    }

    public void setVeh_carroceria(String veh_carroceria) {
        this.veh_carroceria = veh_carroceria;
    }

    public String getVeh_motor() {
        return veh_motor;
    }

    public void setVeh_motor(String veh_motor) {
        this.veh_motor = veh_motor;
    }

    public boolean isVeh_estado() {
        return veh_estado;
    }

    public void setVeh_estado(boolean veh_estado) {
        this.veh_estado = veh_estado;
    }

    public MarcaAuto getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(MarcaAuto marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;
    @OneToMany(mappedBy="vehiculo", fetch= FetchType.EAGER)
    private List<Orden> ordenes = new ArrayList<>();
}
