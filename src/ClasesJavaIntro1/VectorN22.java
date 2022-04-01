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
public class VectorN22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamano del vector: ");
        n = leer.nextInt();
        int [] vector = new int[n];
       
       int sum1= 0;
       int sum2=0;
       int sum3=0;
       int sum4=0;
       int sum5=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero "+i);
            int num = leer.nextInt();
            String x = Integer.toString(num);
           
            switch (x.length()){
          case 1:
              sum1= sum1+ 1;
              continue;
          case 2:
              sum2= sum2+ 1;
              continue;
          case 3:
              sum3 = sum3+ 1;
              continue;
          case 4:
              sum4 = sum4+ 1;
              continue;
          case 5:
              sum5 = sum5 + 1;
               
              
              
              
            
        }
             
      
      
      }
         System.out.println("Usted ingreso "+sum1+" numeros de 1 digito.");
         System.out.println("Usted ingreso "+sum2+" numeros de 2 digitos.");
         System.out.println("Usted ingreso "+sum3+" numeros de 3 digitos.");
         System.out.println("Usted ingreso "+sum4+" numeros de 4 digitos.");
         System.out.println("Usted ingreso "+sum5+" numeros de 5 digitos.");
    }
    
}
