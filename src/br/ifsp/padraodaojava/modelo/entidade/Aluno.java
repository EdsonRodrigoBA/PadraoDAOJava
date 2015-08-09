package br.ifsp.padraodaojava.modelo.entidade;

public class Aluno {
	
	private Long id;
	private String nome;
	private String cpf;

	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
