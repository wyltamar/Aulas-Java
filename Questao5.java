package capitulo5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número da sequência:");
		int numero = entrada.nextInt();
		
		for(int i = 0; i < numero ; i++) {
			System.out.println("("+i+"):" +Questao5.fibo(i)+ "\t");
		}

	}
	
	public static long fibo(int n) {
		if(n < 2) {
			return n;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
			}

}
