package Fila;

import listaLigada.ListaLigada;

public class Fila {
    private ListaLigada fila = new ListaLigada();


    public void adciona(String aluno){
        fila.adiciona(aluno);
    }

    public void delete(){
        fila.remove(0);
    }

    public boolean Vazia(){
        return fila.tamanho() == 0;
    }

    @Override
    public String toString(){
        return fila.toString();
    }
}
