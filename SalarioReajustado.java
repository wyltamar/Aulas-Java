package capitulo3;

import javax.swing.JOptionPane;

public class SalarioReajustado {
	public static void main(String[] args) {
		
		double salario = 0;
		double salarioReajustado = 0;
		double reajuste = 0;
		
		
		String salario1 = JOptionPane.showInputDialog("Digite o seu s�lario");
		salario = Double.parseDouble(salario1);
		
		String reajuste1 = JOptionPane.showInputDialog("Digite o percentual de reajuste salarial");
		reajuste = Double.parseDouble(reajuste1);
		
		salarioReajustado = salario + (salario * (reajuste/100));
		
		JOptionPane.showMessageDialog(null, "Seu sal�rio com reajuste agora � = "+ salarioReajustado);
		
	}

}
