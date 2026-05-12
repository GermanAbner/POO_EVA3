/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica7_custom_exception;

/**
 *
 * @author Usuario
 */
public class EVA3_Practica7_Custom_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            throw new MiExcepcionChecked("Excepcion Personalizada");
        } catch (MiExcepcionChecked ex) {
            //Logger.getLogger(EVA3_Practica7_Custom_Exception);
        }
    }
}

class MiExcepcion extends RuntimeException {

    public MiExcepcion(String message) {
        super(message);
    }
}

class MiExcepcionChecked extends Exception {

    public MiExcepcionChecked(String message) {
        super(message);
    }
}