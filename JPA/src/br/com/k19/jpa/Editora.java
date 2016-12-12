package br.com.k19.jpa;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Editora {
	@Id
	@GeneratedValue
	private Long id ;
	private String nome ;
	private String email ;
	
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
