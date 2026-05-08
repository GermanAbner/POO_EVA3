/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica3_try_catch;

/**
 *
 * @author Usuario
 */
public class EVA3_Practica3_try_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10, y = 0, resu = 0;
        try{
            resu = x/y;
        }catch (ArithmeticException miErrorcito ) {
            //NO HAY NADOTA
            miErrorcito.printStackTrace();
        }
        
        System.out.println("Resu: " + resu);
        
        
        
    }
    
}
