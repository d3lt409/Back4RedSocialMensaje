package com.makaia.back4.jpamysql.entities;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.Date;

@Entity
@Table
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column
    private String contenido;

    @Column(name="fecha_envio")
    private Date fechaEnvio;

    @ManyToOne(optional = false)
    Usuario emisor;

    @ManyToOne(optional = false)
    Usuario receptor;


    public Mensaje() {
    }

    public Mensaje(String contenido, Date fechaEnvio, Usuario emisor, Usuario receptor) {
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaEnvio() {
        return this.fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Usuario getEmisor() {
        return this.emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return this.receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public Mensaje id(Long id) {
        setId(id);
        return this;
    }

    public Mensaje contenido(String contenido) {
        setContenido(contenido);
        return this;
    }

    public Mensaje fechaEnvio(Date fechaEnvio) {
        setFechaEnvio(fechaEnvio);
        return this;
    }

    public Mensaje emisor(Usuario emisor) {
        setEmisor(emisor);
        return this;
    }

    public Mensaje receptor(Usuario receptor) {
        setReceptor(receptor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mensaje)) {
            return false;
        }
        Mensaje mensaje = (Mensaje) o;
        return Objects.equals(id, mensaje.id) && Objects.equals(contenido, mensaje.contenido) && Objects.equals(fechaEnvio, mensaje.fechaEnvio) && Objects.equals(emisor, mensaje.emisor) && Objects.equals(receptor, mensaje.receptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contenido, fechaEnvio, emisor, receptor);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", contenido='" + getContenido() + "'" +
            ", fechaEnvio='" + getFechaEnvio() + "'" +
            ", emisor='" + getEmisor() + "'" +
            ", receptor='" + getReceptor() + "'" +
            "}";
    }
    
}
