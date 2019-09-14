package br.edu.ifpr.questao2;
public class No {
    private char caractere;
    private No anterior;

    public No(char caractere) {
        this.caractere = caractere;
        this.anterior = null;
    }

    public char getCaractere() {
        return caractere;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }    
}
