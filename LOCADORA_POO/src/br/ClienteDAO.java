package br;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pacote.Cliente;
import pacote.Cliente;
import pacote.Endereco;
import pacote.Endereco;

public class ClienteDAO {

    private ConexaoBD conexao = new ConexaoBD();

    public boolean cadastrar(Cliente cliente) {
        Connection con = conexao.getConnection();
        String sql = "INSERT INTO cliente(nome, telefone, endereco) VALUES(?, ?, ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEndereco());
            

            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<Cliente> pesquisarTudo() {
        List<Cliente> lista = new ArrayList<>();
        Connection con = conexao.getConnection();
        Cliente cliente;

        try {
            ResultSet result = con.createStatement().executeQuery("SELECT * FROM cliente");

            while (result.next()) {
                cliente = new Cliente(result.getString("nome"), result.getString("telefone"),
                        new Endereco(result.getString("endereco")));
                        
                lista.add(cliente);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void remover(String nome) {
        Connection con = conexao.getConnection();
        try {
            String sql = "DELETE FROM cliente WHERE nome=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, nome);

            int rowsAffected = statement.executeUpdate();
            System.out.println("Linhas afetadas: " + rowsAffected);

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(String nome, String telefone, String endereco, String nomep) {
        Connection con = conexao.getConnection();
        try {
            String sql = "UPDATE cliente SET nome = ?, telefone = ?, endereco = ? WHERE cliente.nome = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, telefone);
            statement.setString(3, endereco);
            statement.setString(4, nomep);

            int rowsAffected = statement.executeUpdate();
            System.out.println("Linhas afetadas: " + rowsAffected);

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
