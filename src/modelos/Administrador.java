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
public class Administrador extends Usuario{
    
    private int cantidadPersonasACargo;
    
    
    public Administrador(int cantidadPersonasACargo, String correo, String contraseña, String nombre, String apellido, String identificacion, String genero) {
        super(correo, contraseña, nombre, apellido, identificacion, genero);
        this.cantidadPersonasACargo = cantidadPersonasACargo;
    }

    public int getCantidadPersonasACargo() {
        return cantidadPersonasACargo;
    }

    public void setCantidadPersonasACargo(int cantidadPersonasACargo) {
        this.cantidadPersonasACargo = cantidadPersonasACargo;
    }
    
    
}
