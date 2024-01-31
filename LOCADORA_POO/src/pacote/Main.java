
package pacote;
import br.FilmeDAO;
import br.AtorDAO;
import br.ClienteDAO;
import java.util.List;


  


public class Main {

    public static void main(String[] args) {

    	

    	

    	
    	/*try {
			Filme fconstrutor = new Filme("Erótico", "FilmeIndecente");
		} catch (CategoriaException e) {
			e.advertencia();
			e.printStackTrace();
		}*/
        
        //ClienteDAO c_dao = new ClienteDAO();
        //FilmeDAO f_dao = new FilmeDAO();
        //AtorDAO a_dao = new AtorDAO();
        
        
       
        //if(f_dao.cadastrar(filme)){
            
        //   System.out.println("CADASTRO FEITO");
        //}
        
        //f_dao.remover("Interestellar");
        
        //f_dao.atualizar("Ficção", "Interestellar", "Os Trombadinhas");
        
        
        

        
        //if(a_dao.cadastrar(ator1)) {
        //	System.out.println("CADASTRO FEITO");
        //}
        
        
        //a_dao.atualizar("JK Simmons", "20040812", "Pedro Pascal");
        
        
        //Cliente cl1 = new Cliente("João Douglas", "88921231232", new Endereco("Rua J, 34"));
        
        //if(c_dao.cadastrar(cl1)) {
        //	System.out.println("CADASTRO FEITO");
        //}
        
        //c_dao.remover("Roberto Silva");
        
        //c_dao.atualizar("Rafael Silva", "88931232312", "Rua J, 35", "Mariana Oliveira");
        
        //List<Filme> listafilme = f_dao.pesquisarTudo();
        //List<Ator> listaator = a_dao.pesquisarTudo();
        //List<Cliente> listacliente = c_dao.pesquisarTudo();
		
        
        //System.out.println(listafilme);
        //System.out.println(listaator);
        //System.out.println(listacliente);
        
        
	//for(Filme f: listafilme) {
			
    //        System.out.println(f.getTitulo());
    //        System.out.println(f.getCategoria());
    //        System.out.println("");
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
        
        
        //CHAMADA METODO STATIC AJUDA
        //Ajuda.Ajuda();
        
    	
    	
    	//EXEMPLO DE COMO UM USUARIO PODE PEDIR A IMPRESSÃO DA LISTA COMPLETA DE FILMES.
    	/*List<Filme> listaf = BD.listarfilme();
    	
    	System.out.println(listaf);
    	
    	for(Filme f: listaf) {
			
    	          System.out.println(f.getTitulo());
    	           System.out.println(f.getCategoria());
    	            System.out.println("");
    	    }*/
    	
    	
    	//EXEMPLO DE COMO UM USUARIO PODE PEDIR O CADASTRO DE UM Ator
        /*Ator ator1 = new Ator();
        ator1.setNome("Ronalda Raios");
        ator1.setData_nasc("20000101");
        BD.cadastrarator(ator1);
        
        List<Ator> listaator = BD.listarator();
    	
    	
        for(Ator ator: listaator) {
            	System.out.println(ator.getNome());
            	System.out.println(ator.getData_nasc());
            	System.out.println();
            }*/
    	
    	//EXEMPLO DE COMO UM USUARIO PODE PEDIR A REMOÇÃO DE UM CLIENTE
    	
    	/*BD.removercliente("Roberto Silva");
    	
    	List<Cliente> listacliente = BD.listarcliente();
    	
    	for(Cliente cliente: listacliente){
                System.out.println(cliente.getNome());
                System.out.println(cliente.getTelefone());
                System.out.println(cliente.getEndereco());
            }*/
    	
    	
    	//EXEMPLO DE COMO UM USUARIO PODE PEDIR A ATUALIZAÇÃO DE UM FILME
    	/*BD.atualizarfilme();
    	
    	
    	List<Filme> listaf = BD.listarfilme();
    	
    	System.out.println(listaf);
    	
    	for(Filme f: listaf) {
			
    	          System.out.println(f.getTitulo());
    	           System.out.println(f.getCategoria());
    	            System.out.println("");
    	}*/
    	
    	
    	//TESTE CADASTRO FILME

        //BD.cadastrarfilme();
    	
    	//BD.removerfilme();
    	
}
}
