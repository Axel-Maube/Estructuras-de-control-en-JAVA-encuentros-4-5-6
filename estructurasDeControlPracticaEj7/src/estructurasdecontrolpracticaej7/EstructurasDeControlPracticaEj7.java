/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan 
las siguientes funciones de Java Substring(), Length(), equals().
 */
package estructurasdecontrolpracticaej7;

import java.util.Scanner;


public class EstructurasDeControlPracticaEj7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una secuencia");
        String secuencia = leer.nextLine();
        int correcta = 0;
        int incorrecta = 0;
         
        
        while (!secuencia.equals("&&&&&")) {
            
            if (secuencia.length()==5 && secuencia.substring(0,1).equalsIgnoreCase("x") && secuencia.substring(4,5).equalsIgnoreCase("o")) {
                correcta++;
            } else {
                incorrecta++;
            }
            System.out.println("Ingrese una secuencia");
            secuencia = leer.nextLine();
        }
        System.out.println("Las secuencias ingresadas correctas son: " + correcta);
        System.out.println("Las secuencias ingresadas incorrectas son: " + incorrecta);
        
    }
    
}
