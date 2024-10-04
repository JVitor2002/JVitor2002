package poo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivoScanner {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Aluno\\Desktop\\Dados\\Funcionarios.csv");
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			
			while(scan.hasNextLine()); {
				System.out.println(scan.nextLine());
			}
		
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getLocalizedMessage());		
		}finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

}
