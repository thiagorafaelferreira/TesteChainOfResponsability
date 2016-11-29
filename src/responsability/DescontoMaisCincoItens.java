package responsability;

import entidades.Orcamento;
import interfaces.Desconto;

public class DescontoMaisCincoItens implements Desconto {

	private Desconto proximo;
	
	@Override
	public Double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5) {
			System.out.println("Desconto Mais de Cinco Itens");
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.calculaDesconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
