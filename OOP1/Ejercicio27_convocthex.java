/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:30*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio27_convocthex{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String oct,hex;
int middle;

System.out.println("Ingrese el numero octal: "); //se imprime en pantalla la instruccion
oct = sc.nextLine();		//capturamos el dato del binario

middle=Integer.parseInt(oct,8); 		//se convierte del numero binario a decimal
hex=Integer.toHexString(middle);		//aqui convertimos del decimal al octal

System.out.println("El numero decimal es: "+ hex); //Aqui mismo se hace la convercion y se imprime
}
}