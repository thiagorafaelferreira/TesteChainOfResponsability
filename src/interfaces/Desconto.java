package interfaces;

import entidades.Orcamento;

public interface Desconto {
	

	public Double calculaDesconto(Orcamento orcamento);
	public void setProximo(Desconto desconto);

}
