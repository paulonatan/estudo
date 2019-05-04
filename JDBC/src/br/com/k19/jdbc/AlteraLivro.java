package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AlteraLivro {

	public static void main(String[] args) throws Exception {
		System.out.println("Abrindo Conexão...");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = ConnectionFactory.createConnection();
		
		Scanner entrada = new Scanner(System.in);
		Livro e = new Livro();
		
		System.out.println("Informe o id do livro que deseja alterar: ");
		e.setId(Long.parseLong(entrada.nextLine()));
		
		System.out.println("Digite o novo titulo do livro: ");
		e.setTitulo(entrada.nextLine());
		
		System.out.println("Digite o novo preco do livro: ");
		e.setPreco(Double.parseDouble(entrada.nextLine()));
		
		entrada.close();
		
		String sql = "UPDATE Livro SET titulo = ? , preco = ? WHERE id = ?";
		
		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, e.getTitulo());
		comando.setDouble(2, e.getPreco());
		comando.setLong(3, e.getId());
		
		System.out.println("Executando comando...");
		comando.execute();
		
		System.out.println("Fechando conexão...");
		conexao.close();
	}

}
