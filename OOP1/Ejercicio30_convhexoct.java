/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:53*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio30_convhexoct{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String hex,oct;     //se declara los strings a transforamr
int middle;           //un numero entero el cual se hara la base del cambio a hexa

System.out.println("Ingrese el numero hexadecimal: "); //se imprime en pantalla la instruccion
hex= sc.nextLine();		//capturamos el dato del hexadecimal

middle=Integer.parseInt(hex,16); 		//se convierte del numero hexadecimal a decimal
oct=Integer.toOctalString(middle);		//aqui convertimos del decimal al octal

System.out.println("El numero octal es: "+ oct); //Aqui se imprime el resultado
}
}
