package poo;

import java.util.ArrayList;

public class RegistroNotas {

	public static void main(String[] args) {
		ArrayList<Estudante> estudantes = new ArrayList<>();
		
		Estudante e1 = new Estudante("Ana");
		Estudante e2 = new Estudante("João");
		Estudante e3 = new Estudante("Gabriel");
		
		estudantes.add(e1);
		estudantes.add(e2);
		estudantes.add(e3);
		
		e1.adicionarNota(78.5);
		e1.adicionarNota(24.7);
		e1.adicionarNota(98.0);
		
		System.out.printf("Estudante: %s, Media: %2f\n", e1.getNome(), e1.calcularMedia());
		System.out.printf("Estudante: %s, Media: %2f\n", e2.getNome(), e2.calcularMedia());
		System.out.printf("Estudante: %s, Media: %2f\n", e3.getNome(), e3.calcularMedia());

	}

}
