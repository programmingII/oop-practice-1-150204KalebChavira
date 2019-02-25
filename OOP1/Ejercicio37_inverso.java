/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 24/02/19
Hour: 7:00*/

import java.util.Scanner;		//Importamos la libreria del Scanner

class Ejercicio37_inverso{		//inicio de la clase
public static void main(String [] args){//inicio del main

Scanner sc = new Scanner(System.in);	//Creamos un objeto Sc para capturar datos del teclado
char[] frase;
int i;
System.out.println("Escribe una frase");
frase = sc.nextLine().toCharArray();
        System.out.print("Al reves es.- ");
        for (i = frase.length - 1; i >= 0; i--) {
            System.out.print(frase[i]);
        }
        System.out.print("\n");


}		//salida del main 
}		//salida de la clase