package Ejercicios_entrenamiento;

import java.util.Scanner;

public class ejercicios_362 {

	public static void main(String[] args) {
		/* ACEPTA EL RETO EJERCICICIO 362 El día de Navidad */
		Scanner s = new Scanner(System.in);

		int casos;
		casos = s.nextInt();		

		int dia;
		int mes;

		for(int i=1; i<=casos; i++){

			dia = s.nextInt();
			mes = s.nextInt();

			if(dia == 25){
				if(mes == 12){
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}

		}

	}

}


