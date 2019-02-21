/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 21/02/19
Hour: 1:06*/

import java.util.Scanner;		//Importamos la libreria del Scanner

class Ejercicio34_areaHe{		//inicio de la clase
public static void main(String [] args){//inicio del main
Scanner sc = new Scanner(System.in);	//Creamos un objeto Sc para capturar datos del teclado
double l,a;

System.out.println("Ingresa el valor de un lado del hexagono: ");		//pedimos un valor de los lados del hexagono
l=sc.nextInt();									//caputaramos el valor de valor
a=(6*(l*l))/(4*Math.tan(Math.PI/6));			//aplicamos la formula del area a  traves de un lado
System.out.println("El area del hexagono es: "+ a);	//imprimimos el area del hexagono


}		//salida del main 
}		//salida de la clase