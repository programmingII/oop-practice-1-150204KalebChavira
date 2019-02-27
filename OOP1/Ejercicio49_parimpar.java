/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 12:53*/

import java.util.Scanner;
class Ejercicio49_parimpar	{	//inicio de la clase
public static void main(String [] args){//inicio del main
  Scanner sc= new Scanner(System.in); 


System.out.print("Ingrese el numero: \n>");//pidea al usuario que ingrese un numero
int num=sc.nextInt();//scanea el numero

if(num%2==0){//mod dos para ver si deja un residuo al divirlo entre dos
System.out.println("1, tu numero es par");//si es asi imprime que es par
}
else{//de otra manera sera impar
System.out.println("0, tu numero es impar");//imprime que es impa
}

}		//salida del main 
}		//salida de la clase
