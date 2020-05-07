package capitulo4;

import javax.swing.JOptionPane;

public class TestSalario {

	public static void main(String[] args) {
	
		SalarioReajustado salarioReajustado = new SalarioReajustado();
		
		salarioReajustado.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		salarioReajustado.setSalarioAtual(Double.parseDouble(JOptionPane.showInputDialog
										("Digite seu salário atual:")));
		
		System.out.println("Nome do funcionário:" +salarioReajustado.getNome());
		System.out.println("Salário atual:" +salarioReajustado.getSalarioAtual());
		salarioReajustado.getReajuste();
		System.out.println("Salário reajustado é = " +salarioReajustado.getSalarioReajustado());

	}

}
