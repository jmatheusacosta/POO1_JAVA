/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import br.AtorDAO;
import br.ClienteDAO;
import br.FilmeDAO;
import java.util.List;
import pacote.Ajuda;
import pacote.Ator;
import pacote.Cliente;
import pacote.Endereco;
import pacote.Filme;

/**
 *
 * @author Aluno
 */
public class Teste {
        public static void main(String[] args) {
        
    	Cliente c = new Cliente("Roberto", "12312331", new Endereco("Rua A,95"));
    	
    	System.out.println(c.getEndereco());
    	
        //Filme filme = new Filme();
        //filme.setTitulo("Interestellar");
        //filme.setCategoria("AÇÃO");
        
        ClienteDAO c_dao = new ClienteDAO();
        FilmeDAO f_dao = new FilmeDAO();
        AtorDAO a_dao = new AtorDAO();
        
        //if(f_dao.cadastrar(filme)){
            
        //    System.out.println("CADASTRO FEITO");
        //}
        
        //f_dao.remover("Narcos");
        
        //f_dao.atualizar("Ficção", "Interestellar", "Os Trombadinhas");
        
        
        
        //Ator ator1 = new Ator();
        //ator1.setNome("Ronalda Raios");
        //ator1.setData_nasc("20000101");
        
        //if(a_dao.cadastrar(ator1)) {
        //	System.out.println("CADASTRO FEITO");
        //}
        
        
        //a_dao.atualizar("JK Simmons", "20040812", "Pedro Pascal");
        
        
        Cliente cl1 = new Cliente("João Douglas", "88921231232", new Endereco("Rua J, 34"));
        
        if(c_dao.cadastrar(cl1)) {
        	System.out.println("CADASTRO FEITO");
        }
        
        //c_dao.remover("Roberto Silva");
        
        //c_dao.atualizar("Rafael Silva", "88931232312", "Rua J, 35", "Mariana Oliveira");
        
        List<Filme> listafilme = f_dao.pesquisarTudo();
        List<Ator> listaator = a_dao.pesquisarTudo();
        List<Cliente> listacliente = c_dao.pesquisarTudo();
		
        
        
	//for(Filme f: listafilme) {
			
        //    System.out.println(f.getTitulo());
        //    System.out.println(f.getCategoria());
        //    System.out.println("");
    //}
    
        //for(Ator ator: listaator) {
        //	System.out.println(ator.getNome());
        //	System.out.println(ator.getData_nasc());
        //	System.out.println();
        //}
        
        //for(Cliente cliente: listacliente){
        //    System.out.println(cliente.getNome());
        //    System.out.println(cliente.getTelefone());
        //    System.out.println(cliente.getEndereco());
        //}
        
        
        
}
    
}
