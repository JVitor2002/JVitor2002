package poo;

public class TesteEscola {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Joao");
		System.out.println("Nome do aluno: " + aluno.getNome());

	}

}
