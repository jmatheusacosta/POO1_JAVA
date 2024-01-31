/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa {
        
        private Endereco endereco;
	
	public Cliente(String nome, String telefone, Endereco endereco) {
		super(nome, telefone);
                this.endereco = endereco;
	}
    
        
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return endereco.getEndereco();
    }
}
