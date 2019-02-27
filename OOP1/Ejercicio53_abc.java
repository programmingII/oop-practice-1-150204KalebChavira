/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 1:30*/

import java.util.Scanner;
class Ejercicio53_abc	{	//inicio de la clase
public static void main(String [] args){//inicio del main

  Scanner sc= new Scanner(System.in); 

System.out.print("Ingrese el primer numero:");//Pedir el primer numero
int a= sc.nextInt();//capurar el primer numero

System.out.print("Ingres el segundo numero:");//Pedir el 2do numero
int b=sc.nextInt();//capurar el 2do numero

System.out.print("Ingrese el tercer numero:");//Pedir el 3er numero
int c=sc.nextInt();//capurar el 3er numero

if(b>a && c>b){//la sentencia dice que si c es mayor que c y que a es verdadero
 System.out.print("El resultado es: verdadero");//imprime si esto es verdadero
}
else{//sino
System.out.println("El resultado es: falso");//esto es falso
}





}		//salida del main 
}		//salida de la clase
