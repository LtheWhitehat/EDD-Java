package listaLigada;


public class ListaDuplamenteLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;


    public void ListaLigada(){
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }


    public void adicionaNoComeco(Object elemento) {
        

        if(this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = this.primeira;
            
        }else{
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }

        this.totalDeElementos++;
    }

    public void adiciona(Object elemento) {

        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }


    public void adiciona(int posicao, Object elemento) {

        if(posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            this.totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    private Celula pegaCelula(int posicao) {

        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }
    
        Celula atual = primeira;
    
        for(int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }
    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }
        if(posicao == 0) {
            this.primeira = this.primeira.getProximo();
        } else if(posicao == totalDeElementos -1){
            this.ultima = this.ultima.getAnterior();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
        }
    }

    public void removeDoComeco() {
        if(this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }
    
        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;
    
        if(this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void removeDoFim() {
        if(this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }
    
        if(this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            Celula penultima = this.pegaCelula(this.totalDeElementos - 2);
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }

    public String toString() {
        if(this.totalDeElementos == 0) {
            return "[]";
        }
    
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
    
        for(int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }
    
        builder.append(atual.getElemento());
        builder.append("]");
    
        return builder.toString();
    }
    

    public int tamanho() {
        return this.totalDeElementos;
    }
    public boolean contem(Object o) { 
        Celula atual = this.primeira;
        while(atual != null) {
            if(atual.getElemento().equals(o)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;}
}
