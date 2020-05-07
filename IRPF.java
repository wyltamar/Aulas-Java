package capitulo4;

import java.util.Scanner;

public class IRPF {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário");
		funcionario.setNome(entrada.nextLine());
		
		System.out.println("Digite o salário bruto deste funcionario");
		funcionario.setSalario(entrada.nextDouble());
		
		System.out.println("===============IRPF========================");
		System.out.println("Nome do funcionário:" +funcionario.getNome());
		System.out.println("Imposto devido:" +impostoDevido(funcionario.getSalario()));

	}
	
	public static double impostoDevido(double salario) {
		
		double impostoDevido = 0.0;
		
		if(salario > 1903.98 && salario <= 2826.65) {
			impostoDevido = 142.80 * 0.075;
		}
		else if(salario > 2826.65 && salario <= 3751.05) {
			impostoDevido = 354.80 * 0.15;
		}
		else if(salario > 3751.05 && salario <= 4664.68) {
			impostoDevido = 636.13 * 0.225;
		}
		else if(salario > 4664.68) {
			impostoDevido = 869.36 * 0.275;
		}
		else {
			System.out.println("Funcionario insento de pagar Imposto de Renda");
		}
		
		return impostoDevido;
	}

}
