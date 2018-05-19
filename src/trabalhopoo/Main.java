package trabalhopoo;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import View.Tela;
import trabalhopoo.ConjuntoPalavras;
import trabalhopoo.EscolheMetodo;

public class Main {

    public static void main(String[] args) {
        String palavra = ConjuntoPalavras.EscolhaPalavra(0);
        Jogo jogo = EscolheMetodo.Escolhe(0);
        
        String novaPalavra = jogo.Muda(palavra);
        System.out.println(novaPalavra);
    }
}
