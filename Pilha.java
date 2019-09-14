package br.edu.ifpr.questao2;
public class Pilha {
    private No topo;
    private int tamanho = 0;

    public No getTopo() {
        return topo;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public boolean isEmpty(){ //está vazio?
        return topo == null;
    }
    
    public void empilha(char caractere){
        No newNode = new No(caractere);
        
        if(isEmpty()) {
            topo = newNode;
            this.tamanho++;
        } else {
            newNode.setAnterior(topo);
            topo = newNode;
            this.tamanho++;
        }
    }
    
    public char desempilha(){
        if(isEmpty()) {
            return 128; //128 não é um caractere ASCII válido
        } else {
            No auxiliar = topo;
            topo = topo.getAnterior();
            tamanho--;
            return auxiliar.getCaractere();
        }
    }
    
    
    
}
