package pacote;

public class Atua {

	private Filme filme;
	private Ator ator;
	
        public Atua(Filme filme, Ator ator){
            this.filme = filme;
            this.ator = ator;
        }

    /**
     * @return the filme
     */
    public Filme getFilme() {
        return filme;
    }

    /**
     * @param filme the filme to set
     */
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    /**
     * @return the ator_nome
     */
    public Ator getAtor() {
        return ator;
    }

    /**
     * @param ator_nome the ator_nome to set
     */
    public void setAtor_nome(Ator ator) {
        this.ator = ator;
    }
        
}
