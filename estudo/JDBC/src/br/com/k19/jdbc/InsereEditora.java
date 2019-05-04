package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsereEditora {
	public static void main (String[] args ) throws Exception {
		/* Bloco de código referente a conexão ao banco de dados 
		String stringDeConexao = "jdbc:mysql://localhost:3306/livraria"; 
		String usuario = "root";
		String senha = "serenaya";
		/* 														 */
		/*Abrir a conexão e informar os comandos sql ao banco */
		System.out.println ("Abrindo conexão...") ; // mensagem de abertura da conexão
		Class.forName("com.mysql.jdbc.Driver"); //classe do driver de conexao (sem esta linha, o programa nao compila)
		Connection conexao = ConnectionFactory.createConnection();
		
		Scanner entrada = new Scanner(System.in); //declaração de variavel para capturar informações do usuário
		Editora e = new Editora();
		
		System.out.println ("Digite o nome da editora:");
		e.setNome (entrada.nextLine()); //armazena o valor informado pelo usuário
		
		System.out.println("Digite o email da editora:");
		e.setEmail(entrada.nextLine()); //armazena o valor informado pelo usuário
		
		entrada.close();
		
		/* Bloco de códigos referentes aos comandos sql para inserir valores no banco*/
		String sql = "INSERT INTO Editora(nome, email)  VALUES (?, ?)";
		PreparedStatement comando = conexao.prepareStatement(sql ,
				Statement.RETURN_GENERATED_KEYS);
		comando.setString(1, e.getNome());
		comando.setString(2, e.getEmail());
		System.out.println("Executando comando...");
		comando.execute(); //executa o comando no banco
		
		/*Bloco de codigos referente a captura de informações do banco, no caso, o ID gerado*/ 
		System.out.println ("Recuperando o ID gerado pelo SGBD...");
		ResultSet generatedKeys = comando.getGeneratedKeys();
		generatedKeys.next();
		
		e.setId(generatedKeys.getLong(1));
		
		System.out.println(" ID : "+e.getId()); //exibe o ID gerado.
		System.out.println("Fechando conexão...");
		conexao.close () ;
		}
}
