/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 21/02/19
Hour: 12:33*/

import java.util.Scanner;		//Importamos la libreria del Scanner

class Ejercicio33_sumadigitos{		//inicio de la clase
public static void main(String [] args){//inicio del main
Scanner sc = new Scanner(System.in);	//Creamos un objeto Sc para capturar datos del teclado
int a;		//declaramos una variable entero a
int t=0;	//incializamos en 0 una variable para acumular la suma de los digitos

System.out.println("Ingrese el numero para la suma: "); //pedimos el numero para sumarlo entre el mismo
a=sc.nextInt();	//capturamos el numero entero a sumar

while (a != 0) {	//iniciamos u n ciclo while para separar a hasta hacerlo 0
t += a % 10;		//acumulamos en t el valor de los digitos de a
a /= 10;		//subdividimos el mismo valor de a para el siguiente digito

}			//cierre del ciclo while
System.out.println("La suma es de: " + t);	//salida del valor de la suma en t
}		//salida del main 
}		//salida de la clase