/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:30*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio29_convhexbin{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String hex,bin;
int middle;

System.out.println("Ingrese el numero hexadecimal: "); //se imprime en pantalla la instruccion
hex= sc.nextLine();		//capturamos el dato del binario

middle=Integer.parseInt(hex,16); 		//se convierte del numero binario a decimal
bin=Integer.toBinaryString(middle);		//aqui convertimos del decimal al octal

System.out.println("El numero binario es: "+ bin); //Aqui mismo se hace la convercion y se imprime
}
}