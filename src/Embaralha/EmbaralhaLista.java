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
    public String Muda(String palavra) {

        ArrayList<Character> lista = new ArrayList();
        String novaPalavra = "";

        for (char c: palavra.toCharArray()) {
            lista.add(c);
        }

        Collections.shuffle(lista);
        //System.out.println(lista.toString());

        for(int x = 0; x < lista.size(); x++){
            novaPalavra += lista.get(x);
        }

        return novaPalavra;

    }
    @Override
    public String toString() {
        return "EmbaralhaLista{" + "palavraa=" + palavraa + '}';
    }

   

}
