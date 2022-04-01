/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJavaIntro1;

import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author juanm
 */
public class MostrarMatriz23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [5][5];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = (int) (Math.random() * 10);
            }
        }
        
           int [][] matriz2 = matriz;
         for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz.length; j++) {
				matriz2[j][i] = matriz[i][j];
			}
		}
for(int i = 0; i < matriz[i].length; i++)
		{
			for(int j = 0; j < matriz.length; j++)
			{
				System.out.print(matriz2[i][j] + "\t" );
			}
			System.out.println();
		}
        

         
    }
}
