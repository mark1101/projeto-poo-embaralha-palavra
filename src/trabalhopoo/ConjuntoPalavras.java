/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Embaralha.BaguncaPar;
import Embaralha.EmbaralhaLista;
import Embaralha.Inverte;
import java.util.Random;

public class ConjuntoPalavras {

    public void EscolhaPalavra(int numero) {
        String[] palavra = {"abacate", "jogador", "calopsita", "brasileiro",
            "prateleira", "liquidificador", "salgadinho", "atendimento", "melancia", "especial"};

        Random rand = new Random();
        int num = rand.nextInt(9);

        EscolheMetodo escolhe = new EscolheMetodo();

        escolhe.Escolhe(palavra[numero]);

    }
}
