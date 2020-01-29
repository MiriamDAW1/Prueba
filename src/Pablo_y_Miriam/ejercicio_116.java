package Pablo_y_Miriam;

import java.util.Scanner;

public class ejercicio_116 {

	public static void main(String[] args) {
		/* Quizá, dentro de muchos años, nosotros seamos los viejos que contemos batallitas de cómo
		se enseñaba informática. Y quizá entonces, digamos que en la primera clase de cualquier
		curso en el que se explicara un lenguaje de programación, se tenía que salir habiendo escrito "un hola mundo".
		 Y eso es lo que vamos a hacer. Escribir un programa que escriba tantos "hola mundo" 
		como nos pidan.
		
		Entrada:
		La entrada consta de una única línea que contiene un número n, 0 ≤ n ≤ 5, que indica cuántos
	    mensajes hay que emitir.

		Salida:
		Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo."   */
			
			Scanner in= new Scanner(System.in);
			
			int num=in.nextInt();
			
			for(int i=0; i<num;i++){
				System.out.println("Hola mundo.");
			}
			
	}
	}
