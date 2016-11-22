package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RemoveLivro {

	public static void main(String[] args) throws Exception {
		System.out.println("Abrindo Conexão...");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = ConnectionFactory.createConnection();
		
		Scanner entrada = new Scanner(System.in);
		Livro e = new Livro();
		
		System.out.println("Informe o id do livro que deseja remover: ");
		e.setId(Long.parseLong(entrada.nextLine()));
		
		entrada.close();
		
		String sql = "DELETE FROM Livro WHERE id = ?";
		
		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setLong(1, e.getId());

		System.out.println("Executando comando...");
		comando.execute();
		
		System.out.println("Fechando conexão...");
		conexao.close();


	}

}
