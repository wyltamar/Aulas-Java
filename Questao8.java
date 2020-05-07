package capitulo5;

import javax.swing.JOptionPane;

public class Questao8 {

public static void main(String[] args) {

	int num, soma = 0;
	String continua;
	
	do {
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		soma += num;
		
		continua = JOptionPane.showInputDialog("Desa continuar, digite sim ou não"); 
	
	} while (continua.equalsIgnoreCase("sim"));
	
	JOptionPane.showMessageDialog(null, "A soma dos números digitados é = "+soma);
}

}
