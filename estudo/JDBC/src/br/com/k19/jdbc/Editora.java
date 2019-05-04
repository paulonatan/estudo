package br.com.k19.jdbc;

public class Editora {
	private long id;
	private String nome;
	private String email;
	
	public String getNome() {
		return this.nome;
	}
	public String getEmail() {
		return this.email;
	}
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
