/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_excepciones;

/**
 *
 * @author Usuario
 */
public class EVA3_1_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //checked exceptions lo vemos en manejo de archivos
        //UNCHECKED exceptions --> runtimeexception, error
        //ARITHMETIC EXCEPTION : DIVISION ENTRE 0
        int x  = 10, y = 0,resu;
        resu = x/y;
        //COMO PRODUCE UNA EXCEPCION NO PODEMOS CONTINUAR EJECUTANDO EL CODIGO
        System.out.println("DIVISION x/y = " + resu);
        //ARRAYINDESOUTOFBOUND
        int [] arreglo = new int[5];
        System.out.println(arreglo[6]); //posicion inexistente
        
    }
}
