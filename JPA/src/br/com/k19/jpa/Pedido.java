package br.com.k19.jpa;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@ManyToOne
	private Consumidor consumidor;
	
	public long getId(){
		return id;
	}
	public Calendar getData(){
		return data;
	}
	public Consumidor getConsumidor(){
		return consumidor;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setData(Calendar data){
		this.data=data;
	}
	public void setConsumidor(Consumidor consumidor){
		this.consumidor=consumidor;
	}
}
