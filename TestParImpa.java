package capitulo4;

import javax.swing.JOptionPane;

public class TestParImpa {

	public static void main(String[] args) {
	
		ParImpar parImpar = new ParImpar();
		
		String numero = JOptionPane.showInputDialog("Digite um n�mero inteiro");
		
		parImpar.setNumero(Integer.parseInt(numero));
		
		System.out.println("O numero digitado foi:" +parImpar.getNumero());
		
		if(parImpar.getNumero() != 0) {
			
			if(parImpar.getNumero() % 2 == 0) {
				System.out.println("O numero " +parImpar.getNumero()+ " � par");
			}else {
				System.out.println("O numero " +parImpar.getNumero()+ " � impar");
			}
			
		}else {
			System.out.println("O n�mero digitado = " +parImpar.getNumero()+ " zero n�o � par nem impar!");
		}
		
		
		
		
		

	}

}
