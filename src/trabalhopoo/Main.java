/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import Embaralha.BaguncaPar;
import Embaralha.EmbaralhaLista;
import Embaralha.Inverte;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   
    public static int globlal;
    
    public static void main(String[] args) {
        
        
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);       // adiciona numeros a minha lista
        }
        Collections.shuffle(lista); // bagunca lista 

        ConjuntoPalavras escolha = new ConjuntoPalavras();
        escolha.EscolhaPalavra(lista.get(0)); // passa o valor da posicao 0 da lista 

    }
}
