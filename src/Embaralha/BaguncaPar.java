package Embaralha;

import trabalhopoo.Modificador;

public class BaguncaPar implements Modificador {

    public String Muda(String palavraVem) {
        
        String palavraPronta = "";
        String palavraNova = palavraVem;
        char primeira;
        int tamanho = palavraNova.length();

        for (int i = 0; i < tamanho; i = i + 2) {
            if (i % 2 == 0) {
                primeira = palavraVem.charAt(i);
                palavraPronta += primeira;
            }
            i--;
            if (i % 2 == 1) {
                primeira = palavraVem.charAt(i);
                palavraPronta += primeira;
            }
            if (i == tamanho) {
                palavraPronta += palavraVem.charAt(i);
            }
            i++;
        }

        return palavraPronta;

    }
}
