
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
public class VectortamanoN21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector: ");
        int n = leer.nextInt();
        int [] vector = new int[n];
        
        llenarvector(vector);
    }
    
    public static void llenarvector(int[] vector){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            vector [i]= (int) (Math.random() * 10);
            
        }
        
}
    
    
    public static void buscarnumero(int[] vector){
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero a buscar en el vector: ");
        n = leer.nextInt();
        for (int x = 0; x < vector.length; i++) {
            if (vector[i] == busqueda) {
             return x;
                        }
  }
  return -1;
    
    
    }    
}
