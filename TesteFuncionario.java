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
		
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio")));
		
		funcionario.setCargo(JOptionPane.showInputDialog("Digite seu cargo"));
		
		JOptionPane.showMessageDialog(null, "Em seguida forne�a a data de admiss�o nesta empresa");
		
		funcionario.getDataAdmiss�o().setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admiss�o ")));
	
		funcionario.getDataAdmiss�o().setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s de admiss�o ")));
		
		funcionario.getDataAdmiss�o().setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de admiss�o")));
		
		
		tempoServico = ((dataAtual.getDia() + (dataAtual.getMes()*30) + (dataAtual.getAno()*365)) - (funcionario.getDataAdmiss�o().getDia() + (funcionario.getDataAdmiss�o().getMes()*30) + (funcionario.getDataAdmiss�o().getAno()*365)) )/365;
		
		
		
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
		System.out.println("Novo sal�rio =" +novoSalario);
		System.out.println("Valor do reajuste =" +reajuste);
		System.out.println("-----------------------------------------");
		System.out.printf("O tempo de servi�o � de %.2f",tempoServico);
		
	}
}
