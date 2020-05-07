package capitulo5;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		
		int numero;
		
		String numero2 = JOptionPane.showInputDialog("Digite um numero");
		numero = Integer.parseInt(numero2);
				
		for(int i = 1 ; i <= numero; i++) {
			System.out.println();
			
			for(int j = 1; j <= 10; j++) {
				System.out.println(j+ " x " +i+ " = " +j*i);
			}
		}
		
		

	}

}
