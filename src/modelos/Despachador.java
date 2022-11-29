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
public class Despachador extends Usuario {

    private int cantidadVehiculosDespachados;

    public Despachador(int cantidadVehiculosDespachados, String correo, String contraseña,
            String nombre, String apellido, String identificacion, String genero) {
        super(correo, contraseña, nombre, apellido, identificacion, genero);
        this.cantidadVehiculosDespachados = cantidadVehiculosDespachados;
    }

    public int getCantidadVehiculosDespachados() {
        return cantidadVehiculosDespachados;
    }

    public void setCantidadVehiculosDespachados(int cantidadVehiculosDespachados) {
        this.cantidadVehiculosDespachados = cantidadVehiculosDespachados;
    }

    public int añadirVehiculoDspachado() {
        cantidadVehiculosDespachados += 1;
        return cantidadVehiculosDespachados;
    }

}
