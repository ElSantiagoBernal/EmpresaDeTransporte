/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import util.Serializadora;

/**
 *
 * @author SANTIAGO
 */
public class Pasajero extends Usuario {
    
    private Ruta reserva;
    private ArrayList<Tiquete> hisorialTiquete;

    public Pasajero(String correo, String contraseña, String nombre, String apellido, String identificacion, String genero) {
        super(correo, contraseña, nombre, apellido, identificacion, genero);
        hisorialTiquete = new ArrayList<>();
       
    }
    
    public Ruta getReserva() {
        return reserva;
    }

    public void setReserva(Ruta reserva) {
        this.reserva = reserva;
    }

    public ArrayList<Tiquete> getHisorialTiquete() {
        return hisorialTiquete;
    }

    public void setHisorialTiquete(ArrayList<Tiquete> hisorialTiquete) {
        this.hisorialTiquete = hisorialTiquete;
    }

    public void eliminarReserva() {
        reserva = null;
    }
    
    public void añadirTiqueteHistorial (Tiquete tiquete){
        hisorialTiquete.add(tiquete);
    }
    
    public Tiquete recorrerListaTiquetes (int posicion){
        for (int i = 0; i < hisorialTiquete.size(); i++) {
            if(i == posicion){
                return hisorialTiquete.get(i);
            }
        }
        return null;
    }
    
    public int obtenerTamañoListaTiquetes (){
        return hisorialTiquete.size();
    }
    

}
