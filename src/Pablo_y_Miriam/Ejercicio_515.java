package Pablo_y_Miriam;

import java.util.Scanner;

public class Ejercicio_515 {

	public static void main(String[] args) {
		/* ACEPTA EL RETO EJERCICICIO 515  copas*/
		
		Scanner in = new Scanner(System.in);
		int n=0;
		int turno=0;
		 int copas;

	        while (true) {
	            copas = in.nextInt();
	            if (copas == 0) break;
	            System.out.println( getTurnos(copas, 1) );
	        }

	    }
		static int getTurnos(int n, int turno) {
        if (n <= 0) return 0;
        if (turno == 1) return getTurnos(n - 1, 2) + 1;
        if (n % 2 == 0) return getTurnos(n - 2, 1) + 1;
        return getTurnos(n - 1, 1) + 1;
    }
	}

