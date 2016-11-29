package entidades;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private Double valor;
	private Integer quantidadeItens = 0;
	private List<Item> itens = new ArrayList<Item>();

	public Orcamento(Double valor) {
		super();
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
	
	public Integer getQuantidadeItens() {
		return this.quantidadeItens;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
		this.quantidadeItens++;
	}
	
	public List<Item> getItens() {
		return this.itens;
	}
	
	
}
