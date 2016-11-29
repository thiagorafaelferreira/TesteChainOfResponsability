package responsability;

import entidades.Orcamento;
import interfaces.Desconto;

public class CalculadoraDeDescontos {

	public Double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoMaisCincoItens();
		Desconto d2 = new DescontoValorMaiorQueQuinhentos();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto df = new DescontoZero();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(df);
		
		return d1.calculaDesconto(orcamento);
		
	}
	
}
