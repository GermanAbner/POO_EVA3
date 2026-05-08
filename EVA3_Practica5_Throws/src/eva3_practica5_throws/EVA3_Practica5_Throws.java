/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica5_throws;

/**
 *
 * @author Usuario
 */
public class EVA3_Practica5_Throws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("La division es: " + division(10,0));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static int division(int x, int y)throws Exception{
        int resu = 0;
        if (y==0){ //VOY A GENERAR UNA EXCEPCION
            throw new ArithmeticException("El valor de la division es 0");    
        }       
        return x/y;
    }
}
