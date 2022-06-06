
package pieuler;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Main {

    
    public static void main(String[] args) {
        PiEuler primo = new PiEuler();
        
            
        Scanner sn=new Scanner(System.in);
        
        long numero = sn.nextLong();
        
        
        System.out.println(primo.obtenerPiEuler(numero));
    }
    
}
