package responsability;

import entidades.Orcamento;
import interfaces.Desconto;

public class DescontoZero implements Desconto {

	@Override
	public Double calculaDesconto(Orcamento orcamento) {
		return 0d;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}
