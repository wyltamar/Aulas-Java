package capitulo5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quest�o4 {

public static void main(String[] args) {

	int numInicial, numFinal,  aux2;
	
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o n�mero inical da sequ�ncia:");
	numInicial = entrada.nextInt();
	
	System.out.println("Digite o n�mero final da sequ�ncia:");
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
	System.out.println("A quantidade de inteiros e positivos � = "+cont);
	System.out.println("E a m�dia entre os positivos � = "+media1);
	System.out.println("A quantidade de n�meros pares � = "+contPar);
	System.out.println("E a m�dia entre os pares �  = "+media2);
	System.out.println("A quantidade de n�meros �mpares � = "+contImpar);
	System.out.println("E a m�dia entre os �mpares �  = "+media3);
	System.out.println("A quantidade de n�meros divis�veis por 3 e 7 � = "+contDiv);
	
	
 }

}
