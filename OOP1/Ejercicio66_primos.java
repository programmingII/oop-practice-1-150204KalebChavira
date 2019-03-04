/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 2:50*/

public class Ejercicio66_primos{
 public static void main(String[] args){

int acum=0;

for (int i=1; i<=100; i++){
if (i%i==0 && i%(i-1)==1){
acum = acum + i;
}
}
System.out.println("La cantidad de la suma de numeros primos es: " + acum);
}
}
