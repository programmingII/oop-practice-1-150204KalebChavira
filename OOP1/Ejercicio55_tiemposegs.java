/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 1:53*/

import java.util.Scanner;
class Ejercicio55_tiemposegs	{	//inicio de la clase
public static void main(String [] args){//inicio del main

  Scanner sc= new Scanner(System.in); 

System.out.println("ingrese los segundos ");//mesaje
int num=sc.nextInt();//total de segundos
int hor=num/3600;//total de horas en los segundos
int min=(num-(3600*hor))/60;//total de min en las horas restantes
int seg=num-((hor*3600)+(min*60));//total de segundo sen los miniutos restantes
System.out.println("Horas: " + hor + "  Minutos: " + min + "  Segundos: " + seg);//salida del tiempo

}		//salida del main 
}		//salida de la clase
