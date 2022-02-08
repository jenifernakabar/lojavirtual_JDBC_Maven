package br.com.alura.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.alura.factory.ConexaoFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConexaoFactory conexao = new ConexaoFactory();
		
		Connection con = conexao.criaConexao();
		
		System.out.println("Fechando conexão!!");
		con.close();
	}

}
