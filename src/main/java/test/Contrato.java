package test;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private String numero;
	private List<Item> itens = new ArrayList<Item>();

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
