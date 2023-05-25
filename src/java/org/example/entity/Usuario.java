/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.entity;

/**
 *
 * @author xxjua
 */
public class Usuario {
    
    private String nombres;
    private String apellidos;
    private Tarjeta tarjeta;

    public Usuario(String nombres, String apellidos, Tarjeta tarjeta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
        
}
