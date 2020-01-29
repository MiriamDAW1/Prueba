package Ejercicios_entrenamiento;

import java.util.Scanner;

public class ejercicio_149 {

	public static void main(String[] args) {
		/* ACEPTA EL RETO EJERCICICIO 149 San Fermines */

		Scanner s = new Scanner(System.in);

		int num = 0;
		int mayor;
		int total;

		while(s.hasNext()) {
			mayor = 0;
			total = s.nextInt();

			if(total >= 1){
				for(int i=0; i<total; i++){
					num = s.nextInt();
					if(num > mayor){
						mayor = num;
					}

				}
				System.out.println(mayor);
			
			}

		}
}
}
