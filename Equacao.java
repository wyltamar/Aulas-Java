package capitulo4;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
	
		int a, b, c, delta, x1, x2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor para a");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor para b");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor para c");
		c = entrada.nextInt();
		
		delta = (b * b) - (4 * a * c);
		
		if(delta > 0) {
			
			x1 = (int) (-b + Math.sqrt(delta)/(2*a));
			x2 = (int) (-b - Math.sqrt(delta)/(2*a));
			
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
			
		}else if(delta == 0) {
			
			x1 = (int) (-b + Math.sqrt(delta)/(2*a));
			
			System.out.println("x1 = " +x1);
			
		}else {
			System.out.println("A equação não admite solução");
		}

	}

}
