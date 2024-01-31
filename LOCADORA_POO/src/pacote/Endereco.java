package pacote;

public class Endereco {

	private String rua, numero;
	
        private String endereco;
        
	public Endereco() {
		
	}
	
	public Endereco(String endereco) {
                this.endereco = endereco;
	}

        
        
	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
        public void setEndereco(String endereco){
            this.endereco = endereco;
    }
}
