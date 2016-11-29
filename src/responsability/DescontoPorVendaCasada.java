package responsability;

import entidades.Item;
import entidades.Orcamento;
import interfaces.Desconto;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;
	
	@Override
	public Double calculaDesconto(Orcamento orcamento) {
		if(this.existe("caneta", orcamento) && this.existe("lápis", orcamento)) {
			System.out.println("Desconto Por Venda Casada");
			return orcamento.getValor() * 0.05;
		}
		return proximo.calculaDesconto(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

}
