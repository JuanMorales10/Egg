/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJavaIntro1;

import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class NotaEntre0Y10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese su nota: ");
        int nota = leer.nextInt();
        
       if (nota>=0 && nota<=10)
            System.out.println("Su nota es valida");
        else
            System.out.println("Su nota no es valida");
       
             
           
       
               
           
    
}
