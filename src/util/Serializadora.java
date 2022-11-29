/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelos.Ruta;
import modelos.Tiquete;
import modelos.Usuario;
import modelos.Vehiculo;

/**
 *
 * @author SANTIAGO
 */
public class Serializadora {
    
    private ObjectOutputStream escritorObjetos;
    private ObjectInputStream lectorObjetos;
    
    public void escribirUsuarios (ArrayList<Usuario> usuarios) throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("usuarios.dat");
        escritorObjetos = new ObjectOutputStream(file);
        escritorObjetos.writeObject(usuarios);
    }
    
    public ArrayList<Usuario> leerUsuarios() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Usuario> usuarios = null;
        FileInputStream file = new FileInputStream("usuarios.dat");
        lectorObjetos = new ObjectInputStream(file);
        usuarios = (ArrayList<Usuario>) lectorObjetos.readObject();
        return usuarios;
    }
    
    public void escribirVehiculos (ArrayList<Vehiculo> vehiculos) throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("vehiculos.dat");
        escritorObjetos = new ObjectOutputStream(file);
        escritorObjetos.writeObject(vehiculos);
    }
    
    public ArrayList<Vehiculo> leerVehiculos() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Vehiculo> vehiculos = null;
        FileInputStream file = new FileInputStream("vehiculos.dat");
        lectorObjetos = new ObjectInputStream(file);
        vehiculos = (ArrayList<Vehiculo>) lectorObjetos.readObject();
        return vehiculos;
    }
    
    public void escribirRutas (ArrayList<Ruta> rutas) throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("rutas.dat");
        escritorObjetos = new ObjectOutputStream(file);
        escritorObjetos.writeObject(rutas);
    }
    
    public ArrayList<Ruta> leerRutas() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Ruta> rutas = null;
        FileInputStream file = new FileInputStream("rutas.dat");
        lectorObjetos = new ObjectInputStream(file);
        rutas = (ArrayList<Ruta>) lectorObjetos.readObject();
        return rutas;
    }
    
    public void escribirHistorialTiquetes (ArrayList<Tiquete> tiquetes) throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("tiquetes.dat");
        escritorObjetos = new ObjectOutputStream(file);
        escritorObjetos.writeObject(tiquetes);
    }
    
    public ArrayList<Tiquete> leerHistorialTiquetes() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Tiquete> tiquetes = null;
        FileInputStream file = new FileInputStream("tiquetes.dat");
        lectorObjetos = new ObjectInputStream(file);
        tiquetes = (ArrayList<Tiquete>) lectorObjetos.readObject();
        return tiquetes;
    }
    
}
