package poo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreverArquivoBufferedWriter {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Aluno\\Desktop\\Dados\\Funcionarios1.csv";
		
		ArrayList<String> funcionarios = new ArrayList<>();
		
		funcionarios.add("nome,sobrenome,idade,salario");
		funcionarios.add("Paula,nunes,35,25476.48");
		funcionarios.add("João,Silva,35,5000.27");
		funcionarios.add("Paulo,Santos,20,3750.00");
		funcionarios.add("Gessica,Amorim,18,7375.88");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(path, true))) {
			for (String linha : funcionarios) {
				br.write(linha);
				br.newLine();
			}
			
		} catch (IOException e) {
			
		}
	}

}
