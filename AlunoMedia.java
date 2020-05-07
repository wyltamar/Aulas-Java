package capitulo4;

import javax.swing.JOptionPane;

public class AlunoMedia {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		double mediaFinal;
		double exame;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3:"));
		
		media = (nota1+nota2+nota3)/3;
		
		if(media >= 70) {
			
			System.out.println("Aluno passou de ano direto com média = "+media);
			
		}else {
			
			System.out.println("Aluno ficou em recuperação com média = "+media);
			mediaFinal = (100 - media);
			System.out.println("No exame final esse aluno precisa de nota mínima de " +mediaFinal);
			
		
		}
		
	}

}
