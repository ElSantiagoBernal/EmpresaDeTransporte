/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author SANTIAGO
 */
public class VehiculoYaRegistradoException extends RuntimeException{

    public VehiculoYaRegistradoException() {
        super("Ya hay un vehiculo registrado con esta misma placa");
    }
    
    
    
}
