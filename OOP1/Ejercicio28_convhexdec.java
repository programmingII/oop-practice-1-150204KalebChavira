/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:50*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio28_convhexdec{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String hex;//var hexadecimal
int middle; //var decimal

System.out.println("Ingrese el numero hexadecimal: "); //se pide el hexadecimal
hex= sc.nextLine();		//capturamos el dato del hexadecimal

middle=Integer.parseInt(hex,16); 		//se convierte del numero hexa a decimal


System.out.println("El numero decimal es: "+ middle); //Aqui se imprime el decimal
}
}
