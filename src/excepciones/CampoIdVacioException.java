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
public class CampoIdVacioException extends RuntimeException{

    public CampoIdVacioException() {
    super("Debes completar el campo de identificación del usuario");
    }
    
    
    
}
