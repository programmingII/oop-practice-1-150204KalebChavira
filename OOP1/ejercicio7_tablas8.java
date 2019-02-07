/*Name: Joaquin Kaleb Chavira Gonzalez
Dia: 07/02/2019
Hora: 12:19*/

import java.util.Scanner;			//libreria del scanner para obtener datos de teclado

class ejercicio7_tablas8{ 			//inicio de la clase

public static void main (String args[]){	//inicio del main

int numero;

Scanner sc = new Scanner(System.in);		//creacion del objeto scanner
System.out.println("Ingresa el numero a multiplicar\n");
numero = sc.nextInt();			//ingreso del numero a multiplicar

for(int i=1;i<=10;i++){				//uso de un for para la repeticion de un numero
System.out.println(numero +"X"+i+"= "+(numero*i));		//impresion del cada una de las tablas
}						//salida del for

}						//cierre del main
}