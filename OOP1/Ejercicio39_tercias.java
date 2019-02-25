/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 24/02/19
Hour: 8:23*/


class Ejercicio39_tercias{		//inicio de la clase
public static void main(String [] args){//inicio del main
int suma = 0;//inicializamos un contador para el conteo de los digitos de 3
for(int i = 1; i <= 4; i++){//for para la cadena dimenciona
for(int j = 1; j <= 4; j++){//for para la cadena bidimenciona
for(int k = 1; k <= 4; k++){//for para la cadena tridimenciona
if(k != i && k != j && i != j){//estas se estaran llenando mientras no se vayan repetiendo los numeros
suma++;//aqui se van contando la cantidades de tres digitos
System.out.println("> "+i + "|" + j + "|" + k);//salida de los digitos en forma de tercias
}//salida de if 
}//salida de primer for
}//salida de segundo for
}//salida de tercer for
System.out.println("El total de digitos es " + suma);//salida de la cantidad de tercias
}		//salida del main 
}		//salida de la clase
