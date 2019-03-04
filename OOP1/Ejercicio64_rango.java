/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:42*/

import java.util.Scanner;


public class Ejercicio64_rango{
 public static void main(String[] args){

Scanner sc=new Scanner(System.in);		//scanner

 System.out.print("Ingrese el primer numero:");//mensaje
 int a= sc.nextInt();//pedir el primer numero

 System.out.print("Ingrese el segundo numero:");//mensaje
 int b=sc.nextInt();//capurar segundo numero

 if( a>25 && a<75 || b>25 && b<75){//rango en el quw los dos numeros deben de estar
  System.out.print("Verdadero");//sentencia cumplida
 }
else{//en caso de que esten fuera de rango
 System.out.print("Numero fuera de rango");
}}}
