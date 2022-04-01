
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
public class RellenandoVcetor20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
   int arreglo[] = new int [10];
        int contador = 10;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = contador--;
        System.out.println ( arreglo [i]);
        } 
    }
}
