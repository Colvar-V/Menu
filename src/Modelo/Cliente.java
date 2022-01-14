/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class Cliente extends Usuario {
    private String direccion, cumpleaños,id;
    

    public Cliente(String direccion, String cumpleaños, String nombre, String correo, String telefono, String contraseña, String id) {
        super(nombre, correo, telefono, contraseña);
        this.direccion = direccion;
        this.cumpleaños = cumpleaños;
        this.id=id;
    }

    public Cliente() {
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}

