/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Ramirez
 */
public class Actividad {
   private String actividad_id;
   private String nombre;

    public Actividad(String actividad_id, String nombre) {
        this.actividad_id = actividad_id;
        this.nombre = nombre;
    }

    public String getActividad_id() {
        return actividad_id;
    }

    public void setActividad_id(String actividad_id) {
        this.actividad_id = actividad_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
    
}
