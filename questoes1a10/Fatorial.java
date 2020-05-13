/**
 * 
 */
package questoes1a10;

import java.util.Scanner;

/**
 * @author wyltamar
 * Classe que calcula o fatorial de um
 * numero inteiro e não negativo fornecido 
 * pelo usuario
 *
 */
public class Fatorial {

	
	public static void main(String[] args) {
			int numero, fatorial = 1;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite um numero inteiro positivo");
			numero = entrada.nextInt();
			
			for(int num = numero; num >= 1; num-- ) {
				
				fatorial *= num;
			}
				
			System.out.println("O fatorial de "+numero+ " = " +fatorial);
	}

}
