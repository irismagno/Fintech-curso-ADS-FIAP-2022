package br.com.fiap.cursoads.fintech;

public class ContaCorrente extends Conta {
	
	// Atributos
	
	private String descricao;
	private double saldo;
	
	// Métodos construtores
	
	public ContaCorrente () {
		
	}
	
	public ContaCorrente (int numeroAgencia, int numeroConta, InstituicaoFinanceira instituicao, Usuario user, String descricao) {
		super(numeroAgencia, numeroConta, instituicao, user);
		this.descricao = descricao;
	}
	
	// Outros métodos
	
	public void incluirRecebimento (double valor, String descricaoRecebimento) {
		this.saldo += valor;
		// "descricaoRecebimento" será capturada para o banco de dados quando chegarmos lá
	}
	
	public boolean incluirGasto (double valor, CategoriaGasto categoria) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
			// "categoria" será capturada para o banco de dados quando chegarmos lá
		} else {
			return false;
		}
	}
	
	// Getters and setters

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

}
