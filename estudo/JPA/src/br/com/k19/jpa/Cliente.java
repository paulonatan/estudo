package br.com.k19.jpa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String cpf;
	
	@Embedded
	private Endereco endereco;
	
	public Endereco getEndereco(){
		return this.endereco;
	}
	public long getId(){
		return this.id;
	}
	public String getNome(){
		return this.nome;
	}
	public String getCpf(){
		return this.cpf;
	}
	//public void setId(long id){
	//	this.id = id;
	//}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
}
