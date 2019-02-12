/*Name: Joaquin Kaleb Chavira Gonzalez
Dia: 12/02/2019
Hora: 12:15*/

import java.util.Scanner;			//importar la libreria del objeto Scanner

public class Ejercicio17_sumabin {			//inicio de clase
 
public static void main(String[] args) {		//inicio del main

Scanner in = new Scanner(System.in);

long bin1, bin2;

int i = 0, base = 0;
int[] sum = new int[20];

System.out.print("Introduce el primer binario: \n>");
bin1 = in.nextLong();
System.out.print("Introduce en segundo binario: \n>");
bin2 = in.nextLong();

while (bin1 != 0 || bin2 != 0) 
{
sum[i++] = (int)((bin1 % 10 + bin2 % 10 + base) % 2);
base = (int)((bin1 % 10 + bin2 % 10 + base) / 2);
bin1 = bin1 / 10;
bin2 = bin2 / 10;
}
if (base != 0) {
sum[i++] = base;
}
--i;
System.out.print("La suma de los dos numeros binarios es: ");
while (i >= 0) {
System.out.print(sum[i--]);
}
System.out.print("\n");  
}								//salida main
}								//salida de la clase