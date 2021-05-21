package pt.axians.testes.leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {
	private String produto;
	private List<Licitacao> licitacoes;
	
	public Leilao(String produto) {
		super();
		this.produto = produto;
		this.licitacoes = new ArrayList<>();
	}
	
	public void licitar(Licitacao licitacao) {
		this.licitacoes.add(licitacao);
	}

	public String getProduto() {
		return produto;
	}

	public List<Licitacao> getLicitacoes() {
		return Collections.unmodifiableList(licitacoes);
	}
}
