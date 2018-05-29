package trabalhopoo;

import java.util.Random;

/**
 * Created by Wagner Silvestre on 5/28/2018.
 */

public class InventaFuncionamentoModificador {
    public static FuncionamentoModificador[] funcionamentos =
            {new FuncionamentoErrouAcabou(), new FuncionamentoRecuperaVida(), new FuncionamentoTresVidas()};

    public static FuncionamentoModificador escolheFuncionamento(int n){
        return funcionamentos[n];
    }

    public static FuncionamentoModificador escolheFunctionamentoAleatorio(){
        Random rand = new Random();

        return escolheFuncionamento(rand.nextInt(funcionamentos.length));
    }

}
