package capitulo4;

import javax.swing.JOptionPane;

/**
 * Classe utilizada para testar a classe VendaProduto
 * @author Wyltamar Douglas de Sousa Oliveira
 *  
 */

public class TestVendaProduto {
	
	public static void main(String[] args) {
		
		VendaProduto vendaProduto = new VendaProduto();
		
		vendaProduto.setCodigo(Long.parseLong(JOptionPane.showInputDialog("Digite o código do produto"))); 
		
		vendaProduto.setNome(JOptionPane.showInputDialog("Digite o nome"));
		
		vendaProduto.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:")));
		
		vendaProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"))) ;
		
		System.out.println(" Código: "+vendaProduto.getCodigo() + "\n Nome:" + vendaProduto.getNome()+ 
				"\n Preço unitário:" + vendaProduto.getValorUnitario() + "\n Quantidade:" +vendaProduto.getQuantidade());
		System.out.printf(" Total da venda: %.2f", vendaProduto.getTotalVenda());
		
		
	}

}
