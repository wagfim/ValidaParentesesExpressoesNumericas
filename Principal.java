package br.edu.ifpr.questao2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pilha novaPilha = new Pilha();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma expressão numérica: ");
        String expressao = scan.nextLine();
        
        for (int i = 0; i < expressao.length(); i++) {
            novaPilha.empilha(expressao.charAt(i));
        }
        
        if(validaParesParenteses(novaPilha))
            System.out.println("A pilha está balanceada.");
        else
            System.out.println("A pilha está desbalanceada.");
        
    }
    
    public static boolean validaParesParenteses(Pilha pilha) {
        Pilha aberturas = new Pilha();
        Pilha fechamentos = new Pilha();
        
        for (int i = 0; i < pilha.getTamanho(); i++) {
            char temp = pilha.desempilha();
            if(temp == '(')
                aberturas.empilha(temp);
            if(temp == ')')
                fechamentos.empilha(temp);
        }
        
        if(aberturas.getTamanho() != fechamentos.getTamanho())
            return false;
        
        return true;
    }
}
