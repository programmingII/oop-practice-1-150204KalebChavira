/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:40*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio27_convocthex{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String oct,hex;   //se declara las conversiones
int middle;       // punto medio para almacenar en decimal

System.out.println("Ingrese el numero octal: "); //se pide el numero octal
oct = sc.nextLine();		//capturamos el dato del octal

middle=Integer.parseInt(oct,8); 		//se convierte del numero oct a decimal
hex=Integer.toHexString(middle);		//aqui convertimos del decimal al hexadecimal

System.out.println("El numero hexadecimal es: "+ hex); //Aqui se imprime el hexadecimal
}
}
