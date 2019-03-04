/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:50*/

import java.util.Scanner;


public class Ejercicio65_mod{
 public static void main(String[] args){

Scanner sc=new Scanner(System.in);		//scanner

 System.out.print("Ingrese el primer numero:");//mensaje
 int a= sc.nextInt();//pedir el primer numero

 System.out.print("Ingrese el mod:");//mensaje
 int b=sc.nextInt();//capurar segundo numero y sea el mod

 int  division=a/b; 	//division para sacar el mod
 int resultado= (a)-(division*b);//el resultado
 System.out.print("El resultado del mod es: "+resultado);
}
}
