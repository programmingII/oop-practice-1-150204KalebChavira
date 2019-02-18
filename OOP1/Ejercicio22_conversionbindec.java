/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 5:20*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio22_conversionbindec{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado
String bin;   //Se declara la variable para el binario

System.out.println("Ingrese el numero binario: "); //se imprime en pantalla la instruccion
bin=sc.nextLine(); //se le asigna el valor 

System.out.println("El numero decimal es: " + Integer.parseInt(bin,2)); //Aqui mismo se hace la convercion y se imprime
}
}
