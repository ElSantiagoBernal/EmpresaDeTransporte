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
public class LlenarTodosLosAsientosDelVehiculoException extends RuntimeException{

    public LlenarTodosLosAsientosDelVehiculoException() {
    super("Todavia no puedes despachar el bus, primero se debe llenar todas las sillas");
    }
    
    
}
