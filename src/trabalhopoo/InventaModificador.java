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

public class InventaModificador {
    private static Modificador[] modificadors = {new Inverte(), new EmbaralhaLista(), new BaguncaPar()};

    public static Modificador Escolhe(int n) {
        return modificadors[n];
    }

    public static Modificador EscolheAleatorio(){
        Random rand = new Random();

        return Escolhe(rand.nextInt(modificadors.length));
    }
}
