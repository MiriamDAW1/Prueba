package Ejercicios_entrenamiento;

import java.util.Scanner;

public class ejercicio_293 {

	public static void main(String[] args) {
		/* ACEPTA EL RETO EJERCICICIO 293 ARTROPODOS */

		Scanner sc = new Scanner(System.in);
        int i;
        int n;
        int sum;
        int o;
        int a;
        //n� patas
        
        n = sc.nextInt();
        
        for(i=0; i<n; i++){
            sum = 0;
            
            o = sc.nextInt();
            sum = 6 * o;
            
            o = sc.nextInt();
            sum = sum + (8 * o);
            
            o = sc.nextInt();
            sum = sum + (10 * o);
            
            o = sc.nextInt();
            a = sc.nextInt();
            sum = sum + (o * (2 * a));
            
            System.out.println(sum);
        }
    }
    
}

