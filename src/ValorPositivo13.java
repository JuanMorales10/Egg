
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
public class ValorPositivo13 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       int num;
       int num2;
       num=0;
       System.out.println("Ingrese el valo positivo: ");
       int valor = leer.nextInt();
       do {
           System.out.println("Ingrese otro numero");
       num2 = leer.nextInt();
       num = num + num2;
       }while(num < valor);
       
       System.out.println("Su numero Inicial fue: "+valor+ ". Mientras que las sumas de sus numeros dan: "+num+ ". Por lo tanto: "+num+" es mayor que :"+valor);
       
     
           
    }
    

