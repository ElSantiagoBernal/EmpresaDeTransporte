/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import excepciones.RutaExistenteException;
import excepciones.RutaNoExistenteException;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Ruta;
import util.Serializadora;

/**
 *
 * @author SANTIAGO
 */
public class ControladorRuta {

    ArrayList<Ruta> listaRutas;
    Serializadora serializadoraRutas;

    public ControladorRuta() {
        serializadoraRutas = new Serializadora();
        listaRutas = inicializarRutas();
    }
    
     private ArrayList<Ruta> inicializarRutas() {
        ArrayList<Ruta> users = null;
        try {
            users = serializadoraRutas.leerRutas();
            return users;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

    public int obtenerTamañoLista() {
        return listaRutas.size();
    }

    public Ruta buscarRuta(String numeroRuta) {
        for (int i = 0; i < listaRutas.size(); i++) {
            if (listaRutas.get(i).getNumeroRuta().equals(numeroRuta)) {
                return listaRutas.get(i);
            }
        }
        return null;
    }

    public void registrarRuta(Ruta ruta) {
        Ruta rut = buscarRuta(ruta.getNumeroRuta());
        if (rut != null) {
            throw new RutaExistenteException();
        }
        listaRutas.add(ruta);
        try {
            serializadoraRutas.escribirRutas(listaRutas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Ruta recorrerLista(int posicion) {
        for (int i = 0; i < listaRutas.size(); i++) {
            if (i == posicion) {
                return listaRutas.get(i);
            }
        }
        return null;
    }

    public void eliminarRuta(String numRuta) {
        Ruta ruta = buscarRuta(numRuta);
        if (ruta == null) {
            throw new RutaNoExistenteException();
        }
        listaRutas.remove(ruta);
         try {
            serializadoraRutas.escribirRutas(listaRutas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void editarInformacioRuta(String nuevoPrecio, String numeroRuta, String nuevoOrigen, String nuevoDestino) {
        Ruta ruta = buscarRuta(numeroRuta);
        if (ruta == null) {
            throw new RutaNoExistenteException();
        }
        ruta.setCiudadOrigen(nuevoOrigen);
        ruta.setCiudadDestino(nuevoDestino);
        ruta.setPrecio(nuevoPrecio);
         try {
            serializadoraRutas.escribirRutas(listaRutas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
