/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import excepciones.PersonaYaRegistradaException;
import excepciones.UsuarioNoRegistradoException;
import excepciones.UsuarioYaRegistradoException;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Administrador;
import modelos.Cajero;
import modelos.Despachador;
import modelos.Pasajero;
import modelos.Ruta;
import modelos.Tiquete;
import modelos.Usuario;
import util.Serializadora;

/**
 *
 * @author SANTIAGO
 */
public class ControladorUsuario {

    ArrayList<Usuario> listaUsuarios;
    Serializadora serializadoraUsuarios;

    public ControladorUsuario() {
        serializadoraUsuarios = new Serializadora();
        listaUsuarios = inicializarUsuarios();
    }

    private ArrayList<Usuario> inicializarUsuarios() {
        ArrayList<Usuario> users = null;
        try {
            users = serializadoraUsuarios.leerUsuarios();
            return users;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

    public int obtenerTamañoLista() {
        return listaUsuarios.size();
    }

    public Usuario buscarUsuario(String usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreo().equals(usuario)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public Usuario buscarUsuarioIdentificacion(String identificacion) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getIdentificacion().equals(identificacion)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public void registrarUsuario(Usuario usuario) {
        Usuario adm = buscarUsuario(usuario.getCorreo());
        Usuario user = buscarUsuarioIdentificacion(usuario.getIdentificacion());
        if (adm != null) {
            throw new UsuarioYaRegistradoException();
        } else if (user != null) {
            throw new PersonaYaRegistradaException();
        }
        listaUsuarios.add(usuario);
        try {
            serializadoraUsuarios.escribirUsuarios(listaUsuarios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void editarInfoUsuario(String id, String nuevoNombre, String nuevoApellido, String nuevoGenero, String nuevaContraseña) {
        Usuario personaBuscada = buscarUsuarioIdentificacion(id);
        if (personaBuscada == null) {
            throw new UsuarioNoRegistradoException();
        }
        personaBuscada.setNombre(nuevoNombre);
        personaBuscada.setApellido(nuevoApellido);
        personaBuscada.setGenero(nuevoGenero);
        personaBuscada.setContraseña(nuevaContraseña);
        try {
            serializadoraUsuarios.escribirUsuarios(listaUsuarios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarUsuario(String identificacion) {
        Usuario usuario = buscarUsuarioIdentificacion(identificacion);
        if (usuario == null) {
            throw new UsuarioNoRegistradoException();
        }
        listaUsuarios.remove(usuario);
        try {
            serializadoraUsuarios.escribirUsuarios(listaUsuarios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Usuario recorrerLista(int posicion) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (i == posicion) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public void editarReserva(String identificacion, Ruta ruta) {
        Usuario usuario = null;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getIdentificacion().equals(identificacion)) {
                usuario = listaUsuarios.get(i);
                if (usuario instanceof Pasajero) {
                    ((Pasajero) usuario).setReserva(ruta);
                    try {
                        serializadoraUsuarios.escribirUsuarios(listaUsuarios);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public void añadirTiqueteAlHistorial(String identificacion, Tiquete tiquete) {
        Usuario usuario = null;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getIdentificacion().equals(identificacion)) {
                usuario = listaUsuarios.get(i);
                if (usuario instanceof Pasajero) {
                    ((Pasajero) usuario).añadirTiqueteHistorial(tiquete);
                    try {
                        serializadoraUsuarios.escribirUsuarios(listaUsuarios);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public void eliminarReservaUsuario(String identificacion) {
        Usuario usuario = null;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getIdentificacion().equals(identificacion)) {
                usuario = listaUsuarios.get(i);
                if (usuario instanceof Pasajero) {
                    ((Pasajero) usuario).setReserva(null);
                    try {
                        serializadoraUsuarios.escribirUsuarios(listaUsuarios);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public void añadirPersonaRegistradaAdmin(Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (usuario instanceof Administrador) {
                int cantidad = ((Administrador) usuario).getCantidadPersonasACargo();
                cantidad += 1;
                ((Administrador) usuario).setCantidadPersonasACargo(cantidad);
                try {
                    serializadoraUsuarios.escribirUsuarios(listaUsuarios);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    public void eliminarPersonaRegistradaAdmin(Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            int cantidad = ((Administrador) usuario).getCantidadPersonasACargo();
            if (cantidad > 0) {
                cantidad -= 1;
                ((Administrador) usuario).setCantidadPersonasACargo(cantidad);
                try {
                    serializadoraUsuarios.escribirUsuarios(listaUsuarios);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    public void añadirVehiculoDespachado(Usuario usuario) {
        if (usuario instanceof Despachador) {
            int cantidad = ((Despachador) usuario).getCantidadVehiculosDespachados();
            cantidad += 1;
            ((Despachador) usuario).setCantidadVehiculosDespachados(cantidad);
            try {
                serializadoraUsuarios.escribirUsuarios(listaUsuarios);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void añadirTiqueteVendido(Usuario usuario) {
        if (usuario instanceof Cajero) {
            int cantidad = ((Cajero) usuario).getNumTiquetesVendidos();
            cantidad += 1;
            ((Cajero) usuario).setNumTiquetesVendidos(cantidad);
            try {
                serializadoraUsuarios.escribirUsuarios(listaUsuarios);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
