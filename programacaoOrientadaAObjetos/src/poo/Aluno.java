package poo;

public class Aluno extends Pessoa{
	private String identificacao;
	private int anoLetivo;
	private int numeroDeDisciplina;
	
	
	public Aluno() {
		
	}
	
	
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public int getAnoLetivo() {
		return anoLetivo;
	}
	public void setAnoLetivo(int anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	public int getNumeroDeDisciplina() {
		return numeroDeDisciplina;
	}
	public void setNumeroDeDisciplina(int numeroDeDisciplina) {
		this.numeroDeDisciplina = numeroDeDisciplina;
	}
	
	
}
