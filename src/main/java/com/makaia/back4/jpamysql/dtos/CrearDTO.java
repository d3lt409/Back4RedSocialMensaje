package com.makaia.back4.jpamysql.dtos;

import com.makaia.back4.jpamysql.entities.Usuario;

import java.util.Date;
import java.util.Objects;

public class CrearDTO {
    private String contenido;

    private Date fechaEnvio;

    private Long emisor_id;

    private Long receptor_id;


    public CrearDTO() {
    }


    public CrearDTO(String contenido, Date fechaEnvio, Long emisor_id, Long receptor_id) {
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.emisor_id = emisor_id;
        this.receptor_id = receptor_id;
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

    public Long getEmisor_id() {
        return this.emisor_id;
    }

    public void setEmisor_id(Long emisor_id) {
        this.emisor_id = emisor_id;
    }

    public Long getReceptor_id() {
        return this.receptor_id;
    }

    public void setReceptor_id(Long receptor_id) {
        this.receptor_id = receptor_id;
    }

    public CrearDTO contenido(String contenido) {
        setContenido(contenido);
        return this;
    }

    public CrearDTO fechaEnvio(Date fechaEnvio) {
        setFechaEnvio(fechaEnvio);
        return this;
    }

    public CrearDTO emisor_id(Long emisor_id) {
        setEmisor_id(emisor_id);
        return this;
    }

    public CrearDTO receptor_id(Long receptor_id) {
        setReceptor_id(receptor_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CrearDTO)) {
            return false;
        }
        CrearDTO crearDTO = (CrearDTO) o;
        return Objects.equals(contenido, crearDTO.contenido) && Objects.equals(fechaEnvio, crearDTO.fechaEnvio) && Objects.equals(emisor_id, crearDTO.emisor_id) && Objects.equals(receptor_id, crearDTO.receptor_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contenido, fechaEnvio, emisor_id, receptor_id);
    }

    @Override
    public String toString() {
        return "{" +
            " contenido='" + getContenido() + "'" +
            ", fechaEnvio='" + getFechaEnvio() + "'" +
            ", emisor_id='" + getEmisor_id() + "'" +
            ", receptor_id='" + getReceptor_id() + "'" +
            "}";
    }

    

}
