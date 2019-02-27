/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 12:27*/

import java.text.SimpleDateFormat;
import java.util.Date;

class Ejercicio47_Fecha	{	//inicio de la clase
public static void main(String [] args){//inicio del main

         String patron = "yyyy/MM/dd HH:mm:s"; //patron con el imprimiremos la fecha
SimpleDateFormat forma = new SimpleDateFormat(patron);		//declaramos la forma del patron con la fecha

String date = forma.format(new Date()); //asiganmos la fecha en la varaible string date
System.out.println("Justo ahora es: " + date);//imprimimos date con el patron declarado

}		//salida del main 
}		//salida de la clase