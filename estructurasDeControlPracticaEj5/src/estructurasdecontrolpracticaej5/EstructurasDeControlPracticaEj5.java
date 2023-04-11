/*
 Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.

 */
package estructurasdecontrolpracticaej5;

import java.util.Scanner;




public class EstructurasDeControlPracticaEj5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int valorLimite = leer.nextInt();
        int suma = 0;
        
        
        do {
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        suma += num;
       } while (valorLimite>suma); 
        System.out.println("La suma de los numeros ingresados es: " + suma);
}
}