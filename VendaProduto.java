package capitulo4;

/**
 * Classe utilizada para calcular a venda de um produto
 * e mostrar na tela o codigo do produto, nome, preço unitário,
 * quantidade e o valor toral da compra.
 * @author Wyltamar Douglas de Sousa Oliveira
 *  
 */

public class VendaProduto {
	
	private Long codigo;
	
	private String nome;
	
	private int quantidade;
	
	private double valorUnitario;
	
	
	
	public VendaProduto() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendaProduto other = (VendaProduto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VendaProduto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario="
				+ valorUnitario + ", valorCompra=]";
	}
	
	public double getTotalVenda() {
		return this.valorUnitario * this.quantidade;
	}
	
	
	

}
