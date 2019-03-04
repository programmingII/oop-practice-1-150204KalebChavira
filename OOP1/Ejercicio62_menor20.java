/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:33 */

import java.util.Scanner;


public class Ejercicio62_menor20{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);
 System.out.print("Ingrese el primer numero:");
 int a=in.nextInt();

System.out.print("Ingrese el segundo numero:");
int b=in.nextInt();

System.out.print("Ingrese el tercer numero:");
int c=in.nextInt();
 
 if(((a-b) >= 20 || (b-c) >= 20 || (c-a)>= 20)){
 System.out.println("verdadero");
}
else{
  System.out.println("falso");
 }

}}