/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 12:00*/

import java.io.File;

class Ejercicio45_documents	{	//inicio de la clase
public static void main(String [] args){//inicio del main

  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");//busca el documento .txt y reenvia la cantidad de bytes que tiene
  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");//busca el documento .txt y reenvia la cantidad de bytes que tiene
}		//salida del main 
}		//salida de la clase
