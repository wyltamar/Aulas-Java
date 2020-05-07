package capitulo4;

public class SalarioReajustado {
	
	private String nome;
	private double salarioAtual;
	private double salarioReajustado = 0.0;
	
	public SalarioReajustado() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}

	public double getSalarioReajustado() {
		return salarioReajustado;
	}

	public void setSalarioReajustado(double salarioReajustado) {
		this.salarioReajustado = salarioReajustado;
	}

	@Override
	public String toString() {
		return "SalarioReajustado [nome=" + nome + ", salarioAtual=" + salarioAtual + ", salarioReajustado="
				+ salarioReajustado + "]";
	}
	
	public void getReajuste() {
		this.salarioReajustado = this.salarioAtual + ( getSalarioAtual()* 0.0875);
	}

}
