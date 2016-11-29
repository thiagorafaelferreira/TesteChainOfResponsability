package aplicacao;

import entidades.Item;
import entidades.Orcamento;
import responsability.CalculadoraDeDescontos;

public class Aplicacao {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500d);
		orcamento.adicionaItem(new Item("caneta"));
		orcamento.adicionaItem(new Item("lápis"));
		
		System.out.println(new CalculadoraDeDescontos().calcula(orcamento));
	}
}
