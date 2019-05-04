package br.com.k19.jpa;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
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
	
	@OneToMany
	private Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public Collection<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	public void setFuncionarios(Collection<Funcionario> funcionarios){
		this.funcionarios = funcionarios;
	}
}
