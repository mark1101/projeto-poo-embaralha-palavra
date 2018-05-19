/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Embaralha;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;
import trabalhopoo.Jogo;

public class EmbaralhaLista implements Jogo {

    char[] palavraa;

    @Override
    public void Muda(String palavra) {

        ArrayList<Character> lista = new ArrayList();

        char[] vetorchar = palavra.toCharArray();

        for (int i = 0; i < vetorchar.length; i++) {
            lista.add(i, palavra.charAt(i));
        }
        Collections.shuffle(lista);
        //System.out.println(lista.toString());

        char[] novaPalavra = new char[lista.size()];

        for (int i = 0; i < novaPalavra.length; i++) {
            novaPalavra[i] = lista.get(i);

        }

        palavraa = novaPalavra;
        System.out.println(palavraa);
        System.out.println("lista");

    }
    public char[] getPalavra() {
        return palavraa;
    }

   

}
