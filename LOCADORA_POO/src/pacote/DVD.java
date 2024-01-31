/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author Aluno
 */
public class DVD {
    
	private int clienteid, filmeid;
	
	public DVD() {
		
	}
	
	public DVD(int filmeid, int clienteid) {
		this.filmeid = filmeid;
		this.clienteid = clienteid;
	}

	public int getClienteid() {
		return clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}

	public int getFilmeid() {
		return filmeid;
	}

	public void setFilmeid(int filmeid) {
		this.filmeid = filmeid;
	}


	
}
