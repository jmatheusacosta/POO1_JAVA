package pacote;


import java.util.Scanner;
import java.util.List;

import br.AtorDAO;
import br.ClienteDAO;
import br.FilmeDAO;

public class BD {


	
	public static List<Filme> listarfilme() {
		FilmeDAO f_dao = new FilmeDAO();
		
		List<Filme> listafilme = f_dao.pesquisarTudo();
		
		return listafilme;
	}
	
	
	public static List<Ator> listarator() {
		AtorDAO a_dao = new AtorDAO();
		
		List<Ator> listaator = a_dao.pesquisarTudo();
		
		return listaator;
	}
	
	public static List<Cliente> listarcliente() {
		ClienteDAO c_dao = new ClienteDAO();
		
		List<Cliente> listacliente = c_dao.pesquisarTudo();
		
		return listacliente;
	}
	
	public static void cadastrarfilme(Filme filme){

		FilmeDAO f_dao = new FilmeDAO();
		if(f_dao.cadastrar(filme)){
            
	       System.out.println("CADASTRO FEITO");
	     }
	}
	
	public static void cadastrarfilme(){
		Scanner scanner = new Scanner(System.in);
		Filme filme = new Filme();
		filme.setCategoria(scanner.nextLine());
		filme.setTitulo(scanner.nextLine());
		
		FilmeDAO f_dao = new FilmeDAO();
		if(f_dao.cadastrar(filme)){
            
	       System.out.println("CADASTRO FEITO");
	     }
	}
	
	public static void cadastrarator(Ator ator) {
		AtorDAO a_dao = new AtorDAO();
		if(a_dao.cadastrar(ator)){
            
	       System.out.println("CADASTRO FEITO");
	     }
	}
	
	public static void cadastrarator() {
		Scanner scanner = new Scanner(System.in);
		Ator ator = new Ator();
		ator.setNome(scanner.nextLine());
		ator.setData_nasc(scanner.nextLine());
		AtorDAO a_dao = new AtorDAO();
		if(a_dao.cadastrar(ator)){
            
	       System.out.println("CADASTRO FEITO");
	     }
	}
	
	
	
	public static void cadastrarcliente(Cliente cliente) {
		ClienteDAO c_dao = new ClienteDAO();
		if(c_dao.cadastrar(cliente)){
            
	       System.out.println("CADASTRO FEITO");
	     }
	}
	
	public static void cadastrarcliente() {
		Scanner scanner = new Scanner(System.in);
		Cliente cliente = new Cliente(scanner.nextLine(),scanner.nextLine(), new Endereco(scanner.nextLine()));
		ClienteDAO c_dao = new ClienteDAO();
		if(c_dao.cadastrar(cliente)){
            
	       System.out.println("CADASTRO FEITO");
	     }
	}
	
	
	public static void removerfilme(String filme) {

		
		FilmeDAO f_dao = new FilmeDAO();
		f_dao.remover(filme);
	}
	
	public static void removerfilme() {
		Scanner scanner = new Scanner(System.in);
		
		String filme = scanner.nextLine();
		
		FilmeDAO f_dao = new FilmeDAO();
		f_dao.remover(filme);
	}
	
	public static void removerator(String ator) {
		AtorDAO a_dao = new AtorDAO();
		a_dao.remover(ator);

	}
	
	public static void removerator() {
		Scanner scanner = new Scanner(System.in);
		
		String ator = scanner.nextLine();
		
		AtorDAO a_dao = new AtorDAO();
		a_dao.remover(ator);

	}
	
	public static void removercliente(String cliente) {
		ClienteDAO c_dao = new ClienteDAO();
		c_dao.remover(cliente);

	}	
	
	public static void removercliente() {
		Scanner scanner = new Scanner(System.in);
		
		String cliente = scanner.nextLine();
		
		ClienteDAO c_dao = new ClienteDAO();
		c_dao.remover(cliente);

	}
	
	public static void atualizarfilme(String categoria, String titulo, String pesquisa) {
		FilmeDAO f_dao = new FilmeDAO();
		f_dao.atualizar(categoria, titulo, pesquisa);
	}
	
	public static void atualizarfilme() {
		Scanner scanner = new Scanner(System.in);
		
		String categoria = scanner.nextLine();
		String titulo = scanner.nextLine();
		String pesquisa = scanner.nextLine();
		
		FilmeDAO f_dao = new FilmeDAO();
		f_dao.atualizar(categoria, titulo, pesquisa);
	}
	
	
	public static void atualizarator(String nome, String dataNasc, String pesquisa) {
		AtorDAO a_dao = new AtorDAO();
		a_dao.atualizar(nome, dataNasc, pesquisa);

	}
	
	public static void atualizarator() {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		String dataNasc = scanner.nextLine();
		String pesquisa = scanner.nextLine();
		
		AtorDAO a_dao = new AtorDAO();
		a_dao.atualizar(nome, dataNasc, pesquisa);

	}
	
	
	public static void atualizarcliente(String nome, String telefone, String endereco, String nomep) {
		ClienteDAO c_dao = new ClienteDAO();
		c_dao.atualizar(nome, telefone, endereco, nomep);

	}
	
	public static void atualizarcliente() {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		String telefone = scanner.nextLine();
		String endereco = scanner.nextLine();
		String nomep = scanner.nextLine();
		
		ClienteDAO c_dao = new ClienteDAO();
		c_dao.atualizar(nome, telefone, endereco, nomep);

	}

}
