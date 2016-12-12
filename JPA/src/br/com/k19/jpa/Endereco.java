package br.com.k19.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	
	public String getPais(){
		return this.pais;
	}
	public String getEstado(){
		return this.estado;
	}
	public String getCidade(){
		return this.cidade;
	}
	public String getLogradouro(){
		return this.logradouro;
	}
	public String getNumero(){
		return this.numero;
	}
	public String getComplemento(){
		return this.complemento;
	}
	public String getCep(){
		return this.cep;
	}
	public void setPais(String pais){
		this.pais = pais;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	public void setComplemento(String complemento){
		this.complemento = complemento;
	}
	public void setCep(String cep){
		this.cep = cep;
	}
}