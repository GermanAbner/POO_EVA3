/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica2_propagacion_excepciones;

/**
 *
 * @author Usuario
 */
public class EVA3_Practica2_PROPAGACION_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A();
    }
    public static void A(){
        B();    
    }
    public static void B(){
        C();
    }
    public static void C(){
        int x = 5, y = 0,resu;
        resu = x/y;     //ARITMETIC EXCEPTION
    }
}
