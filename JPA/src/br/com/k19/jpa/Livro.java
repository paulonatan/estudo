package br.com.k19.jpa;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	@ManyToMany
	private Collection<Autor> autores = new ArrayList<Autor>();
	
	public long getId(){
		return id;
	}
	public String getNome(){
		return nome;
	}
	public Collection<Autor> getAutores(){
		return autores;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setAutores(Collection<Autor> autores){
		this.autores = autores;
	}

}
