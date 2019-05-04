package br.com.k19.jdbc;

public class Livro {
	private String titulo;
	private Double preco;
	private long id;
	//private String editora_id;
	
	public long getId() {
		return this.id;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public Double getPreco() {
		return this.preco;
	}	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setId(long id) {
		this.id = id;
	}
}
