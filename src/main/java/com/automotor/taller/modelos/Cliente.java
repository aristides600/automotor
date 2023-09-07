package com.automotor.taller.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long cli_id;
    private String cli_apellido;
    private String cli_nombre;
    private String cli_domicilio;
    private int cli_cp;
    @Temporal(TemporalType.DATE)
    private Date cli_fechanac;
    private String cli_mail;
    private int cli_dni;
    @Temporal(TemporalType.DATE)
    private Date cli_fechareg;
    private boolean cli_estado;

    @OneToOne
    @JoinColumn(name = "contribuyente_id")
    private Contribuyente contribuyente;

    @OneToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    public Cliente() {
    }

    public long getCli_id() {
        return cli_id;
    }

    public void setCli_id(long cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_domicilio() {
        return cli_domicilio;
    }

    public void setCli_domicilio(String cli_domicilio) {
        this.cli_domicilio = cli_domicilio;
    }

    public int getCli_cp() {
        return cli_cp;
    }

    public void setCli_cp(int cli_cp) {
        this.cli_cp = cli_cp;
    }

    public Date getCli_fechanac() {
        return cli_fechanac;
    }

    public void setCli_fechanac(Date cli_fechanac) {
        this.cli_fechanac = cli_fechanac;
    }

    public String getCli_mail() {
        return cli_mail;
    }

    public void setCli_mail(String cli_mail) {
        this.cli_mail = cli_mail;
    }

    public int getCli_dni() {
        return cli_dni;
    }

    public void setCli_dni(int cli_dni) {
        this.cli_dni = cli_dni;
    }

    public Date getCli_fechareg() {
        return cli_fechareg;
    }

    public void setCli_fechareg(Date cli_fechareg) {
        this.cli_fechareg = cli_fechareg;
    }

    public boolean isCli_estado() {
        return cli_estado;
    }

    public void setCli_estado(boolean cli_estado) {
        this.cli_estado = cli_estado;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
