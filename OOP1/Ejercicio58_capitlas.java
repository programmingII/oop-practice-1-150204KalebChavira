/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 5:20*/


import java.util.Scanner;
class Ejercicio58_capitlas{	//inicio de la clase
public static void main(String [] args){//inicio del main

Scanner sc = new Scanner(System.in);

System.out.print("Ingrese la frase:");
String isim =sc.nextLine();

String substring="";
Scanner line = new Scanner(isim);

while(line.hasNext()){
String yenikelime =line.next();
substring+= Character.toUpperCase( yenikelime.charAt(0))+yenikelime.substring(1)+" ";

}
System.out.println(substring.trim());
}		//salida del main 
}		//salida de la clase
