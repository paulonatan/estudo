package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws Exception {
		/*Bloco de conexão ao banco de dados*/
		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";
		String usuario = "root";
		String senha = "serenaya";
		/*************************************************************/
		return DriverManager.getConnection(stringDeConexao, usuario, senha);
	}

}
