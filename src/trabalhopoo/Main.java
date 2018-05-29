package trabalhopoo;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {

    public static void main(String[] args) {
        String palavra = ConjuntoPalavras.EscolhaPalavra(0);
        Modificador modificador = InventaModificador.Escolhe(1);

        String novaPalavra = modificador.Muda(palavra);
        System.out.println(novaPalavra);
    }
}
