/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javafx.scene.layout.Region;

/**
 *
 * @author Ramirez
 */
public class Escuela {
    private String escuela_id;
    private String escuela_nombre;
    private String ciudad;
    private Regiones region;

    public Escuela(String escuela_id, String escuela_nombre, String ciudad, Regiones region) {
        this.escuela_id = escuela_id;
        this.escuela_nombre = escuela_nombre;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getEscuela_id() {
        return escuela_id;
    }

    public void setEscuela_id(String escuela_id) {
        this.escuela_id = escuela_id;
    }

    public String getNombre() {
        return escuela_nombre;
    }

    public void setNombre(String nombre) {
        this.escuela_nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Regiones getRegion() {
        return region;
    }

    public void setRegion(Regiones region) {
        this.region = region;
    }

    
  
    
    
}
