/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de 
la sentencia break.
 */
package estructurasdecontrolteoriaej4;

import java.util.Scanner;



public class EstructurasDeControlTeoriaEj4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int suma = 0;
        
       do {
           //num = (int) (Math.random()*10);
           System.out.println("Ingrese un numero");
           num = leer.nextInt();
           if (num == 0){
               System.out.println("Se capturó el numero cero");
               break;
           }else if (num>0) {
               suma=suma+num;
           }
           cont=cont+1;
       } while (cont<20);
        
        System.out.println("La suma de los numeros leidos es de " + suma);
    }
    
}
