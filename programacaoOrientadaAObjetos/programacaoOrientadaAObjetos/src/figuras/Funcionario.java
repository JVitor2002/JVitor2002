package figuras;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, double salario) {
	this.nome = nome;
	this.cpf = nome;
	this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
