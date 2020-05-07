package capitulo4;

import javax.swing.JOptionPane;

public class TesteHora {

	public static void main(String[] args) {
		
		double totalHora;
		double totalMinuto;
		double totalSegundo;
		
		Hora periodoInicial = new Hora();
		
		String hora = JOptionPane.showInputDialog("Digite a hora - p inicial");
		periodoInicial.setHora(Double.parseDouble(hora));								
		periodoInicial.setMinuto(Double.parseDouble(JOptionPane.showInputDialog("Digite os minutos - p inicial")));
		periodoInicial.setSegundo(Double.parseDouble(JOptionPane.showInputDialog("Digite as segundos - p inicial")));

		Hora periodoFinal = new Hora();
		
		String hora2 = JOptionPane.showInputDialog("Digite a hora - p final");
		periodoFinal.setHora(Double.parseDouble(hora2));								
		periodoFinal.setMinuto(Double.parseDouble(JOptionPane.showInputDialog("Digite os minutos - p final")));
		periodoFinal.setSegundo(Double.parseDouble(JOptionPane.showInputDialog("Digite as segundos - p final")));
				
		
		String resposta = JOptionPane.showInputDialog("Como quer ver o resultado? Digite 1 para ver em Hora,"
				+ "2 para ver em minutos, " + " 3 para ver em segundos");
		
		switch (resposta) {
		case "1":
			
			totalHora = (((periodoFinal.getSegundo()/3600) + (periodoFinal.getMinuto()/60) + (periodoFinal.getHora()))
					     - ((periodoInicial.getSegundo()/3600) + (periodoInicial.getMinuto()/60) + (periodoInicial.getHora()) ));
			System.out.println("A duração da ocorrência foi de " +totalHora+ " hora(s)");
			break;
			
		case "2":
			
			totalMinuto = (((periodoFinal.getSegundo()/60) + (periodoFinal.getMinuto()) + (periodoFinal.getHora()*60))
				     - ((periodoInicial.getSegundo()/60) + (periodoInicial.getMinuto()) + (periodoInicial.getHora()*60) ));
			System.out.printf("A duração da ocorrência foi de " +totalMinuto+ " minuto(s)");
			break;
			
		case "3":
			
			totalSegundo = (((periodoFinal.getSegundo()) + (periodoFinal.getMinuto()*60) + (periodoFinal.getHora()*3600))
				     - ((periodoInicial.getSegundo()) + (periodoInicial.getMinuto()*60) + (periodoInicial.getHora()*3600) ));
			System.out.printf("A duração da ocorrência foi de " +totalSegundo+ " segundo(s)");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valor inválido, escolha 1,2 ou 3!");
			break;
		}
	}

}
