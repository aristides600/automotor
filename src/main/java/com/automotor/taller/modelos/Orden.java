package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "mecanico_id")
    private Mecanico mecanico;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;

    public long getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(long ord_id) {
        this.ord_id = ord_id;
    }

    public Date getOrd_ingreso() {
        return ord_ingreso;
    }

    public void setOrd_ingreso(Date ord_ingreso) {
        this.ord_ingreso = ord_ingreso;
    }

    public Date getOrd_egreso() {
        return ord_egreso;
    }

    public void setOrd_egreso(Date ord_egreso) {
        this.ord_egreso = ord_egreso;
    }

    public int getOrd_km() {
        return ord_km;
    }

    public void setOrd_km(int ord_km) {
        this.ord_km = ord_km;
    }

    public String getOrd_problema() {
        return ord_problema;
    }

    public void setOrd_problema(String ord_problema) {
        this.ord_problema = ord_problema;
    }

    public String getOrd_diagnostico() {
        return ord_diagnostico;
    }

    public void setOrd_diagnostico(String ord_diagnostico) {
        this.ord_diagnostico = ord_diagnostico;
    }

    public float getOrd_importemdo() {
        return ord_importemdo;
    }

    public void setOrd_importemdo(float ord_importemdo) {
        this.ord_importemdo = ord_importemdo;
    }

    public float getOrd_importeres() {
        return ord_importeres;
    }

    public void setOrd_importeres(float ord_importeres) {
        this.ord_importeres = ord_importeres;
    }

    public Boolean getOrd_estado() {
        return ord_estado;
    }

    public void setOrd_estado(Boolean ord_estado) {
        this.ord_estado = ord_estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BajaOrden getBajaOrden() {
        return bajaOrden;
    }

    public void setBajaOrden(BajaOrden bajaOrden) {
        this.bajaOrden = bajaOrden;
    }

    public List<DetalleOrden> getDetalleOrdenes() {
        return detalleOrdenes;
    }

    public void setDetalleOrdenes(List<DetalleOrden> detalleOrdenes) {
        this.detalleOrdenes = detalleOrdenes;
    }

    @OneToOne
    @JoinColumn(name = "baja_id")
    private BajaOrden bajaOrden;
    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;
    @OneToMany(mappedBy="orden", fetch= FetchType.EAGER)
    private List<DetalleOrden> detalleOrdenes = new ArrayList<>();

}
