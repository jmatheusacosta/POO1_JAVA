/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author Aluno
 */
public class Ator {

	private String nome, data_nasc;
	
	public Ator() {
		
	}
	
    public Ator(String nome, String data_nasc) {
    	this.nome = nome;
    	this.data_nasc = data_nasc;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
}
