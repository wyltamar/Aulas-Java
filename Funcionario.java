package capitulo4;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;
	private Data dataAdmissão = new Data();
	
	public Funcionario() {
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Data getDataAdmissão() {
		return dataAdmissão;
	}

	public void setDataAdmissão(Data dataAdmissão) {
		this.dataAdmissão = dataAdmissão;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", cargo=" + cargo + ", dataAdmissão=" + dataAdmissão + "]";
	}
	

}
