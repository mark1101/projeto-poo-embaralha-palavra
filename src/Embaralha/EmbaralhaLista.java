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

    public static char[] palavraa;
    String palavraNova = "";

    @Override
    public void Muda(String palavra) {

        ArrayList<Character> lista = new ArrayList();

        char[] vetorchar = palavra.toCharArray();

        for (int i = 0; i < vetorchar.length; i++) {
            lista.add(i, palavra.charAt(i));
        }
        Collections.shuffle(lista);

        char[] novaPalavra = new char[lista.size()];

        for (int i = 0; i < novaPalavra.length; i++) {
            palavraNova += lista.get(i);

        }

        System.out.println(palavraNova);
        System.out.println("lista ");

    }

    public String getPalavra() {
        return palavraNova;
    }

}
