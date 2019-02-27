/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 1:20*/

import java.util.Scanner;
class Ejercicio51_StringInt	{	//inicio de la clase
public static void main(String [] args){//inicio del main
  Scanner sc= new Scanner(System.in); 

 System.out.print("Ingrese un numero este sera en string:");// mensaje
 String num=sc.nextLine();//capturar numero en string
 int n=Integer.parseInt(num);//convertir el string a entero
 System.out.printf("El numero sigue siendo " + n);// imprimir el entero


}		//salida del main 
}		//salida de la clase
