package br.com.study.cadastrousuario.models;

public class Usuario {

	private String nome;
	private String cpf;

	public Usuario(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}
