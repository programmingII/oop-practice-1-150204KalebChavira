/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 4:40*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio19_conver2{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
int n1;

System.out.println("Capture un numero decimal: "); //se imprime en pantalla la instruccion
n1=sc.nextInt(); //se le asigna el valor 

String bin1=Integer.toBinaryString(n1);

System.out.println("El numero en binario es: " + bin1); // se imprimen los valores de las variables y la suma de ellas
}
}