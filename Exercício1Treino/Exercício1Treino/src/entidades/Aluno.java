package entidades;

public class Aluno {
	public String nome;
	public double nota;
	
	public Aluno() {

	}

	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota(){
		return nota;
	}
	
	public void setNota(double nota){
		this.nota = nota;
	}
}
