/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:35 */

import java.util.Scanner;


public class Ejercicio63_mayor{
 public static void main(String[] args){

Scanner sc=new Scanner(System.in);		//scanner
 System.out.print("Ingrese el primer numero:");//mensaje
 int a=sc.nextInt();//capturar numero 1

System.out.print("Ingrese el segundo numero:");//mensaje
int b=sc.nextInt();	//capturar un segundo numero

if(a>b){		//si a es mayor que b
 System.out.print("El mayor es: " + a);//imprime a
}
 else{
   if(a<b){//si a es menor que b
    System.out.print("El mayor es: " + b);//imprime b
    }
     else{//si ningun caso sucede
      if(a==b ){
    System.out.print("0");
     }
       else{
   if(a%6 == b%6){//si son iguales
  System.out.print(a); //salida de a 
}
 }
}
}}
}

