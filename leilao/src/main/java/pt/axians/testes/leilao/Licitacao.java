package pt.axians.testes.leilao;

public class Licitacao {
	private Utilizador utilizador;
	private double montante;
	
	public Licitacao(Utilizador utilizador, double montante) {
		super();
		this.utilizador = utilizador;
		this.montante = montante;
	}

	public Utilizador getUtilizador() {
		return utilizador;
	}

	public double getMontante() {
		return montante;
	}
}
