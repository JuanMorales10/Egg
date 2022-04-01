
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
public class MayusYMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que quiera modificar: ");
        String frase = leer.next();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
         System.out.println("Su frase en Mayusculas es: "+mayus);
         System.out.println("Su frase en Minusculas es: "+minus);
         
    }
    
}
