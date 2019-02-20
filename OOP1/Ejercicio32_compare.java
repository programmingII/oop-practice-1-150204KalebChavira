/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:30*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio32_compare{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del main

Scanner sc = new Scanner(System.in);
int a,b;

System.out.println("Ingresa el primer numero: ");	//mensaje de ingresar un valor
a=sc.nextInt();						//ingresar el valor atraves del metodo scanner
System.out.println("Ingresa el segundo numero: ");	//mensaje de ingresar un valor
b=sc.nextInt();						//ingresar el valor atraves del metodo scanner
System.out.println("");//salto de linea

if(a==b){						//uso de sentencia if para una igualacion
System.out.println("A==B "+a+"=="+b);			//imprimir el resultado
}

if(a!=b){						//uso de sentencia if para saber si es diferente
System.out.println("A!=B "+a+"!="+b);			//imprimir el resultado
}

if(a<b){						//uso de sentencia if para un menor que
System.out.println("A<B "+a+"<"+b);			//imprimir el resultado
}

if(a>b){						//uso de sentencia if para una mayor que
System.out.println("A>B "+a+">"+b);			//imprimir el resultado
}
}//fin del metodo main	
}//fin de la clase