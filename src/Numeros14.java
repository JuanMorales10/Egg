
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
public class Numeros14 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int i;
        int suma;
        suma=0;
        i=0;
        do {
          System.out.println("Ingrese su numero: "+(i));
                   num = leer.nextInt();
                   i = i + 1;
                   if(num < 0){
                       System.out.println("Su numero es negativo, por lo tanto no es valido.");
                       break;
                   }else if ( num > 0 ){
                       suma = suma + num ;
                   }
        } while (num !=0);
        
        System.out.println("La suma de sus numeros es: "+suma);
        
    }
    
}



