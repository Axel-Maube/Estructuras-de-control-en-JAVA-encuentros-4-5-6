/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package estructurasdecontrolteoriaej5;

import java.util.Scanner;

public class EstructurasDeControlTeoriaEj5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        int j;
        int num;
        for (i=0;i<4;i++){
            System.out.println("Ingrese un numero entre 1 y 20");
            num = leer.nextInt();
    
        while (num<1 || num>20){
            System.out.println("El numero ingresada es incorrecto, ingreselo nuevamente");
            num = leer.nextInt();
      }      System.out.print(num + " ");
        for (j=0;j<num;j++){
          
             System.out.print("*");
      }
            
            System.out.println("");
    
    }
}
}