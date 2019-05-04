package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RemoveEditora {

	public static void main(String[] args) throws Exception {
		System.out.println("Abrindo Conexão...");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = ConnectionFactory.createConnection();
		
		Scanner entrada = new Scanner(System.in);
		Editora e = new Editora();
		
		System.out.println("Informe o id da editora que deseja remover: ");
		e.setId(Long.parseLong(entrada.nextLine()));
		
		entrada.close();
		
		String sql = "DELETE FROM Editora WHERE id = ?";
		
		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setLong(1, e.getId());

		System.out.println("Executando comando...");
		comando.execute();
		
		System.out.println("Fechando conexão...");
		conexao.close();
	}

}