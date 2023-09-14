package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long tur_id;
    @Temporal(TemporalType.DATE)
    private Date tur_fecha;
    @Temporal(TemporalType.TIME)
    private Date tur_hora;
    private String tur_observacion;
    @OneToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    public long getTur_id() {
        return tur_id;
    }

    public void setTur_id(long tur_id) {
        this.tur_id = tur_id;
    }

    public Date getTur_fecha() {
        return tur_fecha;
    }

    public void setTur_fecha(Date tur_fecha) {
        this.tur_fecha = tur_fecha;
    }

    public Date getTur_hora() {
        return tur_hora;
    }

    public void setTur_hora(Date tur_hora) {
        this.tur_hora = tur_hora;
    }

    public String getTur_observacion() {
        return tur_observacion;
    }

    public void setTur_observacion(String tur_observacion) {
        this.tur_observacion = tur_observacion;
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

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
