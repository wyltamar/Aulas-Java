package capitulo4;

import javax.swing.JOptionPane;

public class TesteMediaPonderada {

	public static void main(String[] args) {
		
		double notaProvao;
		double notaEstudoD;
	
		MediaPonderada mediaPonderada = new MediaPonderada();
		
		String nome = JOptionPane.showInputDialog("Nome do aluno:");
		mediaPonderada.setNome(nome);
		
		String disciplina = JOptionPane.showInputDialog("Disciplina:");
		mediaPonderada.setDisciplina(disciplina);
		
		String nota1 = JOptionPane.showInputDialog("Nota 01:");
		mediaPonderada.setNota1(Double.parseDouble(nota1));
		
		String nota2 = JOptionPane.showInputDialog("Nota 02:");
		mediaPonderada.setNota2(Double.parseDouble(nota2));
		
		String nota3 = JOptionPane.showInputDialog("Nota 03:");
		mediaPonderada.setNota3(Double.parseDouble(nota3));
		
		String nota4 = JOptionPane.showInputDialog("Nota 04:");
		mediaPonderada.setNota4(Double.parseDouble(nota4));
		
		String nota5 = JOptionPane.showInputDialog("Nota do provão:");
		notaProvao = (Double.parseDouble(nota5));
		
		String nota6 = JOptionPane.showInputDialog("Nota do estudo dirigido:");
		notaEstudoD = (Double.parseDouble(nota6));
		
		double media = (mediaPonderada.getNota1() + mediaPonderada.getNota2() + mediaPonderada.getNota3() + mediaPonderada.getNota4())/4;
		
		double mediaFinal = (media * 0.2) + (notaEstudoD * 0.2) + (notaProvao * 0.6);
		
		
		
		System.out.println("     INFORMAÇÕES DAS NOTAS DO ALUNO");
		System.out.println("==========================================");
		System.out.println("Nome do aluno:"+mediaPonderada.getNome());
		System.out.println("Disciplina:"+mediaPonderada.getDisciplina());
		System.out.println("Média das notas:"+media);
		System.out.println("Nota do provão:"+notaProvao);
		System.out.println("Média do Estudo dirigido:"+notaEstudoD);
		System.out.println("==========================================");
		System.out.println("             RESULTADO FINAL");
		System.out.println("==========================================");
		
		if(mediaFinal >= 60) {
			System.out.println("Aluno aprovado com média = "+mediaFinal);
		}
		else {
			System.out.println("Aluno reprovado com média = "+mediaFinal);
		}
		
	}

}
