/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:16*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio24_conversionbinoctal{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String bin,oct;   //variables ha transformar
int middle;   //variable de punto medio en decimal

System.out.println("Ingrese el numero binario: "); //se pide un numero binario
bin = sc.nextLine();		//capturamos el dato del binario

middle=Integer.parseInt(bin,2); 		//se convierte del numero binario a decimal
oct=Integer.toOctalString(middle);		//aqui convertimos del decimal al octal

System.out.println("El numero Octal es: "+ oct); //Aqui se imprime el octal
}
}
