package br.com.fiap.cursoads.fintech;

public class CategoriaGasto {
	
	// Atributo
	
	private String categoria;


	// Métodos construtores

	public CategoriaGasto () {
		
	}
	
	public CategoriaGasto (String categoria) {
		this.categoria = categoria;
	}
	
	// Getters and setters

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}