package capitulo4;

import javax.swing.JOptionPane;

public class TestSalario {

	public static void main(String[] args) {
	
		SalarioReajustado salarioReajustado = new SalarioReajustado();
		
		salarioReajustado.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		salarioReajustado.setSalarioAtual(Double.parseDouble(JOptionPane.showInputDialog
										("Digite seu sal�rio atual:")));
		
		System.out.println("Nome do funcion�rio:" +salarioReajustado.getNome());
		System.out.println("Sal�rio atual:" +salarioReajustado.getSalarioAtual());
		salarioReajustado.getReajuste();
		System.out.println("Sal�rio reajustado � = " +salarioReajustado.getSalarioReajustado());

	}

}
