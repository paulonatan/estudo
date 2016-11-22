package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CriaTabelaLivro {
	
	public static void main (String[] args) throws Exception {
		/*
		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";
		String usuario = "root";
		String senha = "serenaya";
		*/
		
		System.out.println("Abrindo conexão...");
		Class.forName("com.mysql.jdbc.Driver"); //classe do driver de conexao (sem esta linha, o programa nao compila)
		Connection conexao = ConnectionFactory.createConnection();
		
		System.out.println("Criando a tabela Livro...");
		String sql =
				" CREATE TABLE Livro ( " +
				" id BIGINT NOT NULL AUTO_INCREMENT , " +
				" titulo VARCHAR (255) NOT NULL, " +
				" preco DOUBLE NOT NULL, " +
				" PRIMARY KEY (id) " +
				//" editora_id BIGINT NOT NULL, " +
				//" FOREIGN KEY fk_editora (editora_id) REFERENCES Editora (id) "+
				")" +
				" ENGINE = InnoDB " ;

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.execute();
		comando.close() ;

		System.out.println("Fechando conexão...");
		conexao.close();
	}
}