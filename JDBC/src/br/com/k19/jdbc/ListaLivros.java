package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ListaLivros {

	public static void main(String[] args) throws Exception {
		/*Bloco de conexão ao banco de dados/
		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";
		String usuario = "root";
		String senha = "serenaya";
		/*************************************************************/
		
		/*Parametros necessarios para a conexao*/
		System.out.println("Abrindo conexão...");
		Class.forName("com.mysql.jdbc.Driver"); //classe do driver de conexao (sem esta linha, o programa nao compila)
		Connection conexao = ConnectionFactory.createConnection();
		/*************************************************************/
		
		/*String SQL para receber informacoes do banco*/
		String sql = "SELECT * FROM Livro;";
		PreparedStatement comando = conexao.prepareStatement(sql);
		System.out.println("Executando comando...");
		ResultSet resultado = comando.executeQuery();
		/**************************************************************/
		
		/*Array list para capturar os resultados*/
		List<Livro> lista = new ArrayList<Livro>();
		while(resultado.next()){
			Livro e = new Livro();
			e.setId(resultado.getLong("id"));
			e.setTitulo(resultado.getString("titulo"));
			e.setPreco(resultado.getDouble("preco"));
			lista.add(e);
		}
		/*Exibicao dos resultados obtidos*/
		System.out.println("Resultados Encontrados: \n");
		for(Livro livro: lista){
			System.out.println("Id: \t"+livro.getId());
			System.out.println("Nome: "+livro.getTitulo());
			System.out.println("Email: "+livro.getPreco());
			System.out.println("-------------------------------");
		}
		System.out.println("Fechando a conexão... \n");
		conexao.close();
	}
}