/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 25/02/19
Hour: 10:33*/

import java.nio.charset.Charset;		//Importamos la libreria del Scanner

class Ejercicio40_vars{		//inicio de la clase
public static void main(String [] args){//inicio del main

System.out.println("Lista de variables disponibles: ");  //mensaje de la siguiente impresion
for (String str : Charset.availableCharsets().keySet()) {//for donde busca todos los argumentos charset 
System.out.println(str);//imprime los argumentos
}//salida del for
}		//salida del main 
}		//salida de la clase