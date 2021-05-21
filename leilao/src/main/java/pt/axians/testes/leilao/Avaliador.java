package pt.axians.testes.leilao;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private double valorMedio = 0.0;

	public void avalia(Leilao leilao) {
		double total = 0.0;
		for(Licitacao licitacao: leilao.getLicitacoes()) {
			if(licitacao.getMontante() > maiorDeTodos) {
				maiorDeTodos = licitacao.getMontante();
			}
			if(licitacao.getMontante() < menorDeTodos ) {
				menorDeTodos = licitacao.getMontante();
			}
			
			total += licitacao.getMontante();
		}
		
		int numLicitacoes = leilao.getLicitacoes().size();
		if(numLicitacoes == 0) {
			valorMedio = 0.0;
			return;
		}
		valorMedio  = total/numLicitacoes;
	}
	
	public double getMaiorDeTodos() {
		return maiorDeTodos;
	}
	
	public double getMenorDeTodos() {
		return menorDeTodos;
	}
	
	public double getValorMedio() {
		return valorMedio;
	}
}
