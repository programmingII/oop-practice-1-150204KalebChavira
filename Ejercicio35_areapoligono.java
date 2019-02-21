/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 21/02/19
Hour: 1:30*/

import java.util.Scanner;		//Importamos la libreria del Scanner

class Ejercicio35_areapoligono{		//inicio de la clase
public static void main(String [] args){//inicio del main

Scanner sc = new Scanner(System.in);	//Creamos un objeto Sc para capturar datos del teclado
int num;	//declaracion de una variable de los numeros de lados
double d,a;	//declaracion de variables doubles de distancia y area

System.out.println("Ingresa la cantidad del lados del poligono: ");	//mensaje para obtener el numero de los lados
nl=sc.nextInt();							//capurar el numero de lados
System.out.println("Ingresa la distancea de uno de los lados: ");	//mensaje para obtener la distancea
d=sc.nextInt();								//capturar la distancea de un lado
a=(num*d^2)/(4*Math.tan(Math.PI/num));					//formula del area del poligono
System.out.println("El area de tu poligono es de: " + a);		//salida del area del poligono

}		//salida del main 
}		//salida de la clase