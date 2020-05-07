package capitulo5;

import javax.swing.JOptionPane;

public class Questão10 {

	public static void main(String[] args) {
	
		final double planoSaude = 60;
		double salarioBruto = 0;
		double salarioLiquido = 0;
		double folhaPagamento = 0;
		double descIR = 0, descINSS = 0;
		int condition = 0;
		double totalIR = 0;
		
		do {
			
			salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto:"));
			
			if(salarioBruto >= 1903.99 && salarioBruto < 2826.66) {
				descIR =  142.80 * 0.075;
				totalIR += descIR;
				salarioLiquido = salarioBruto - descIR;
				salarioLiquido -= planoSaude;
				
			}
			else if(salarioBruto >= 2826.66 && salarioBruto < 3751.06) {
				descIR =  354.80 * 0.15;
				totalIR += descIR;
				salarioLiquido = salarioBruto - descIR;
				salarioLiquido -= planoSaude;
			}
			else if(salarioBruto >= 3751.06 && salarioBruto < 4664.69) {
				descIR =  636.13 * 0.225;
				totalIR += descIR;
				salarioLiquido = salarioBruto - descIR;
				salarioLiquido -= planoSaude;
			}
			else if(salarioBruto > 4664.68) {
				descIR = 869.36 * 0.275;
				totalIR += descIR;
				salarioLiquido = salarioBruto - descIR;
				salarioLiquido -= planoSaude;
			}
			else {
				System.out.println("Funcionário isento de Imposto de Renda");
				salarioLiquido -= planoSaude;
			}
			
			
			if(salarioBruto <= 1556.94) {
				descINSS = salarioBruto * 0.08;
				salarioLiquido -= descINSS;
			}
			else if(salarioBruto > 1556.94 && salarioBruto <= 2594.92) {
				descINSS = salarioBruto * 0.09;
				salarioLiquido -= descINSS;
			}
			else if(salarioBruto > 1556.92 && salarioBruto <= 5189.82) {
				descINSS = salarioBruto * 0.11;
				salarioLiquido -= descINSS;
			}
			else {
				System.out.println("Salário ultrapassa o teto salarial da empresa!");
			}
			
			
			folhaPagamento += salarioBruto ;
			
			System.out.println("O salário líquido do funcionário é = " +salarioLiquido);
			
			// se usuário optar por YES condition = 0, se optar por No condition = 1 
			condition = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		} while (condition != 1 ); //enquanto condition = 0 o laço se repete
		
		System.out.println("O valor tatal da folha de pagametno = "+folhaPagamento);
		System.out.println("Valor total do IR que a empresa deve recolher = "+totalIR);
		
	}

}
