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
public class UsuarioYaRegistradoException extends RuntimeException{

    public UsuarioYaRegistradoException() {
        super("Ya hay una persona registrada con este mismo usuario");
    }
    
    
    
}
