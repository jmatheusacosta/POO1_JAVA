package br;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pacote.Filme;
import pacote.Filme;

public class FilmeDAO {

	private ConexaoBD conexao = new ConexaoBD();
        
        public boolean cadastrar(Filme filme) {

        		
        		
		Connection con = conexao.getConnection();

		// String sql = "INSERT INTO filme(titulo, categoria)
		// VALUES('"+filme.getTitulo()+"','"+filme.getCategoria() +"')";
		String sql = "INSERT INTO filme(titulo, categoria) VALUES(?,?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, filme.getTitulo());
			stmt.setString(2, filme.getCategoria());

			stmt.execute();
			stmt.close();

			con.close();

		} catch (SQLException u) {
			u.printStackTrace();
			return false;
		}

		return true;

	}
                
                

                
	public List<Filme> pesquisarTudo() {

		
		
		
		
		List<Filme> lista = new ArrayList<>();

		Connection con = conexao.getConnection();
		Filme f;

		try {
			ResultSet result = con.createStatement().executeQuery("select * from filme");

			while (result.next()) {
				f = new Filme();
				f.setTitulo(result.getString("titulo"));
				f.setCategoria(result.getString("categoria"));
				

				lista.add(f);

			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return lista;}
        
public void remover(String filme) {
	
	
	
    Connection con = conexao.getConnection();
    try {
        String sql = "DELETE FROM FILME WHERE TITULO=?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, filme);

        int rowsAffected = statement.executeUpdate();
        System.out.println("Linhas afetadas: " + rowsAffected);

        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
}

public void atualizar(String categoria, String titulo, String pesquisa) {
	
	
	
	Connection con = conexao.getConnection();
    try {
        String sql = "UPDATE FILME SET CATEGORIA = ?, TITULO= ? WHERE FILME.TITULO = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, categoria);
        statement.setString(2, titulo);
        statement.setString(3, pesquisa);

        int rowsAffected = statement.executeUpdate();
        System.out.println("Linhas afetadas: " + rowsAffected);

        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


		
		

	
}
