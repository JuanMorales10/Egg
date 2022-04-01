
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
public class Cadenas15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /* Leedor de cadenas: Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O. */
        int i,conco,conin,conin2;
        String frase; 
        conco=0;
        conin=0;
        conin2=0;
        do {
            System.out.println("Ingrese la frase: ");
        frase = leer.nextLine();
         
            if ("x".equals(frase.substring(0, 1)) && "o".equals(frase.substring(4,5))){
                conco= conco +1;
            }else{
                conin=conin + 1;
            
            }      
        } while (!"&&&&&".equals(frase));
        conin2 = conin -1;
        System.out.println("Cantidad de lecturas correctas: "+conco);
        System.out.println("Cantidad de lecturas Incorrectas: "+conin2);
        
        
    }
    
}
