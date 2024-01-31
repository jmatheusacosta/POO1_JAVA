package br;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import pacote.Ator;
import pacote.Cliente;
import pacote.Filme;

class ConexaoBD {

	 Connection getConnection() {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/locadora_dvd", "root", "");

		} catch (ClassNotFoundException e) {
					e.printStackTrace();
                    System.out.println("ARQUIVO DE BIBLIOTECA PARA A CONEXÃO AO BANCO DE DADOS CORROMPIDO, OU FALTANDO.");

			e.printStackTrace();
		} catch (SQLException e) {
						
                        System.out.println("BASE DE DADOS INEXISTENTE OU OFFLINE :(");

			e.printStackTrace();
		}

		return con;
	}
	 
 
}
