package ed;

public class Vetor {
    
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    private void garanteEspaco(){
        if(totalDeAlunos == alunos.length){
            Aluno[] novoArray = new Aluno[totalDeAlunos * 2];
            for(int i = 0; i < alunos.length; i++){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao){
        return alunos[posicao];
    }

    public void remove(int posicao){
        for (int i = posicao; i < alunos.length; i++) {
            if(i == alunos.length - 1){
                alunos[i] = null;
            }else{
                alunos[i] = alunos[i + 1];
            }
        }
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null && alunos[i].equals(aluno)){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        int tamanho = 0;
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                tamanho++;
            }
        }
        return tamanho;
    }

    public String toString(){
        if(tamanho() == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                builder.append(alunos[i]);
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
