package br.com.alura.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.factory.ConexaoFactory;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		ConexaoFactory conexao = new ConexaoFactory();

		Connection con = conexao.criaConexao();
		
		Statement stm = con.createStatement();
		stm.execute("SELECT * FROM PRODUTO");
		
		ResultSet rst = stm.getResultSet();
		
		while (rst.next()) {
			int id = rst.getInt("id");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String descricao = rst.getString("descricao");
			System.out.println(descricao);
		}

		System.out.println("Fechando conexão!!");

		con.close();
	}

}
