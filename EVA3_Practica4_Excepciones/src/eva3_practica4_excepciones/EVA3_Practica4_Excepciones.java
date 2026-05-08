/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica4_excepciones;

/**
 *
 * @author Usuario
 */
public class EVA3_Practica4_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x = 10, y = 0, resu = 0;
      String cade = null;
      
      try{
          resu = x/y; //1.EXCEPTION
          System.out.println(cade.length());//2. IGNORA EL RESTO DEL TRY
      }catch(ArithmeticException e){
          System.out.println("ERROR DE DIVISION ENTRE CERO"); //3. EJECUTA EL CATCH
      }catch(NullPointerException e){
          System.out.println("ERROR DE CADENA VACIA");
      }
        System.out.println("FIN DEL PROGRAMA");//4.REANUDA DESPUES DEL TRY/CATCH
    }
    
}
