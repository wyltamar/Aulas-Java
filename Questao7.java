package capitulo5;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		int cont = 0;
		float numInicial, numFinal,  n1 = 0, n2 = 0;
		float medianaPar = 0f;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero inicial da sequência");
		numInicial = entrada.nextFloat();
		
		System.out.println("Digite o numero final da sequência");
		numFinal = entrada.nextFloat();
		
		
		for(float i = numInicial ; i <= numFinal; i++) {
			System.out.println("i=" +i);
			cont++;
			
		}
			
		if(cont % 2 == 1) {
			
			cont /= 2;
		
			for(float j = numFinal; j >= numInicial + cont; j--) {
					
				if(j == numFinal - cont) {
					System.out.println("A mediana é =" +j);
				}
			}
		}
		else  {
			
			cont /= 2;
			for(float j = numFinal; j >= numInicial + cont; j--) {
				
				if(j == numInicial + cont ) {
					 n1 = j;
					 n2 = j-1;
					 medianaPar = (n1 + n2)/2;
					 System.out.printf("A mediana = %.2f", medianaPar);
				}
				
			}
		}
		
		
	}

}
