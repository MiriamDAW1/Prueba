package Pablo_y_Miriam;

import java.util.Scanner;

public class Ejercicio_313 {

	public static void main(String[] args) {
 /* ACEPTA EL RETO EJERCICICIO 313 ¿cuantos dias faltan? */
		
		Scanner in= new Scanner(System.in);
		
		int numeros=in.nextInt();
		
		int num1=0;
		int num2=0;
		
		for(int i=0; i<numeros;i++){
		
		num1=in.nextInt();
		num2=in.nextInt();
		
		int resultado=num1-num2;
		
		if(resultado>=0){
			System.out.println("NO");
		}else{
			System.out.println("SI");
		}
	}
}
}

