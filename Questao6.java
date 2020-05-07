package capitulo5;

import java.util.Scanner;

public class Questao6 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número:");
		int numero = entrada.nextInt();
		
		while(numero != 1) {
			
			if(numero % 2 == 0) {
				numero /= 2;
				System.out.println("Resultado Par:"+numero);
			}
			else if(numero % 2 == 1) {
				numero = numero *3 + 1;
				System.out.println("Resultado Ímpar:"+numero);
			}
		}
		

	}

}
