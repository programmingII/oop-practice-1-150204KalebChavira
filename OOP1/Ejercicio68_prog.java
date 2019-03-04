/* Name: Joaquin Kaleb Chavira Gonzalez 
Date: 04/03/2019
Hour: 3:33*/

public class Ejercicio68_prog{
public static void main(String[] args){

 String str="programing 2.0";//string guardado
 String subString=str.substring(str.length()-3);//checa cual es el penultimo string
 String newStr=subString+subString+subString+subString;	//suma de parcialidades del string
System.out.println(newStr);//string 1
}
}