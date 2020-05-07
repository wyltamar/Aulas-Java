package capitulo5;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {

		double soma = 0d, numero, media = 0d;
		int cont = 0;
		
		do {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			soma += numero;
			
			cont++;
			
		} while (cont != 20);
		
		media = soma/cont;
		
		System.out.println("A média dos números digitados são:" +media);

	}

}
