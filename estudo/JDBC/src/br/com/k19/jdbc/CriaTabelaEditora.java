package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CriaTabelaEditora {
	
	public static void main (String[] args) throws Exception {
		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";
		String usuario = "root";
		String senha = "serenaya";
		
		System.out.println("Abrindo conexão...");
		Class.forName("com.mysql.jdbc.Driver"); //classe do driver de conexao (sem esta linha, o programa nao compila)
		Connection conexao =
				DriverManager.getConnection(stringDeConexao, usuario, senha);
		System.out.println("Criando a tabela Editora...");
		String sql =
				" CREATE TABLE Editora ( " +
				" id BIGINT NOT NULL AUTO_INCREMENT , " +
				" nome VARCHAR (255) NOT NULL , " +
				" email VARCHAR (255) NOT NULL , " +
				" PRIMARY KEY ( id ) " +
				")" +
				" ENGINE = InnoDB " ;

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.execute();
		comando.close() ;

		System.out.println("Fechando conexão...");
		conexao.close();
	}
}