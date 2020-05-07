package capitulo4;

import javax.swing.JOptionPane;

public class LojaDepartamento {

	public static void main(String[] args) {
		
		double valorCompra;
		int formaPagamento;
		double pagamentoFinal;
		
		valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
		
		formaPagamento = Integer.parseInt(JOptionPane.showInputDialog("Escolha em quantas parcelas deseja pagar: 1,3,5 ou 10?"));
		
		switch (formaPagamento) {
		
		case 1:
			
			pagamentoFinal = valorCompra - (valorCompra * 0.05);
			System.out.println("Valor da compra = "+valorCompra);
			System.out.println("Pagamento a vista com desconto de 5%, total pago =" +pagamentoFinal);
			break;
			
		case 3:
			
			pagamentoFinal = valorCompra;
			System.out.println("Valor da compra: "+valorCompra);
			System.out.println("Compra parcelada em 3 vezes sem juros");
			System.out.printf("Valor das parcelas: %.2f %n", valorCompra/3);
			System.out.println("Total a pagar = "+pagamentoFinal);
			break;
			
		case 5:
			
			pagamentoFinal = (valorCompra += valorCompra * 0.02);
			System.out.println("Compra parcelada em 5 vezes com juros de 2%");
			System.out.printf("Valor das parcelas: %.2f %n", pagamentoFinal/5 );
			System.out.println("Total a pagar = " +pagamentoFinal);
			break;
			
		case 10:
			
			pagamentoFinal = (valorCompra += valorCompra * 0.08);
			System.out.println("Compra parcelada em 10 vezes com juros de 10%");
			System.out.printf("Valor das parcelas: %.2f %n", pagamentoFinal/10);
			System.out.println("Total a pagar = " +pagamentoFinal);
			break;
			
		default:
			
			System.out.println("Digite um valor válido para a forma de pagamento!");
			break;
		}

	}

}
