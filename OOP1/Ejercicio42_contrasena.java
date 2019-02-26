/*Name: Joaquin Kaleb Chavira Gonzalez
Date: 25/02/19
Hour: 10:55*/

import java.io.Console;

class Ejercicio42_contrasena{		//inicio de la clase
public static void main(String [] args){//inicio del main
Console cons;
if ((cons = System.console()) != null) {
char[] pass_ward = null;
try {
pass_ward = cons.readPassword("Introduce tu contraseña");
System.out.println("tu contraseña es : " + new String(pass_ward));
} finally {
if (pass_ward != null) {
java.util.Arrays.fill(pass_ward, ' ');
}
}
} else {
throw new RuntimeException("Can't get password...No console");
}
}		//salida del main 
}		//salida de la clase