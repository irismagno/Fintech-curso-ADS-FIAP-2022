package br.com.fiap.cursoads.fintech;

public class Usuario {
	
	// Atributos
	
	private int id;
	private String nome;
	private String sobrenome;
	private String genero;
	private String dataNascimento; // format dd/MM/yyyy
	private String email;
	private String senha;
	
	// Métodos construtores
	
	public Usuario () {
		
	}
	
	public Usuario (String nome, String sobrenome, String genero, String dataNascimento, String email, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
	}
	
	// Método para retornar o print dos dados do usuário (fins didáticos)
	
	public void getDadosUsuario () {
		System.out.println("O nome do usuário é: " + nome);
		System.out.println("O sobrenome do usuário é: " + sobrenome);
		System.out.println("O gênero do usuário é: " + genero);
		System.out.println("A data de nascimento do usuário é: " + dataNascimento);
		System.out.println("O email do usuário é: " + email);
		System.out.println("O id do usuárfio é " + id);
	}
	
	// Getters and setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}