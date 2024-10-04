package poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoBufferedReaderV2 {

	public static void main(String[] args) {

		String path = "C:\\Users\\Aluno\\Desktop\\Dados\\Funcionarios.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
