/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:13 */

import java.util.Scanner;

public class ejercicio61_pinvertida{
 public static void main(String[] args){
	
     Scanner lector=new Scanner(System.in);
     String Cadenainvertida="";

     System.out.print("Ingrese la palabra para invertirla:");
     String Cadena=lector.nextLine();
    
    for(int i= Cadena.length()-1;i>=0;i--){
  Cadenainvertida += Cadena.charAt(i);
 }
System.out.println(Cadenainvertida);
}}