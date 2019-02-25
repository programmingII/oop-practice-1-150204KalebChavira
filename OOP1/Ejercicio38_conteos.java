/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 24/02/19
Hour: 8:32*/

import java.util.Scanner;		//Importamos la libreria del Scanner

class Ejercicio38_conteos{		//inicio de la clase
public static void main(String [] args){//inicio del main

Scanner sc = new Scanner(System.in);//Creamos un objeto Sc para capturar datos del teclado
int letras=0, numeros=0, espacios=0, otros=0;	//inicializamos todo lo que vamos a leer
String frase="Hola, me llamo kaleb y tengo 21 años de edad...";//frase a leer


char [] lectura= frase.toCharArray(); //aqui se almacena lo del string a la cadena lectura

for(int i=0; i < frase.length() ;i++){//ciclo for para que lea todas las cadenas desde la 0 hasta la cadena final(length)
if(Character.isLetter(lectura[i])){//si la cadena es una letra suma 1 mas
letras ++;//suma +1 a las letras
}//cierre del primer if
else if(Character.isDigit(lectura[i])){//si la cadena es un numero suma 1 mas
numeros ++;//suma +1 a los numeros
}//cierre del segundo if
else if(Character.isSpaceChar(lectura[i])){//si la cadena es un espacio suma 1 mas
espacios ++;//suma +1 a los espacios
}//cierre del tercer if
else{//si la cadena es cualquier otra cosa suma 1 mas
otros++;//suma +1 a cualquier cosa diferente
}//cierre del ultimo if
}//cierre del for

System.out.println("La frase " + frase + " tiene:" );//mensaje de las salidas
System.out.println(numeros + " numeros");//imprime la cantidad de numeros
System.out.println(letras + " letras");//imprime la cantidad de letras
System.out.println(espacios + " espacios");//imprime la cantidad de espacios
System.out.println(otros + " puntos u otra cosa");//imprime la cantidad de los otros


}		//salida del main 
}		//salida de la clase