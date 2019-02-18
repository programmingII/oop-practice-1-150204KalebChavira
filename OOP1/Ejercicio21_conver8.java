/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 5:02*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio21_conver8{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
int n1;

System.out.println("Capture un numero decimal: "); //se imprime en pantalla la instruccion
n1=sc.nextInt(); //se le asigna el valor 

String bin1=Integer.toOctalString(n1);		//Aqui tenemos la convercion del String a Octal

System.out.println("El numero Octal es: " + bin1); // se imprime el resultado
}
}
