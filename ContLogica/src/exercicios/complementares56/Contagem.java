package exercicios.complementares56;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {

		int numero, cont = 0, condition = 0, cont1= 0, cont2 = 0,
			cont3 = 0, cont4 = 0;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("Digite um numero");
			numero = entrada.nextInt();
			cont++;
			
			if(numero < 0) {
				condition --;
				cont --;
			}
			
			else if(numero >= 0 && numero < 30) {
				cont1++;
			}
			else if(numero >= 26 && numero < 51) {
				cont2++;
			}
			else if(numero >= 51 && numero < 76) {
				cont3++;
			}
			else if(numero >= 76 && numero < 101) {
				cont4++;
			}
				
		} while (condition >= 0);
		
		System.out.println("Foram digitados " +cont+ "números pelo usuário");
		System.out.println( +cont1+ " estão na faixa [0 a 25.9]");
		System.out.println( +cont2+ " estão na faixa [26 a 50.9]");
		System.out.println( +cont3+ " estão na faixa [51 a 75.9]");
		System.out.println( +cont4+ " estão na faixa [76 a 100]");
	}

}
