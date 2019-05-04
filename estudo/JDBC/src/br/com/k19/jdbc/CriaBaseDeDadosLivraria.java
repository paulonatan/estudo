package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CriaBaseDeDadosLivraria {
	
	public static void main ( String [] args ) throws Exception {
	
		String stringDeConexao = "jdbc:mysql://localhost:3306"; //string para conectar ao banco
		String usuario = "root"; //usuario 
		String senha = "serenaya"; //senha
		
		System.out.println("Abrindo conexão...");
		Class.forName("com.mysql.jdbc.Driver"); //classe do driver de conexao (sem esta linha, o programa nao compila)
		Connection conexao =
				DriverManager.getConnection (stringDeConexao, usuario, senha); //parametros de conexao
		
		System.out.println("Apagando a base de dados livraria...");
		String sql = "DROP DATABASE IF EXISTS livraria";
		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.execute();
		comando.close() ;
		
		System.out.println("Criando a base de dados livraria...");
		sql = "CREATE DATABASE livraria";
		comando = conexao.prepareStatement(sql);
		comando.execute();
		comando.close();
		System.out.println("Fechando conexão...");

		conexao.close();
	}
}