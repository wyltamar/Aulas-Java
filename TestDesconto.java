package capitulo4;

import javax.swing.JOptionPane;

public class TestDesconto {

	public static void main(String[] args) {
	
		Desconto desconto = new Desconto();
		
		String valor = JOptionPane.showInputDialog("Forne�a o valor atual do produto:");
		desconto.setPrecoAtual(Double.parseDouble(valor));
		
		System.out.println("O valor do produto sem desconto = "+desconto.getPrecoAtual());
		
		// o comando %.2f limita a quantidade de casas decimais na impress�o do valor decimal
		System.out.printf("O valor do produto com desconto = %.2f ", desconto.getDesconto());

	}

}
