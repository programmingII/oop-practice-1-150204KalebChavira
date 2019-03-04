/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:13 */

import java.util.Scanner;
public class Ejercicio60_cambio{
public static void main(String[] args){	
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese la frase: ");
String Linea = sc.nextLine();
String[] words =Linea.split("[ ]+");
System.out.println("La penultima palabra es: "+words[words.length-2]);
}			
}
