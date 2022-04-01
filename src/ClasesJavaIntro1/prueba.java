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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
     int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		int x, y;
		
		
		
		for (x = 0; x < matriz.length; x++)
		{
			for (y = 0; y < matriz[x].length; y++)
			{
				matrizT[y][x] = matriz[x][y];
			}
		}
		System.out.println("Matriz Traspuesta" + "\n");
		
		for(x = 0; x < matriz[x].length; x++)
		{
			for(y = 0; y < matriz.length; y++)
			{
				System.out.print(matrizT[x][y] + "\t" );
			}
			System.out.println();
		}

	
   
        
    }
    }

