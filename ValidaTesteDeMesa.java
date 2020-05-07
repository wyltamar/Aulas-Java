package capitulo4;

import java.util.Scanner;

public class ValidaTesteDeMesa {

	public static void main(String[] args) {

		int numero, total;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um numero:");

		numero = ler.nextInt();

		System.out.println("O numero informado é " + numero);

		if (numero > 10) {

			total = 100;

		} else if (numero > 20) {

			total = 200;

		} else if (numero == 18) {

			total = 300;

		} else if (numero == 32) {

			total = 400;

		} else {
			total = 500;
		}

		System.out.println("O valor total é: " + total);

	}

}
