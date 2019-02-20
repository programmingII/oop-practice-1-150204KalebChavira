/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 17/02/19
Hour: 6:30*/
import java.util.Scanner; //Importamos la libreria Scanner

public class Ejercicio31_version{ 				//declaracion de la clase 
public static void main (String [ ] args){			//declaracion del main

System.out.println("\nVersion de Java: "+System.getProperty("java.version"));
System.out.println("Java Version Ruta: "+System.getProperty("java.runtime.version"));
System.out.println("Java Ruta: "+System.getProperty("java.home"));
System.out.println("Java Compañia vendedor: "+System.getProperty("java.vendor"));
System.out.println("Java Vendedor URL: "+System.getProperty("java.vendor.url"));
System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
}//fin del metodo main
}//fin de la clase