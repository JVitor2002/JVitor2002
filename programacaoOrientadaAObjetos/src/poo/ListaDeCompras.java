package poo;

import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("---------------------------------------");
			System.out.println("0. sair");
			System.out.println("1. Inserir item");
			System.out.println("2. Remover item");
			System.out.println("3. Listar item(ns)");
			System.out.print("4. Digite uma opção:");
			menu = scan.nextInt();
			
			if (menu == 1) {
				scan.nextLine();
				System.out.print("Digite o item a ser inserido: ");
				lista.inserirItem(scan.nextLine());
			}
			else if (menu == 2) {
				System.out.print("Digite o item a ser removido: ");
				scan.nextLine();
				String item = scan.nextLine();
				if(lista.removerItem(item)) {
					System.out.println("Item removido!");
				}
				else {
					System.out.println("Item nao removido!");
				}			
			}else if (menu == 3) {
				System.out.println("Os items presentes são: ");
				for (String item : lista.getLista()) {
					System.out.println(item);
				}
			}
			
		}while(menu != 0);
		
		scan.close();

	}

}
