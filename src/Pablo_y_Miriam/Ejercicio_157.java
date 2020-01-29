package Pablo_y_Miriam;

import java.util.Scanner;

public class Ejercicio_157 {

	public static void main(String[] args) {
/* ACEPTA EL RETO EJERCICICIO 157 ¿cuantos dias faltan? */ 
		
		Scanner in=new Scanner(System.in);

		int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int dia;
		int mes;
		int resultado;
        int casos = in.nextInt();

        while (casos != 0) {

            dia = in.nextInt();
            mes = in.nextInt();

            resultado = meses[mes-1] - dia;
            for (int i = mes; i < 12; i++) resultado += meses[i];

            System.out.println(resultado);
        }

}
}


