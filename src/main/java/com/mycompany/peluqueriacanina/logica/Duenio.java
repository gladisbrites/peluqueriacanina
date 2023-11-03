
package com.mycompany.peluqueriacanina.logica;


public class Duenio {
    private int id_duenio;
    private String nombre;
    private String celular;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String celular) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
    
    
}
