/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 05/03/2019
Hour: 9:23*/

import java.util.Scanner;//Se importa el Scanner 

class Ejercicio70_StringMix{//inicio de la clase
public static void main(String[]args){//inicio del main
String p= "Python";//declaramos el string
String t= "Tutorial";//declaramos un segundo string

if(p.length() >= t.length())//en caso de que phyton sea mas grande que tutorial o igual
System.out.println(p+t+p);//imprimimos la suma de los strings de la forma pedida
else//en caso contrario
System.out.println(t+p+t);//imprimimos la suma de los strings de la forma pedida

}//fin del main
}//fin de la clase
