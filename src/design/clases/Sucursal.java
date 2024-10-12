/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.clases;

import java.util.List;

/**
 *
 * @author julio.nava
 */
public class Sucursal {
    
    private int id;
    private String nombre;
    private String ciudad;
    private List<Sala> salas;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the salas
     */
    public List<Sala> getSalas() {
        return salas;
    }

    /**
     * @param salas the salas to set
     */
    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
    
    
}
