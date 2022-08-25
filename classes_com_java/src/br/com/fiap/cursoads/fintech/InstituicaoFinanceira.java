package br.com.fiap.cursoads.fintech;

public class InstituicaoFinanceira {
	
	// Atributos
	
	private String nomeInstituicao;
	private String tipoDeInstituicao;
	private int numeroInstituicao;


	// Métodos construtores
	
	public InstituicaoFinanceira( ) {
		
	}
	
	public InstituicaoFinanceira (String nomeInstituicao, String tipoDeInstituicao, int numeroInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
		this.tipoDeInstituicao = tipoDeInstituicao;
		this.numeroInstituicao = numeroInstituicao;
	}
	
	//Getters and setters

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getTipoDeInstituicao() {
		return tipoDeInstituicao;
	}

	public void setTipoDeInstituicao(String tipoDeInstituicao) {
		this.tipoDeInstituicao = tipoDeInstituicao;
	}

	public int getNumeroInstituicao() {
		return numeroInstituicao;
	}

	public void setNumeroInstituicao(int numeroInstituicao) {
		this.numeroInstituicao = numeroInstituicao;
	}


}