package br.com.k19.jpa;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsereClienteComJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("livraria-pu");
		
		EntityManager manager = factory.createEntityManager();
		
		Cliente c = new Cliente();

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
		c.setNome(entrada.nextLine());
		
		System.out.println("Informe o cpf do cliente: ");
		c.setCpf(entrada.nextLine());
		
		Endereco e = new Endereco();
		c.setEndereco(e);
		
		System.out.println("Informe o endereço do cliente: ");
		
		System.out.println("País: ");
		e.setPais(entrada.nextLine());
		
		System.out.println("Estado: ");
		e.setEstado(entrada.nextLine());
		
		System.out.println("Cidade: ");
		e.setCidade(entrada.nextLine());
		
		System.out.println("Logradouro: ");
		e.setLogradouro(entrada.nextLine());
		
		System.out.println("Numero: ");
		e.setNumero(entrada.nextLine());
		
		System.out.println("Complemento: ");
		e.setComplemento(entrada.nextLine());
		
		System.out.println("CEP: ");
		e.setCep(entrada.nextLine());
		
		entrada.close();
		
		manager.persist(c);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		System.out.println("Cliente cadastrado com o ID: "+c.getId());
		manager.close();
		factory.close();

	}

}
