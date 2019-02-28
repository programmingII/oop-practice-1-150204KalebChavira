/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 27/02/19
Hour: 2:53*/


import java.util.Scanner;
class Ejercicio57_rango2{	//inicio de la clase
public static void main(String [] args){//inicio del main

Scanner sc = new Scanner(System.in);
System.out.println("Ingresa un numero");
int num = sc.nextInt();

 int cont=0;
   
  for(int i=1; i<=num; i++){
 if(num%i==0){
 cont++;
}
}
  System.out.println(cont);
}		//salida del main 
}		//salida de la clase
