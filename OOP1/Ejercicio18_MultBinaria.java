/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 4:20 */
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio18_MultBinaria{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del programa principal 

Scanner sc=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar datos desde el teclado

System.out.println("Capture un numero binario: "); //se imprime en pantalla la instruccion
String n1=sc.nextLine(); //se le da el valor a number1 el numero capturado en este pero en cadena 
System.out.println("Capture otro numero binario: "); //se imprime en pantalla la instruccion
String n2=sc.nextLine(); //se le da el valor a number1 el numero capturado en este pero en cadena 
	
int bin1=Integer.parseInt(n1,2); //se utiliza el metodo parseInt para poder crear el numero binario de binario a decimal
int bin2=Integer.parseInt(n2,2); //se utliza el metodo parseInt para poder convertir el numero a binario de binario a decimal
	
int res=(bin1*bin2);//suma de los numeros binarios

String resf=Integer.toString(res,2);//se convierte el resultado de la suma de decimales se convierte a binario
System.out.println("El resultado de la multiplicacion es: " + resf); // se imprimen los valores de las variables y la suma de ellas
}
}