/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class MenuDeOperaciones15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        int sumar,restar,dividir,multiplicar;
        System.out.println("Ingrese su primer numero: ");
        num1 = leer.nextInt();
         System.out.println("Ingrese su segundo numero: ");
        num2 = leer.nextInt();
         
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción: ");
        
        String op = leer.next();
       
        
        
        
        switch(op){
            case "1":
                sumar = num1 + num2;
                System.out.println("La suma de sus numeros da: "+sumar);
                break;
            case "2":
                restar = num1 - num2;
                System.out.println("La resta de sus numeros da: "+restar);
                break;
            case "3":
                multiplicar = num1 * num2;
                System.out.println("La multiplicacion de sus numeros da: "+multiplicar);
                break;
            case "4":
                dividir = num1 / num2;
                System.out.println("La division de sus numeros da: "+dividir);
                break;
            case"5":
                System.out.println("Usted eligio Salir del programa ");
                break;
        } 
    }
    
}
