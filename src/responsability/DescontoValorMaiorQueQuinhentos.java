package responsability;

import entidades.Orcamento;
import interfaces.Desconto;

public class DescontoValorMaiorQueQuinhentos implements Desconto {

	private Desconto proximo;
	
	
	@Override
	public Double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			System.out.println("Desconto mais de quinhentos reais");
			return orcamento.getValor() * 0.07;
		}
		return proximo.calculaDesconto(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
