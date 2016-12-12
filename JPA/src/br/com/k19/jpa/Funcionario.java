package br.com.k19.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	
	public long getId(){
		return id;
	}
	public String getNome(){
		return nome;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
}
