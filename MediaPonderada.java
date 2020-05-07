package capitulo4;

public class MediaPonderada {
	
	private String nome;
	private String disciplina;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public MediaPonderada() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	@Override
	public String toString() {
		return "MediaPonderada [nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
	}
	
	
	

}
