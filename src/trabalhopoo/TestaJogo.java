package trabalhopoo;

import java.util.Scanner;

/**
 * Created by Wagner Silvestre on 5/29/2018.
 */

public class TestaJogo {
    public static void main(String[] args){
        FuncionamentoModificador funcionamentoModificador = InventaFuncionamentoModificador.escolheFuncionamento(0);
        Scanner in = new Scanner(System.in);

        while(!funcionamentoModificador.acabou()){
            System.out.println(funcionamentoModificador.getPalavraErrada());

            String input = in.nextLine();

            if(funcionamentoModificador.tentarPalavra(input)){
                System.out.println("Parabens você acertou!");
            }
            else{
                System.out.println("Voce errou");
            }

        }

        System.out.println("Fim de jogo");
    }
}
