/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 12/02/2019
Hour:12:30*/

import java.util.Scanner; 			//importamos la libreria para el scanner
public class Ejercicio17_SumaBin{		//inicio de la clase
 public static void main(String[] args)		//inicio del main
 {
  Scanner in = new Scanner(System.in);		//inicializacion del objeto scanner
  long bin1, bin2;				//declaracion de las variables binarias
  int i = 0, base = 0;				//declaracion de la base donde se iran sumando los binarios
  int[] suma = new int[20];			//variable arreglo donde se estara almacenando la suma


  System.out.print("Introduce el primer numero binario: ");		//Mensaje
  bin1 = in.nextLong();							//aqui se pide el primer valor binario
  System.out.print("Introduce el segundo numero binario: ");		//Mensaje
  bin2 = in.nextLong();							//aqui se pide el segundo valor binario

  while (bin1 != 0 || bin2 != 0) 					//inicio del ciclo while para empezar a sumar
  {
   suma[i++] = (int)((bin1 % 10 + bin2 % 10 + base) % 2);		//aqui se hace la suma de los unos y ceros del binario dependiendo del ciclo que sea
   base = (int)((bin1 % 10 + bin2 % 10 + base) / 2);			//aqui se almacena la suma de los binarios y pasa el siguiente uno en caso de que haya
   bin1 = bin1 / 10;							//si el binario tiene una cantidad de mas de dos digitos le saca el mod para el siguiente digito
   bin2 = bin2 / 10;							//...lo mismo de arriba...
  }
  if (base != 0) {							//aqui es para cerrar el ciclo de la suma cuando toda la suma ya no tenga ceros
   suma[i++] = base;							//lo que se almaceno en la base en binario se almacenará en la cadena suma
  }
  --i;									//regrasar la i a la primera cadena
  System.out.print("La suma es: ");					//mensaje antes de imrpimir la suma
  while (i >= 0) {
   System.out.print(suma[i--]+"\n");					//aqui se imprime la cadena de binarios de la ultima cadena hasta la primera
  }
   
 }						//salida del main
}						//salida de la clase