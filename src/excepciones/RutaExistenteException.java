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
public class RutaExistenteException extends RuntimeException{

    public RutaExistenteException() {
        super("Ya existe una ruta");
    }
    
    
}
