/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SANTIAGO
 */
public class Vehiculo implements Serializable{

    private String placa;
    private String tipo;
    private int cantidadSillas;
    private ArrayList<Usuario> listaPersonas;
    private boolean estado;
    private boolean ruta;
    private int cantidadSillasDisponibles;
    private int cantidadReservasSinPagar;

    public Vehiculo(String placa, String tipo, int cantidadSillas, boolean estado, boolean ruta) {
        this.placa = placa;
        this.tipo = tipo;
        this.cantidadSillas = cantidadSillas;
        this.estado = estado;
        this.ruta = ruta;
        listaPersonas = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }

    public ArrayList<Usuario> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Usuario> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRuta() {
        return ruta;
    }

    public void setRuta(boolean ruta) {
        this.ruta = ruta;
    }

    public int getCantidadSillasDisponibles() {
        return cantidadSillasDisponibles;
    }

    public void setCantidadSillasDisponibles(int cantidadSillasDisponibles) {
        this.cantidadSillasDisponibles = cantidadSillasDisponibles;
    }

    public int getCantidadReservasSinPagar() {
        return cantidadReservasSinPagar;
    }

    public void setCantidadReservasSinPagar(int cantidadReservasSinPagar) {
        this.cantidadReservasSinPagar = cantidadReservasSinPagar;
    }
    

    public void añadirPersonaAsiento(Usuario usuario) {
        listaPersonas.add(usuario);
    }

    public int obtenerTamañoLista() {
        return listaPersonas.size();
    }

    public int obtenerEstaciosDisponibles() {
        return cantidadSillas - listaPersonas.size();
    }

    public void eliminarPersonaAsiento(Usuario usuario) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getIdentificacion().equals(usuario.getIdentificacion())) {
                listaPersonas.remove(usuario);
            }
        }

    }

    public void eliminarTodosLosUsuariosDelVehiculo() {
        listaPersonas.clear();
    }

    public Usuario recorrerListaPersonasAsientos(int posicion) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (i == posicion) {
                return listaPersonas.get(i);
            }
        }
        return null;
    }

}
