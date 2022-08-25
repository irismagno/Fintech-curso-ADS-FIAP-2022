package br.com.fiap.cursoads.fintech;

public class Objetivo {
	
	// Atributos
	
	private String nomeObjetivo;
	private String descricao;
	private double valor;
	private String dataRealizacao; // format dd/MM/yyyy
	private Usuario user;
	
	// Métodos construtores
	
	public Objetivo () {
		
	}
	
	public Objetivo (String nomeObjetivo, String descricao, double valor, String dataRealizacao, Usuario user) {
		this.nomeObjetivo = nomeObjetivo;
		this.descricao = descricao;
		this.valor = valor;
		this.dataRealizacao = dataRealizacao;
		this.user = user;
	}
	
		
	// Getters and setters

	public String getNomeObjetivo() {
		return nomeObjetivo;
	}

	public void setNomeObjetivo(String nomeObjetivo) {
		this.nomeObjetivo = nomeObjetivo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(String dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
}