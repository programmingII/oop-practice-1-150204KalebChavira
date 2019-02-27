/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 1:20*/

import java.util.Scanner;
class Ejercicio52_StringIntsuma	{	//inicio de la clase
public static void main(String [] args){//inicio del main
  Scanner sc= new Scanner(System.in); 

 System.out.print("Ingrese un numero este sera en string:");// mensaje
 String num1=sc.nextLine();//capturar numero en string
 int n1=Integer.parseInt(num1);//convertir el string a entero

System.out.print("Ingrese un segundo numero este sera en string:");// mensaje
 String num2=sc.nextLine();//capturar numero en string
 int n2=Integer.parseInt(num2);//convertir el string a entero

 System.out.printf("El resultado es: " + (n1+n2));// imprimir el entero


}		//salida del main 
}		//salida de la clase
