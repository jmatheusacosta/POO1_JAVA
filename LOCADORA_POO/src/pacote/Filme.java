/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author Aluno
 */
public class Filme {
    
	private String categoria;
	private String titulo;
	
	public Filme() {
		
	}
	
	public Filme(String categoria, String titulo) throws CategoriaException {
        if (categoria.equalsIgnoreCase("Erótico")) {
            throw new CategoriaException();
        }
		this.categoria = categoria;
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}


	
	public void setCategoria(String categoria) {
		this.categoria = categoria;

	}


	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	}
	

