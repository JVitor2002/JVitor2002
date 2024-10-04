package poo;

import java.util.ArrayList;

public class Lista {
	ArrayList<String> lista = new ArrayList<>();
	
	public ArrayList<String> getLista() {
		return lista;
	}
	
	public void inserirItem(String item) {
		lista.add(item);
	}
	
	public boolean removerItem(String item) {
		return lista.remove(item);
	}
	
	

}
