package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ListaEditoras {

	public static void main(String[] args) throws Exception{
		/*
		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";
		String usuario = "root";
		String senha = "serenaya";
		*/
		
		System.out.println("Abrindo conexão...");
		Class.forName("com.mysql.jdbc.Driver"); //classe do driver de conexao (sem esta linha, o programa nao compila)
		Connection conexao = ConnectionFactory.createConnection();
		
		String sql = "SELECT * FROM Editora;";
		PreparedStatement comando = conexao.prepareStatement(sql);
		System.out.println("Executando comando...");
		ResultSet resultado = comando.executeQuery();
		
		List<Editora> lista = new ArrayList<Editora>();
		while(resultado.next()){
			Editora e = new Editora();
			e.setId(resultado.getLong("id"));
			e.setNome(resultado.getString("nome"));
			e.setEmail(resultado.getString("email"));
			lista.add(e);
		}
		System.out.println("Resultados Encontrados: \n");
		for(Editora editora : lista){
			System.out.println("Id: \t"+editora.getId());
			System.out.println("Nome: "+editora.getNome());
			System.out.println("Email: "+editora.getEmail());
			System.out.println("-------------------------------");
		}
		System.out.println("Fechando a conexão... \n");
		conexao.close();
		//fecha conexao
	}
}
