/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 5:45*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio23_conversionbinHex{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String bin,hexa;  //variables de la conversion
int middle;       //variable del punto medio, aqui se almacena un decimal

System.out.println("Ingrese el numero binario: "); //se imprime en pantalla la instruccion
bin = sc.nextLine();		//capturamos el dato del binario

middle=Integer.parseInt(bin,2); 		//se convierte del numero binario a decimal
hexa=Integer.toHexString(middle);		//aqui convertimos del decimal al hexadecimal

System.out.println("El numero hexadecimal es: "+ hexa); //Aqui mismo se hace la convercion y se imprime
}
}
