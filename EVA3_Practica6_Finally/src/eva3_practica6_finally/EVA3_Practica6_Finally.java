/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica6_finally;

/**
 *
 * @author Usuario
 */
public class EVA3_Practica6_Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cade = "CADE";    
        try{
            System.out.println(cade.length());
        }catch(NullPointerException e){
               e.printStackTrace();
        }finally{//SIEMPRE SE EJECUTA
        //SIRVE PARA EJECUTAR CODIGO IMPORTANTE (CERRAR ARCHIVOS, LIBERAR RECURSO)
        //NADA IMPIDE GENERAR UNA EXCEPCION AQUI
        System.out.println("NO IMPORTA QUE PASE, SIEMPRE ME EJECUTO");
}
        System.out.println("FIN DEL PROGRAMA");
}
}
