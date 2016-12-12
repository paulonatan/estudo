package br.com.k19.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Consulta {
	
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("livraria-pu");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		/*Recuperando a quantidade de revistas*/
		String jpql = "SELECT COUNT(x) FROM Revista x";
		TypedQuery<Long> consulta1 = manager.createQuery(jpql,Long.class);
		Long contador = consulta1.getSingleResult();
		System.out.println("Ha "+contador+" revistas");
		jpql = "SELECT COUNT (x) FROM Revista x WHERE x.preco > 100";
		TypedQuery<Long> consulta2 = manager.createQuery(jpql, Long.class);
		contador = consulta2.getSingleResult();
		System.out.println ("Há " +contador+ " revistas com preço acima de 100.\n");
		jpql = "SELECT SUM (x.preco) FROM Revista x";
		TypedQuery <Double> consulta3 = manager.createQuery(jpql, Double.class);
		Double soma = consulta3.getSingleResult();
		System.out.println("A soma dos preços das revistas é "+soma+"\n");
		jpql = "SELECT MAX (x.preco) FROM Revista x";
		TypedQuery<Double> consulta4 = manager.createQuery(jpql, Double.class);
		Double precoMaximo = consulta4.getSingleResult();
		System.out.println(" O preço da revista mais cara é " +precoMaximo+ "\n") ;
		jpql = "SELECT AVG (x.preco) FROM Revista x";
		TypedQuery<Double> consulta5 = manager.createQuery(jpql, Double.class);
		Double media = consulta5.getSingleResult();
		System.out.println ("A média dos preços das revistas é " +media+ "\n") ;
		jpql = "SELECT x FROM Revista x";
		TypedQuery<Revista> consulta6 = manager.createQuery(jpql, Revista.class);
		List<Revista> revistas = consulta6.getResultList();
		System.out.println("Todas as revistas: ");
		
		for (Revista revista : revistas) {
			System.out.println("Id: "+revista.getId());
			System.out.println("Nome: "+revista.getNome());
			System.out.println("Preço: "+revista.getPreco()) ;
			System.out.println() ;
			}
		manager.close();
		factory.close();
	}

}
