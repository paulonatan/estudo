package br.com.k19.jpa;

import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaFaturaLigacao {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("livraria-pu");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Scanner entrada = new Scanner(System.in);
		
		Ligacao ligacao1 = new Ligacao();
		System.out.println("Duracao da chamada: ");
		ligacao1.setDuracao(Integer.parseInt(entrada.nextLine()));
		
		Ligacao ligacao2 = new Ligacao();
		System.out.println("Duracao da chamada: ");
		ligacao2.setDuracao(Integer.parseInt(entrada.nextLine()));
		
		Fatura fatura = new Fatura();
		fatura.setVencimento(new GregorianCalendar(2012,11,20));
		
		fatura.getLigacoes().add(ligacao1);
		fatura.getLigacoes().add(ligacao2);
		
		entrada.close();
		
		manager.persist(fatura);
		manager.persist(ligacao1);
		manager.persist(ligacao2);
		
		System.out.println("Fatura cadastrada com o Id: "+fatura.getId());
		System.out.println("Ligacao cadastrada com o Id: "+ligacao1.getId());
		System.out.println("Ligacao cadastrada com o Id: "+ligacao2.getId());
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}

}
