
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
public class CuatroNumeros18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
        System.out.println("Ingrese el numero: ");
        int n = leer.nextInt();
            if (n>1 && n<=20) {
                
                for (int j = 0; j >= n; j++) {
                    System.out.println(+n);
                    System.out.print("*"); 
                }
                
                
            }
        
        }
        
        
                
            
            
           
            
        }
        
       
        
    }
    
}
