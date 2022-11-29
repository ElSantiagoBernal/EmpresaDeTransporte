/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import excepciones.VehiculoNoRegistradoException;
import excepciones.VehiculoYaRegistradoException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Pasajero;
import modelos.Usuario;
import modelos.Vehiculo;
import util.Serializadora;

/**
 *
 * @author SANTIAGO
 */
public class ControladorBus {

    ArrayList<Vehiculo> listaBuses;
    Serializadora serializadoraVehiculos;

    public ControladorBus() {
        serializadoraVehiculos = new Serializadora();
        listaBuses = inicializarVehiculos();
    }

    private ArrayList<Vehiculo> inicializarVehiculos() {
        ArrayList<Vehiculo> users = null;
        try {
            users = serializadoraVehiculos.leerVehiculos();
            return users;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

    public int obtenerTamaño() {
        return listaBuses.size();
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPlaca().equals(placa)) {
                return listaBuses.get(i);
            }
        }
        return null;
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        Vehiculo v = buscarVehiculo(vehiculo.getPlaca());
        if (v != null) {
            throw new VehiculoYaRegistradoException();
        }
        listaBuses.add(vehiculo);
        try {
            serializadoraVehiculos.escribirVehiculos(listaBuses);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarVehiculo(String placa) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo == null) {
            throw new VehiculoNoRegistradoException();
        }
        listaBuses.remove(vehiculo);
        try {
            serializadoraVehiculos.escribirVehiculos(listaBuses);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void editarInfoVehiculo(String placa, int nuevaCantidadAsientos, boolean nuevoEstado,
            String nuevoTipo) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo == null) {
            throw new VehiculoNoRegistradoException();
        }
        vehiculo.setCantidadSillas(nuevaCantidadAsientos);
        vehiculo.setEstado(nuevoEstado);
        vehiculo.setTipo(nuevoTipo);
        try {
            serializadoraVehiculos.escribirVehiculos(listaBuses);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Vehiculo recorrerLista(int posicion) {
        for (int i = 0; i < listaBuses.size(); i++) {
            if (i == posicion) {
                return listaBuses.get(i);
            }
        }
        return null;
    }

    public void añadirPersonaAlAsiento(Usuario usuario, Vehiculo v) {
        Vehiculo vehiculo = null;
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPlaca().equals(v.getPlaca())) {
                vehiculo = listaBuses.get(i);
                vehiculo.añadirPersonaAsiento(usuario);
                vehiculo.setCantidadSillasDisponibles(vehiculo.obtenerEstaciosDisponibles());
                try {
                    serializadoraVehiculos.escribirVehiculos(listaBuses);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void eliminarPersonaDelAsiento(String placaVehiculo, Usuario usuario) {
        Vehiculo vehiculo = null;
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPlaca().equals(placaVehiculo)) {
                vehiculo = listaBuses.get(i);
                vehiculo.eliminarPersonaAsiento(usuario);
                vehiculo.setCantidadSillasDisponibles(vehiculo.obtenerEstaciosDisponibles());
                JOptionPane.showMessageDialog(null, "Espacios " + vehiculo.obtenerEstaciosDisponibles());
                JOptionPane.showMessageDialog(null, "Sillas " + vehiculo.getCantidadSillasDisponibles());
                try {
                    serializadoraVehiculos.escribirVehiculos(listaBuses);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void eliminarTodosLosUsuarios(Vehiculo vehiculo) {
        Vehiculo v = null;
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPlaca().equals(vehiculo.getPlaca())) {
                v = listaBuses.get(i);
                v.eliminarTodosLosUsuariosDelVehiculo();
                v.setCantidadSillasDisponibles(v.obtenerEstaciosDisponibles());
                try {
                    serializadoraVehiculos.escribirVehiculos(listaBuses);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void editarRutaYEstado(String placaVehiculo, boolean nuevaRuta, boolean nuevoEstado) {
        Vehiculo vehiculo = null;
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPlaca().equals(placaVehiculo)) {
                vehiculo = listaBuses.get(i);
                vehiculo.setEstado(nuevoEstado);
                vehiculo.setRuta(nuevaRuta);
                try {
                    serializadoraVehiculos.escribirVehiculos(listaBuses);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public int eliminarPasajerosConReservaSinPagar(Vehiculo vehiculo, Usuario usuario) {
        int contador = 0;
        Vehiculo vehic = null;
        for (int i = 0; i < listaBuses.size(); i++) {
            if (listaBuses.get(i).getPlaca().equals(vehiculo.getPlaca())) {
                vehic = listaBuses.get(i);
                Usuario user = vehic.recorrerListaPersonasAsientos(i);
                if (user instanceof Pasajero) {
                    if (user.getIdentificacion().equals(usuario.getIdentificacion())) {
                        if (((Pasajero) user).getReserva() != null) {
                            ((Pasajero) user).eliminarReserva();
                            try {
                                serializadoraVehiculos.escribirVehiculos(listaBuses);
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }

                }
            }

        }
        return contador;
    }

    public void disminuirCantidadReserva(Vehiculo vehiculo) {
        int cantidad = vehiculo.getCantidadReservasSinPagar();
        cantidad -= 1;
        vehiculo.setCantidadReservasSinPagar(cantidad);
        try {
            serializadoraVehiculos.escribirVehiculos(listaBuses);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void aumentarCantidadReserva(Vehiculo vehiculo) {
        int cantidad = vehiculo.getCantidadReservasSinPagar();
        cantidad += 1;
        vehiculo.setCantidadReservasSinPagar(cantidad);
        try {
            serializadoraVehiculos.escribirVehiculos(listaBuses);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
