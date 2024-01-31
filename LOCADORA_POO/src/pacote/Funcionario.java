package pacote;

public class Funcionario extends Pessoa {
    
   

    private String carteira_trabalho;
    
    private String cargo;

    public Funcionario(String nome, String telefone, String carteira_trabalho, String cargo) {
        super(nome, telefone);
        this.carteira_trabalho = carteira_trabalho;
        this.cargo = cargo;
    }

    public String getCarteira_trabalho() {
        return carteira_trabalho;
    }

    public void setCarteira_trabalho(String carteira_trabalho) {
        this.carteira_trabalho = carteira_trabalho;
    }
    

    
    public String getCargo(){
        return cargo;
    }
    
    
    
}

