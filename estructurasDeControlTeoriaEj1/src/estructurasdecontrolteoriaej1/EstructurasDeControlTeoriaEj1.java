/*
 Implementar un programa que le pida dos números enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.
 */
package estructurasdecontrolteoriaej1;

import java.util.Scanner;


public class EstructurasDeControlTeoriaEj1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero entero");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2=leer.nextInt();
        if (num1>25 && num2>25){
            System.out.println("Ambos numeros son mayores a 25");
        }else if (num1>25 || num2>25){
            System.out.println("Por lo menos uno de los numeros ingresados es mayor a 25");
         }  else {
            System.out.println("Ninguno de los numeros ingresados es mayor que 25");
        }
                
    }
    
}
