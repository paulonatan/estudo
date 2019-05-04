package br.com.k19.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ligacao {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Fatura fatura;
	
	private Integer duracao;
	
	public long getId(){
		return id;
	}
	public Fatura getFatura(){
		return fatura;
	}
	public Integer getDuracao(){
		return duracao;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setFatura(Fatura fatura){
		this.fatura = fatura;
	}
	public void setDuracao(Integer duracao){
		this.duracao = duracao;
	}
}