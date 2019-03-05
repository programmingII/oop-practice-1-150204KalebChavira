/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 05/03/2019
Hour: 9:23*/

import java.util.Scanner;//Se importa el Scanner 

class Ejercicio69_mitadString{//inicio de la clase
public static void main(String[]args){//inicio del main
String a;//Se declara una variable tipo String.
Scanner sc = new Scanner(System.in);//Se crea un nuevo scanner sc
System.out.println("Ingresa el mensaje: ");//Mensaje en pantalla
a = sc.nextLine();//Se capura el string por el scanner
System.out.println("La mitad de la cadena es: " + a.substring(0,a.length()/2));//se imprime la cadeca introducida llegando solo hasta la mitad

}//fin del main
}//fin de la clase
