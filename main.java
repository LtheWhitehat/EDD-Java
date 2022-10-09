import listaLigada.*;

import ed;



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
    /**
     * @param args
     */
    public static void main(String[] args) {
        testaListaDuplamenteLigada(200);
        //testaListaLigada(300);
    }
}

