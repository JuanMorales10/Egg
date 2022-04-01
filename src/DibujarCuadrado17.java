
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
public class DibujarCuadrado17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos que tendra su cuadrado: ");
        int n = leer.nextInt();
        int i,j;
        for (i = 0;  i <= n; i++) {
            for (j = 0; j <= n ; j++) {
                 System.out.print("*");
                
            }
            System.out.println("");
          
        }
    }
    
}
