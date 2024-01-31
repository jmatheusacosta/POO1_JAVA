package br;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pacote.Ator;
import pacote.Ator;

public class AtorDAO {

    private ConexaoBD conexao = new ConexaoBD();

    public boolean cadastrar(Ator ator) {
        Connection con = conexao.getConnection();
        String sql = "INSERT INTO ator(nome, data_nasc) VALUES(?, ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ator.getNome());
            stmt.setString(2, ator.getData_nasc());

            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<Ator> pesquisarTudo() {
        List<Ator> lista = new ArrayList<>();
        Connection con = conexao.getConnection();
        Ator ator;

        try {
            ResultSet result = con.createStatement().executeQuery("SELECT * FROM ator");

            while (result.next()) {
                ator = new Ator();
                ator.setNome(result.getString("nome"));
                ator.setData_nasc(result.getString("data_nasc"));
                lista.add(ator);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void remover(String ator) {
        Connection con = conexao.getConnection();
        try {
            String sql = "DELETE FROM ator WHERE nome=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ator);

            int rowsAffected = statement.executeUpdate();
            System.out.println("Linhas afetadas: " + rowsAffected);

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(String nome, String dataNasc, String pesquisa) {
        Connection con = conexao.getConnection();
        try {
            String sql = "UPDATE ator SET nome = ?, data_nasc = ? WHERE ator.nome = ? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, dataNasc);
            statement.setString(3, pesquisa);

            int rowsAffected = statement.executeUpdate();
            System.out.println("Linhas afetadas: " + rowsAffected);

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
