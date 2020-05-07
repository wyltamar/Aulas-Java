package capitulo4;

import javax.swing.JOptionPane;

public class TesteMultiplo {

	public static void main(String[] args) {
	
		Multiplo multiplo = new Multiplo();
		
		multiplo.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
		
		if(multiplo.getNumero() % 3 == 0 || multiplo.getNumero() % 7 == 0) {
			
			if(multiplo.getNumero() % 3 == 0) {
				System.out.println(" O numero "+multiplo.getNumero()+" é múltiplo de 3");
			}
			
			if(multiplo.getNumero() % 7 == 0) {
				System.out.println(" O numero "+multiplo.getNumero()+" é múltiplo de 7");
			}
		}else {
			System.out.println(" O numero "+multiplo.getNumero()+" não é múltiplo de 3 nem de 7");
		}

	}

}
