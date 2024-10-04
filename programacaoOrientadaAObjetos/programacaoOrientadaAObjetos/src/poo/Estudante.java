package poo;

import java.util.ArrayList;

public class Estudante {
	private String nome;
	private ArrayList<Double> notas;
	
	public Estudante(String nome) {
		this.nome = nome;	
		notas = new ArrayList<Double>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarNota(double nota) {
		notas.add(nota);
	}
	public double calcularMedia() {
		if (notas.isEmpty()) {
			return 0;
		}
			double soma = 0;
			for(double nota : notas) {
				soma += nota;
			}
			return soma / notas.size();
			
		
	}
	
	
	
}
