/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author SANTIAGO
 */
public class Cajero extends Usuario{
    
    private int numTiquetesVendidos;
    
    public Cajero(int numTiquetesVendidos, String correo, String contraseña, String nombre, String apellido, String identificacion, String genero) {
        super(correo, contraseña, nombre, apellido, identificacion, genero);
        this.numTiquetesVendidos = numTiquetesVendidos;
    }

    public int getNumTiquetesVendidos() {
        return numTiquetesVendidos;
    }

    public void setNumTiquetesVendidos(int numTiquetesVendidos) {
        this.numTiquetesVendidos = numTiquetesVendidos;
    }
    
}
