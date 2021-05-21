package pt.axians.testes.leilao;

import org.junit.Assert;
import org.junit.Test;

public class TesteAvaliador {

	@Test
	public void verificaMaiorEMenor() {
		Leilao leilao = new Leilao("XBox One");

		leilao.licitar(new Licitacao(new Utilizador("Eliseu"), 300.0));
		leilao.licitar(new Licitacao(new Utilizador("Moacir"), 400.0));
		leilao.licitar(new Licitacao(new Utilizador("Dirceu"), 500.0));

		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		double maior = avaliador.getMaiorDeTodos();
		double menor = avaliador.getMenorDeTodos();
		Assert.assertEquals(300.0, menor, 0.0001);
		Assert.assertEquals(500.0, maior, 0.0001);
	}

	@Test
	public void verificaValorMedio() {
		Leilao leilao = new Leilao("XBox One");

		leilao.licitar(new Licitacao(new Utilizador("Eliseu"), 300.0));
		leilao.licitar(new Licitacao(new Utilizador("Moacir"), 400.0));
		leilao.licitar(new Licitacao(new Utilizador("Dirceu"), 500.0));

		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		Assert.assertEquals(400.00, avaliador.getValorMedio(), 0.0001);
	}
	
	@Test
	public void verificaValorMedioComZeroLicitacoes() {
		Leilao leilao = new Leilao("XBox One");
		Avaliador avaliador = new Avaliador();
		
		avaliador.avalia(leilao);
		
		Assert.assertEquals(0.00, avaliador.getValorMedio(), 0.0001);
	}
	
	@Test
	public void verificarMaiorValorComLicitacoesEmOrdemDecrescente() {
		Leilao leilao = new Leilao("XBox One");
		leilao.licitar(new Licitacao(new Utilizador("Dirceu"), 500.0));
		leilao.licitar(new Licitacao(new Utilizador("Moacir"), 400.0));
		leilao.licitar(new Licitacao(new Utilizador("Eliseu"), 300.0));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		Assert.assertEquals(500.0, avaliador.getMaiorDeTodos(), 0.0001);
	}
	
	@Test
	public void verificarMaiorValorComLicitacoesIguais() {
		Leilao leilao = new Leilao("XBox One");
		leilao.licitar(new Licitacao(new Utilizador("Dirceu"), 500.0));
		leilao.licitar(new Licitacao(new Utilizador("Moacir"), 500.0));
		leilao.licitar(new Licitacao(new Utilizador("Eliseu"), 500.0));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		Assert.assertEquals(500.0, avaliador.getMaiorDeTodos(), 0.0001);
	}

}
