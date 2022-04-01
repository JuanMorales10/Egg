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
public class Primerletradefrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su Frase o Palabra: ");
        String Frase = leer.nextLine();
        String Var1;
        Var1 = Frase.substring(0,0);
        if( Var1=="A") {
            System.out.println("Correcto"); }
         else  
            System.out.println("Incorrecto");
         
    
    }
