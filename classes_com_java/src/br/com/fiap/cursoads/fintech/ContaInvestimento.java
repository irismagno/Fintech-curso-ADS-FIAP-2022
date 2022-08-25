package br.com.fiap.cursoads.fintech;

public class ContaInvestimento extends Conta {
	
	// Atributos
	
	private String tipoDeInvestimento;
	private double taxaDeJuros;
	private int prazo;
	private double rendimento;
	private double saldo;

	// Métodos construtores

	public ContaInvestimento () {
		
	}
	
	public ContaInvestimento (int numeroAgencia, int numeroConta, InstituicaoFinanceira instituicao, Usuario user, String tipoDeInvestimento, double taxaDeJuros, int prazo) {
		super(numeroAgencia, numeroConta, instituicao, user);
		this.tipoDeInvestimento = tipoDeInvestimento;
		this.taxaDeJuros = taxaDeJuros;
		this.prazo = prazo;
	}
	
	// Outros métodos
	
	public void aplicar (int valor) {
		this.saldo += valor;
	}
	
	public boolean resgatar (int valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void calcularRendimento () {
		this.rendimento = saldo * Math.pow((1 + this.taxaDeJuros/100), prazo);
	}

	// Getters and setters
	
	public String getTipoDeInvestimento() {
		return tipoDeInvestimento;
	}

	public void setTipoDeInvestimento(String tipoDeInvestimento) {
		this.tipoDeInvestimento = tipoDeInvestimento;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getSaldo() {
		return saldo;
	}

}