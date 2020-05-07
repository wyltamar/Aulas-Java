package capitulo4;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		double tempoServico = 0;
		double reajuste = 0;
		double novoSalario = 0;
		
		Data dataAtual = new Data();
		dataAtual.setDia(23);
		dataAtual.setMes(04);
		dataAtual.setAno(2020);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário")));
		
		funcionario.setCargo(JOptionPane.showInputDialog("Digite seu cargo"));
		
		JOptionPane.showMessageDialog(null, "Em seguida forneça a data de admissão nesta empresa");
		
		funcionario.getDataAdmissão().setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admissão ")));
	
		funcionario.getDataAdmissão().setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de admissão ")));
		
		funcionario.getDataAdmissão().setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admissão")));
		
		
		tempoServico = ((dataAtual.getDia() + (dataAtual.getMes()*30) + (dataAtual.getAno()*365)) - (funcionario.getDataAdmissão().getDia() + (funcionario.getDataAdmissão().getMes()*30) + (funcionario.getDataAdmissão().getAno()*365)) )/365;
		
		
		
		switch (funcionario.getCargo()) {
		case "Gerente":
			
			if(tempoServico >= 5) {
				
				reajuste = funcionario.getSalario()* 0.1;
				novoSalario = (funcionario.getSalario()+ reajuste);
				
			}else if(tempoServico >= 3 && tempoServico < 5 ) {
				
				reajuste = funcionario.getSalario()* 0.09;
				novoSalario = (funcionario.getSalario()+ reajuste);
				
			}else if(tempoServico < 3) {
				
				reajuste = funcionario.getSalario()* 0.08;
				novoSalario = (funcionario.getSalario()+ reajuste);
			}
			break;
			
		case "Engenheiro":
			
			if(tempoServico >= 5) {
				
				reajuste = funcionario.getSalario()* 0.11;
				novoSalario = (funcionario.getSalario()+ reajuste);
				
			}else if(tempoServico >= 3 && tempoServico < 5 ) {
				
				reajuste = funcionario.getSalario()* 0.1;
				novoSalario = (funcionario.getSalario()+ reajuste);
				
			}else if(tempoServico < 3) {
				
				reajuste = funcionario.getSalario()* 0.09;
				novoSalario = (funcionario.getSalario()+ reajuste);
			}
			break;
			
		case "Tecnicio":
			
			if(tempoServico >= 5) {
				
				reajuste = funcionario.getSalario()* 0.12;
				novoSalario = (funcionario.getSalario()+ reajuste);
				
			}else if(tempoServico >= 3 && tempoServico < 5 ) {
				
				reajuste = funcionario.getSalario()* 0.11;
				novoSalario = (funcionario.getSalario()+ reajuste);
				
			}else if(tempoServico < 3) {
				
				reajuste = funcionario.getSalario()* 0.1;
				novoSalario = (funcionario.getSalario()+ reajuste);
			}
			break;

		default:
			reajuste = funcionario.getSalario()* 0.07;
			novoSalario = (funcionario.getSalario()+ reajuste);
			break;
		}
		
		System.out.println("Salario antigo = " +funcionario.getSalario());
		System.out.println("Novo salário =" +novoSalario);
		System.out.println("Valor do reajuste =" +reajuste);
		System.out.println("-----------------------------------------");
		System.out.printf("O tempo de serviço é de %.2f",tempoServico);
		
	}
}
