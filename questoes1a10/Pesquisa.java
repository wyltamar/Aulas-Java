package questoes1a10;

public class Pesquisa {
	
	private String sexo;
	private String corOlhos;
	private String corCabelo;
	private int idade;
	private double altura;
	private int peso;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCorOlhos() {
		return corOlhos;
	}
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((corCabelo == null) ? 0 : corCabelo.hashCode());
		result = prime * result + ((corOlhos == null) ? 0 : corOlhos.hashCode());
		result = prime * result + idade;
		result = prime * result + peso;
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Pesquisa other = (Pesquisa) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (corCabelo == null) {
			if (other.corCabelo != null)
				return false;
		} else if (!corCabelo.equals(other.corCabelo))
			return false;
		if (corOlhos == null) {
			if (other.corOlhos != null)
				return false;
		} else if (!corOlhos.equals(other.corOlhos))
			return false;
		if (idade != other.idade)
			return false;
		if (peso != other.peso)
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pesquisa [sexo=" + sexo + ", corOlhos=" + corOlhos + ", corCabelo=" + corCabelo + ", idade=" + idade
				+ ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	

}
