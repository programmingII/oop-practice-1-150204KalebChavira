/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 1:10*/

import java.util.Scanner;
class Ejercicio50_div35	{	//inicio de la clase
public static void main(String [] args){//inicio del main
  Scanner sc= new Scanner(System.in); 

System.out.println("Numero divisibles entre 3:");//mensaje
for (int i=1;i<=100;i++){//ciclo del 1-100
if(i%3==0){//mod 3 para ver los numeros divisibles entre 3
System.out.print(i+", ");//si es asi imprime los numeros
}
}

System.out.println("\nNumero divisibles entre 5:");//mensaje
for (int i=1;i<=100;i++){//ciclo del 1-100
if(i%5==0){//mod 5 para ver quienes son divisibles entre 5
System.out.print(i+", ");//si es asi imprime los numeros
}
}

System.out.println("\nNumero divisibles entre 3:");//mensaje
for (int i=1;i<=100;i++){//for del 1-100
if(i%3==0 && i%5==0){//mod 3 y 5 para ver los numeros que son divisibles entre estos
System.out.print(i+", ");//si es asi imprime los numeros
}
}



}		//salida del main 
}		//salida de la clase
