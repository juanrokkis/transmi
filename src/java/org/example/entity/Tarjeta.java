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
public class Tarjeta {
    
    private String serial;
    private Integer saldo;

    public Tarjeta(String serial, Integer saldo) {
        this.serial = serial;
        this.saldo = saldo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    
    
}
