/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.entity;

import java.util.Date;

/**
 *
 * @author xxjua
 */
public class Viajes {
    
    private Integer id;
    private Ruta ruta;
    private Tarjeta tarjeta;
    private Date fecha;

    public Viajes(Integer id, Ruta ruta, Tarjeta tarjeta, Date fecha) {
        this.id = id;
        this.ruta = ruta;
        this.tarjeta = tarjeta;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    } 
    
}
