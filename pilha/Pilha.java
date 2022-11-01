package pilha;

import listaLigada.ListaLigada;




public class Pilha {
    private ListaLigada pilha = new ListaLigada();

    public void insere(String nome){
        pilha.adiciona(nome);
    }
    
    public void remove(){
        pilha.remove(pilha.tamanho()-1);
    }
    
    public boolean vazia(){
        return pilha.tamanho() == 0; //isEmpty() is also a good choice here
    }

    @Override
    public String toString() {
        return pilha.toString();
    }
}