package capitulo4;

import javax.swing.JOptionPane;

public class TesteVendaLanches {
	public static void main(String[] args) {
		
		VendaLanches vendaLanches = new VendaLanches();
		
		Double valorTotalLanche;
		Double valorTotalAcomp;
		


		String opcao = JOptionPane.showInputDialog("Escolha seu lanche digitando o numero : 1-Hamburguer, 2-Cheesburguer, 3-Bauru, 4-X Salada");
		
		switch (opcao) {
			
			case "1": 
				
				vendaLanches.getLanche().setNome("Hamburguer");
				vendaLanches.getLanche().setValor(6.80);
				break;
				
			case "2": 
				
				vendaLanches.getLanche().setNome("Chessburguer");
				vendaLanches.getLanche().setValor(7.50);
				break;
				
			case "3": 
				
				vendaLanches.getLanche().setNome("Bauru");
				vendaLanches.getLanche().setValor(5.40);
				break;
				
			case "4":
				
				vendaLanches.getLanche().setNome("X- Salada");
				vendaLanches.getLanche().setValor(8.50);
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "Valor inválido!");
				break;
			}
		
		String quant1 = JOptionPane.showInputDialog("Digite a quantidade de "+vendaLanches.getLanche().getNome()+ "desejada");
		valorTotalLanche = Integer.parseInt(quant1) * vendaLanches.getLanche().getValor();
		
		int perg = JOptionPane.showConfirmDialog(null, "Deseja algum acompanhamento para o pedido?");
		
		if(perg == 0) {
			
			JOptionPane.showMessageDialog(null, "Temos: Refrigerante, suco, Batata Frita e Salada");
			String opcao2 = JOptionPane.showInputDialog("Digite 1-Refrigerante,2-Suco,3-Batata Frita e 4-Salada");
			
			switch (opcao2) {
			
			case "1":
				
				vendaLanches.getBebida().setNome("Refrigerante");
				String tamanho = JOptionPane.showInputDialog("Escolha o tamanho do refri, digite 200 ou 500 para mls");
				vendaLanches.getBebida().setTamanho(Integer.parseInt(tamanho));
				
				if(Integer.parseInt(tamanho) == 200) {
					vendaLanches.getBebida().setValor(2.30);
				}
				else if(Integer.parseInt(tamanho) == 500 ) {
					vendaLanches.getBebida().setValor(4.00);
				}
				else {
					JOptionPane.showMessageDialog(null, "Tamnho inválido!");
				}
				break;
				
			case "2":
				
				vendaLanches.getBebida().setNome("Suco");
				String tamanho2 = JOptionPane.showInputDialog("Escolha o tamanho do suco, digite 200 ou 500 para mls");
				vendaLanches.getBebida().setTamanho(Integer.parseInt(tamanho2));
				
				if(Integer.parseInt(tamanho2) == 200) {
					vendaLanches.getBebida().setValor(3.50);
				}
				else if(Integer.parseInt(tamanho2) == 500 ) {
					vendaLanches.getBebida().setValor(6.00);
				}
				else {
					JOptionPane.showMessageDialog(null, "Tamnho inválido!");
				}
				break;
				
			case "3":
				
				vendaLanches.getBebida().setNome("Batata frita");
				String tamanho3 = JOptionPane.showInputDialog("Escolha o tamanho da batata frita, 1-P, 2-M ou 3-G");
				vendaLanches.getBebida().setTamanho(Integer.parseInt(tamanho3));
				
				if(Integer.parseInt(tamanho3) == 1) {
					vendaLanches.getBebida().setValor(3.50);
				}
				else if(Integer.parseInt(tamanho3) == 2 ) {
					vendaLanches.getBebida().setValor(4.50);
				}
				else if(Integer.parseInt(tamanho3) == 3 ) {
					vendaLanches.getBebida().setValor(5.50);
				}
				else {
					JOptionPane.showMessageDialog(null, "Tamnho inválido!");
				}
				break;
			
			case "4":
			
				vendaLanches.getBebida().setNome("Salada");	
				vendaLanches.getBebida().setValor(8);	

			default:
				break;
			}
		
		}
		
		String quant2 = JOptionPane.showInputDialog("Digite a quantidade de "+vendaLanches.getBebida().getNome()+ "desejada");
		
		valorTotalAcomp = Integer.parseInt(quant2) * vendaLanches.getBebida().getValor();
		
		vendaLanches.setValorPedido(valorTotalLanche + valorTotalAcomp);
		
		JOptionPane.showMessageDialog(null, "Valor total do pedido:" +vendaLanches.getValorPedido());
	
		
		
	}
}
