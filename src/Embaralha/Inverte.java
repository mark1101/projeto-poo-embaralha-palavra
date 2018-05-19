/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Embaralha;

import java.util.ArrayList;
import trabalhopoo.Jogo;

public class Inverte implements Jogo {

    String saida = "";

    public String Muda(String palavra) {
        for (int i = palavra.length() - 1; i >= 0; i--) {
            saida = saida + palavra.charAt(i);
        }
        System.out.println(saida);
        System.out.println("inverte");

        return "inverte";
    }
    @Override
    public String toString() {
        return "Inverte{" + "saida=" + saida + '}';
    }

    
}
