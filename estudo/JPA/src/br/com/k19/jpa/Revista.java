package br.com.k19.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Revista {
	@Id @GeneratedValue
	private long id;
	
	private String nome;
	private Double preco;
	
	public long getId(){
		return id;
	}
	public String getNome(){
		return nome;
	}
	public Double getPreco(){
		return preco;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPreco(Double preco){
		this.preco = preco;
	}
}
