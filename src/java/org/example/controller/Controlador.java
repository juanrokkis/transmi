/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.example.entity.Tarjeta;
import org.example.entity.Usuario;

/**
 *
 * @author xxjua
 */
@Named(value = "controlador")
@SessionScoped
public class Controlador implements Serializable {

    private List<Tarjeta> tarjetasDisponibles;
    private List<Tarjeta> tarjetasVendidas;
    private List<Usuario> usuarios;
    private String serial;
    private String nombres;
    private String apellidos;
    
    /**
     * Creates a new instance of Controlador
     */
    public Controlador() {      
        tarjetasDisponibles = new ArrayList<>();
        tarjetasVendidas = new ArrayList<>();
        usuarios = new ArrayList<>();
        cargarTarjetasDisponibles();
    }
    
    public void venderTarjeta(){
        Tarjeta tarjeta = null;
        for (Tarjeta t : tarjetasDisponibles) {
            if (t.getSerial().equals(serial)) {
                tarjeta = t;
                break;
            }
        }
        tarjetasDisponibles.remove(tarjeta);
        tarjetasVendidas.add(tarjeta);
        Usuario usuario = new Usuario(nombres, apellidos, tarjeta);
        usuarios.add(usuario);
    }
    
    public void cargarTarjetasDisponibles(){
        tarjetasDisponibles.add(new Tarjeta("1010-0001-5457-5457", 5000)); 
        tarjetasDisponibles.add(new Tarjeta("1010-0000-7852-3217", 5000));
    }

    public List<Tarjeta> getTarjetasDisponibles() {
        return tarjetasDisponibles;
    }

    public void setTarjetasDisponibles(List<Tarjeta> tarjetasDisponibles) {
        this.tarjetasDisponibles = tarjetasDisponibles;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public List<Tarjeta> getTarjetasVendidas() {
        return tarjetasVendidas;
    }

    public void setTarjetasVendidas(List<Tarjeta> tarjetasVendidas) {
        this.tarjetasVendidas = tarjetasVendidas;
    }
    
}
