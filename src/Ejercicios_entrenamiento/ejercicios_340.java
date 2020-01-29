package Ejercicios_entrenamiento;

import java.util.Scanner;

public class ejercicios_340 {

	public static void main(String[] args) {
		/* ACEPTA EL RETO EJERCICICIO 340 Cuadrados con cerillas */
		Scanner in=new Scanner(System.in);
        int numCasosDePrueba = in.nextInt();

        for (int i = 1; i <= numCasosDePrueba; i++) {
        	//Recojo los valores del horizontal y vertical para calcularlo. 
	        int horizontal = in.nextInt(); //horizontal.
	        int vertical = in.nextInt();   //vertical.
	        
	        int resultado =  ((horizontal + 1) * vertical) + (vertical + 1) * horizontal;
	     
	        // -- Imprimo el resultado de la operación.
	        System.out.println(resultado);
        }  
    }
}
