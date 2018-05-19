/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import Embaralha.BaguncaPar;
import Embaralha.EmbaralhaLista;
import Embaralha.Inverte;
import View.Tela;
import java.util.Random;

public class EscolheMetodo {

    public void Escolhe(String palavra) {
        Random rand = new Random();

        int num = rand.nextInt(3);
        System.out.println("nume : " + num);
        Inverte inverte = new Inverte();
        EmbaralhaLista lista = new EmbaralhaLista();
        BaguncaPar bagunca = new BaguncaPar();

        Tela telaPassaNum = new Tela();
        telaPassaNum.Num(num);  // passa numero para variavel global na main
        
        
        if (num == 0) {
            //System.out.println("111");
            inverte.Muda(palavra);
            
            //System.out.println(inverte.toString());
        }
        if (num == 1) {
            //System.out.println("2222");
            lista.Muda(palavra); //// 
            //System.out.println(lista.getPalavra());
            
        }
        if (num == 2) {
           // System.out.println("3333");
            bagunca.Muda(palavra);
           // System.out.println(bagunca.toString());
            
        }

    }
}
