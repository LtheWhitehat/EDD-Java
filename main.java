import listaLigada.*;
import pilha.Pilha;
import pilha.pilha;
import ed;
import Conjunto.Conjunto;
import Fila.Fila;



public class main {


    public void testaVetor(){
        Vetor vetor = new Vetor();
        for(int i =0; i<600; i++){
            Aluno aluno = new Aluno("Aluno " + i);
            vetor.adiciona(aluno);
            // System.out.println(vetor);
        }
        System.out.println(vetor.toString());
    }

    public static void testaListaDuplamenteLigada(int tamanho){
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        for(int i =0; i<tamanho; i++){
            lista.adiciona("Lillian"+i);
        }
        lista.remove(295);
        lista.adiciona(295, "Joy");
        System.out.println(lista);
    }


    public static void testaListaLigada(int tamanho){
        ListaLigada lista = new ListaLigada();

        for(int i =0; i<tamanho; i++){
            lista.adiciona("Lillian"+i);
        }
        lista.remove(295);
        lista.adiciona(295, "Joy");
        System.out.println(lista);
    }

    public static void testaPilha(int tamanho){
        Pilha pilha = new Pilha();

        for(int i =0; i<tamanho; i++){
            pilha.insere("Lillian"+i);
            
        }
        System.out.println(pilha.vazia());
        System.out.println(pilha);
        for(int i =0; i<tamanho; i++){
            pilha.remove();
        }
        System.out.println(pilha.vazia());
        System.out.println(pilha);
    }

    public static void testaFila(int tamanho){
        Fila fila = new Fila();

        for(int i =0; i<tamanho; i++){
            fila.adciona("Lillian"+i);
        }
        System.out.println(fila.Vazia());
        System.out.println(fila);
        System.out.println("\n\n\n");
        for(int i =0; i<tamanho; i++){
            fila.delete();
        }
        System.out.println(fila.Vazia());
    }

    public static void testaConjunto(int tamanho){
        Conjunto conjunto = new Conjunto();
        int ascii = (int) 'L';
        System.out.println(ascii);
        for(int i =0; i<tamanho; i++){
            conjunto.adiciona((char) ascii+ "Lillian"+i);
            ascii++;
        }
        System.out.println(conjunto.toString());

        ascii = (int) 'L';
        System.out.println(ascii);
        for(int i =0; i<tamanho; i++){
            conjunto.remove((char) ascii+ "Lillian"+i);
            ascii++;
        }


        System.out.println(conjunto.toString());

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        testaConjunto(14);
        //testaFila(35);
        //testaPilha(150);
        //testaListaDuplamenteLigada(200);
        //testaListaLigada(300);
    }
}

