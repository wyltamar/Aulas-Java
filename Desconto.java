package capitulo4;

public class Desconto {
	
	private double precoAtual;
	
	public Desconto() {
		
	}

	public double getPrecoAtual() {
		return precoAtual;
	}

	public void setPrecoAtual(double precoAtual) {
		this.precoAtual = precoAtual;
	}


	@Override
	public String toString() {
		return "Desconto [precoAtual=" + precoAtual +  "]";
	}
	
	public double getDesconto() {
		return this.precoAtual - (getPrecoAtual() * 0.1);
	}

}
