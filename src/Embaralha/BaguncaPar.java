package Embaralha;

import trabalhopoo.Modificador;

public class BaguncaPar implements Modificador {

    private String palavra;
    String palavraPronta = "";
    private char primeira;
    String ok = "";

    public String Muda(String palavra) {

        this.palavra = palavra;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho; i = i + 2) {
            if (i % 2 == 0) {
                primeira = palavra.charAt(i);
                palavraPronta += primeira;
            }
            i--;
            if (i % 2 == 1) {
                primeira = palavra.charAt(i);
                palavraPronta += primeira;
            }
            if (i == tamanho) {
                palavraPronta += palavra.charAt(i);
            }
            i++;
        }
        
        ok = palavraPronta;
        System.out.println(ok);
        System.out.println("bagunca");

        return "baguncapar";

    }

    @Override
    public String toString() {
        return "BaguncaPar{" + "ok=" + ok + '}';
    }

    

}
