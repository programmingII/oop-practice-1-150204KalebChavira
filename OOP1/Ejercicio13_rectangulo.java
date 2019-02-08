/*Name: Joaquin Kaleb Chavira Gonzalez
Dia: 08/02/2019
Hora: 3:40*/


public class Ejercicio13_rectangulo {			//inicio de clase
 
public static void main(String[] args) {		//main
double base= 5.5;		//asignar la base
double altura = 8.5;		//asignar el perimetro	
double area, perimetro;		//inicializar dos variables del area y perimetro

area= base * altura;		//formula del area
perimetro = (base*2)+(area*2);	//formula del perimetro

System.out.println("El area es igual a: "+base+" X "+ altura + "= "+ area);		//imprimir el area
System.out.println("El perimetro es igual a: 2*("+base+"+"+altura+")= "+ perimetro);	//imprimir el perimetro
}								//salida main
}		