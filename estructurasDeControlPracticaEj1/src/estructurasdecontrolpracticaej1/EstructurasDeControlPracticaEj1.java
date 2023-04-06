/*
 Crear un programa que dado un número determine si es par o impar.
 */
package estructurasdecontrolpracticaej1;

import java.util.Scanner;


public class EstructurasDeControlPracticaEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es par o impar");
        int num = leer.nextInt();
        if (num%2==0){
            System.out.println("El numero ingresado " + num + " es par");
        } else {
            System.out.println("El numero ingresado " + num + " es Impar");
        }
            
    }
    
}
