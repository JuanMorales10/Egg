
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
public class Exchange19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
         
        System.out.println("Ingrese la cantidad de euros que quiera cambiar: ");
        int euros = leer.nextInt();
        
        
        cambiodedivisas(euros);
        
        
    }
    
    public static void cambiodedivisas(int euros) {
        // logica
        Scanner leer = new Scanner(System.in);
        int lf,yf,df,ef;
        double l = 0.86;
        double y = 129.852;
        double dolar =  1.2;
        
       lf= (int) (l * euros);
       yf= (int) (y * euros);
       df= (int) (dolar * euros);
       
        System.out.println("MENU");
        System.out.println("1. Cambio a Libras");
        System.out.println("2. Cambio a Yenes");
        System.out.println("3. Cambio a Dolares");
        System.out.println("4. Salir");
        System.out.println("Elija opción: ");
        
        String op = leer.next();
       
        
        
        
        switch(op){
            case "1":
               
                System.out.println("El cambio de sus : "+euros+" a Libras da: "+lf);
                break;
            case "2":
               
                System.out.println("El cambio de sus :" +euros+ " a Yenes da: "+yf);
                break;
            case "3":
                System.out.println("El cambio de sus : "+euros+" a Dolares da: "+df);
                break;
            case"4":
                System.out.println("Usted eligio Salir del programa ");
                break;
        }
    }      
    
}
