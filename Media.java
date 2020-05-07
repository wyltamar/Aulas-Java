package capitulo4;

import javax.swing.JOptionPane;

public class Media {
	public static void main(String[] args) {
		
		double valor1;
		double valor2;
		double valor3;
		double media;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 2:"));
		valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 3:"));
		
		media = (valor1 + valor2 + valor3)/3;
		
		JOptionPane.showMessageDialog(null, "A média é = " + media);
		
	}

}
