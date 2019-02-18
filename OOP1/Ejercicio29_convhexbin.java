/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:52*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio29_convhexbin{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String hex,bin;//vars de la conversion
int middle;//punto medio en decimal

System.out.println("Ingrese el numero hexadecimal: "); //se pide el hexa
hex= sc.nextLine();		//capturamos el dato del hexa

middle=Integer.parseInt(hex,16); 		//se convierte del numero hexa a decimal
bin=Integer.toBinaryString(middle);		//aqui convertimos del decimal al binario

System.out.println("El numero binario es: "+ bin); //Aqui  se imprime el binario
}
}
