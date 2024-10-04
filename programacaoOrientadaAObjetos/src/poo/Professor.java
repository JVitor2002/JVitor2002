package poo;

public class Professor extends Pessoa {
	private int numeroDeAulas;
	private int quantidadeDeAulas;
	private String periodo;

	public Professor() {

	}

	public Professor(String nome, String cpf, int idade, int numeroDeAulas, int quantidadeDeAulas, String periodo) {
		super(nome, cpf, idade);
		this.numeroDeAulas = numeroDeAulas;
		this.quantidadeDeAulas = quantidadeDeAulas;
		this.periodo = periodo;

	}

	public int getNumeroDeAulas() {
		return numeroDeAulas;
	}

	public void setNumeroDeAulas(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
	}

	public int getQuantidadeDeAulas() {
		return quantidadeDeAulas;
	}

	public void setQuantidadeDeAulas(int quantidadeDeAulas) {
		this.quantidadeDeAulas = quantidadeDeAulas;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
