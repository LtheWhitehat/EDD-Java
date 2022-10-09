package listaLigada;

public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;
    
    public Celula(Object elemento) {
        this(null, elemento);
    }

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula getProximo() {
        return proximo;
    }
    
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    
    public Object getElemento() {
        return elemento;
    }
    

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return Celula return the anterior
     */
    public Celula getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

}
