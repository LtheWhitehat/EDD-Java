package Conjunto;

import java.util.LinkedList;
import java.util.List;

public class Conjunto {
    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();    

    public Conjunto() {
        for(int i = 0; i < 26; i++){
            tabela.add(new LinkedList<>());
        }
    }

    public int calculaIndiceDaTabela(String palavra){
       return palavra.toLowerCase().charAt(0)%26;
        
    }

    public void remove(String palavra){
        if(contem(palavra)){
           int indice = calculaIndiceDaTabela(palavra);
           List<String> lista = tabela.get(indice);
           lista.remove(palavra); 
        }
    }

    public void adiciona(String palavra){
        int indice = calculaIndiceDaTabela(palavra);
        LinkedList<String> lista = tabela.get(indice);
        if(!contem(palavra)){
            lista.add(palavra);
        }
        
    }

    public boolean contem(String palavra){
        int indice = calculaIndiceDaTabela(palavra);
        return tabela.get(indice).contains(palavra);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return tabela.toString();
    }
}
