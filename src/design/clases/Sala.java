/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.clases;

/**
 *
 * @author julio.nava
 */
public class Sala {
    
    private int id;
    private int numeroSala;
    private int numeroAsientos;

    /**
     * Revisa disponibilidad
     * @return Regresa la cantidad de asientos disponibles 
     */
    public int hayDisponible() {
        return 0;
    }
    
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
     * @return the numeroSala
     */
    public int getNumeroSala() {
        return numeroSala;
    }

    /**
     * @param numeroSala the numeroSala to set
     */
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    /**
     * @return the numeroAsientos
     */
    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    /**
     * @param numeroAsientos the numeroAsientos to set
     */
    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    
    
    
}
