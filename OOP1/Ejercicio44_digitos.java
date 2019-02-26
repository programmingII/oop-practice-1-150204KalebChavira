/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 26/02/19
Hour: 1:10*/

import java.util.Scanner;

class Ejercicio44_digitos{		//inicio de la clase
public static void main(String [] args){//inicio del main
int n,suma;
Scanner sc = new Scanner(System.in);

System.out.println("Ingresa tu numero de de repeticion: ");

n=sc.nextInt();

  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
suma= n+(n*11)+(n*111);
System.out.print("La suma es: " + suma);
}		//salida del main 
}		//salida de la clase