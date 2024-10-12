/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poocinepolis;

import design.clases.Sala;
import design.clases.Cliente;

/**
 *
 * @author julio.nava
 */
public class POOCinepolis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente nuevo = new Cliente();
        nuevo.setId(1);
        nuevo.setCorreoElectronico("julio.nava06@gmail.com");
        //nuevo.setFechaCumpleanio();
        nuevo.setNombre("Julio");
        nuevo.setApellido("Nava");
        nuevo.setCiudad("Guaymas");
        
        nuevo.registrarse();
        
        Sala salaNueva = new Sala();
        
    }
    
}
