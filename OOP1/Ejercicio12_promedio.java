/*Name: Joaquin Kaleb Chavira Gonzalez
Dia: 07/02/2019
Hora: 1:30*/

import java.util.Scanner;			//importar la libreria Scanner

public class Ejercicio12_promedio {			//inicio de clase
 
public static void main(String[] args) {		//main
double a,b,c;
double res;
Scanner sc= new Scanner(System.in); 			//Creacion del objeto Scanner

System.out.println("Ingresa el nuemero 1\n");		//Mensaje para ingresar un datoA
a=sc.nextInt();						//Escaneo del dato A

System.out.println("Ingresa el nuemero 2\n");		//Mensaje para ingresar un datoB
b=sc.nextInt();						//Escaneo del dato B

System.out.println("Ingresa el nuemero 3\n");		//Mensaje para ingresar un datoC
c=sc.nextInt();       					//Escaneo del dato C

res=(a+b+c)/3;
System.out.println("El promedio es= " + res);
}								//salida main
}								//salida class