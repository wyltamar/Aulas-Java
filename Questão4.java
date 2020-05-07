package capitulo5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questão4 {

public static void main(String[] args) {

	int numInicial, numFinal,  aux2;
	
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o número inical da sequência:");
	numInicial = entrada.nextInt();
	
	System.out.println("Digite o número final da sequência:");
	numFinal = entrada.nextInt();
	
	int cont = 0;
	int contPar = 0;
	int contImpar = 0;
	int contDiv = 0;
	int aux1;
	double media1 = 0;
	int soma1 = 0;
	double media2 = 0;
	int soma2 = 0;
	double media3 = 0;
	int soma3 = 0;
	double media4 = 0;
	int soma4 = 0;
	
	while(numInicial <= numFinal) {
		
		if(numInicial > 0) {
		 cont++;
		 soma1 += numInicial;
		 media1 = soma1/cont;
		 }
		
		
		aux1 = numInicial;
		if(aux1 % 2 == 0) {
			soma2 += aux1;
			contPar++;
			media2 = soma2/contPar;
			
		}
		
		aux2 = numInicial;
		if(aux2 % 2 == 1) {
			soma3 += aux2;
			contImpar++;
			media3 = soma3/contImpar;
			
			if(aux2 % 3 == 0 && aux2 % 7 ==0) {
				soma4 += aux2;
				contDiv++;
				media4 = soma4/contDiv;
			}
		}

		
		numInicial++;
		 
	}
	System.out.println("A quantidade de inteiros e positivos é = "+cont);
	System.out.println("E a média entre os positivos é = "+media1);
	System.out.println("A quantidade de números pares é = "+contPar);
	System.out.println("E a média entre os pares é  = "+media2);
	System.out.println("A quantidade de números ímpares é = "+contImpar);
	System.out.println("E a média entre os ímpares é  = "+media3);
	System.out.println("A quantidade de números divisíveis por 3 e 7 é = "+contDiv);
	
	
 }

}
