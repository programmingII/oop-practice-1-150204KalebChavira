/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:30*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio26_convoctbin{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String oct,bin;//aqui se declaran los datos de la conversion
int middle; // punto medion de la convesion para almacenar un decimal

System.out.println("Ingrese el numero octal: "); //se pide el numero octal
oct = sc.nextLine();		//capturamos el dato del octal

middle=Integer.parseInt(oct,8); 		//se convierte del numero octal a decimal
bin=Integer.toBinaryString(middle);		//aqui convertimos del decimal al binario

System.out.println("El numero binario es: "+ bin); //Aqui mismo se hace la convercion y se imprime
}
}
