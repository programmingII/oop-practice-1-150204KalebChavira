/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 05/03/2019
Hour: 9:35*/

import java.util.Scanner;//Se importa el Scanner 

class Ejercicio71_palabrasininicio{//inicio de la clase
public static void main(String[]args){//inicio del main

Scanner sc= new Scanner(System.in);/scanner
String a,b;//decalramos dos variables string

System.out.println("Escribe una palabra");//mensaje
a = sc.nextLine();//caputuramos el valor del string 1

System.out.println("Escribe una segunda palabra");//mensaje
b = sc.nextLine();//caputuramos el valor del string 2

System.out.println(a.substring(1,a.length())+b.substring(1,b.length()));//imprimir los dos strings sin la primera letra

}//fin del main
}//fin de la clase
