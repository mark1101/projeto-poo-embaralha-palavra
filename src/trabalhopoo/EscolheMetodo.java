/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import Embaralha.BaguncaPar;
import Embaralha.EmbaralhaLista;
import Embaralha.Inverte;
import java.util.Random;

public class EscolheMetodo {
    private static Jogo[] jogos = {new Inverte(), new EmbaralhaLista(), new BaguncaPar()};

    public static Jogo Escolhe(int n) {
        return jogos[n];
    }
}
