
/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 24/02/19
Hour: 6:50*/

import java.util.Scanner;		//Importamos la libreria del Scanner

class Ejercicio36_EarthDistance{		//inicio de la clase
public static void main(String [] args){//inicio del main

Scanner sc = new Scanner(System.in);	//Creamos un objeto Sc para capturar datos del teclado
double y1,y2,x1,x2;
double earthRadius = 6371.01; //Kilometros del radio del planeta

System.out.print("Ingresa la latitud de la Cordenada 1: ");
y1 = sc.nextDouble();
System.out.print("Ingreda la longitud del la Cordenada 1: ");
x1 = sc.nextDouble();
System.out.print("Ingresa la latitud de la Cordenada 2: ");
y2 = sc.nextDouble();
System.out.print("Ingreda la longitud del la Cordenada 2: ");
x2 = sc.nextDouble();

y1 = Math.toRadians(y1);
x1 = Math.toRadians(x1);
y2 = Math.toRadians(y2);
x2 = Math.toRadians(x2);

double dis = earthRadius * Math.acos(Math.sin(y1)*Math.sin(y2) + Math.cos(y1)*Math.cos(y2)*Math.cos(x1 - x2));

System.out.println("La distancea es: " + dis);

}		//salida del main 
}		//salida de la clase