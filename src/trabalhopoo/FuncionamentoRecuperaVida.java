package trabalhopoo;

/**
 * Created by Wagner Silvestre on 5/29/2018.
 */

public class FuncionamentoRecuperaVida implements FuncionamentoModificador {

    private int pontos;
    private int vidas;
    private String nome;
    private String desc;

    private String palavraCerta;
    private String palavraErrada;

    private Modificador modificador;
    public FuncionamentoRecuperaVida(){
        nome = "Recupera vida";
        desc = "Modo de jogo em que voce começa com 3 vidas, e recupera uma ao acertar." +
                "Podendo recuperar até o maximo de 3 vidas. O modificador é aleatório";
        vidas = 3;
        pontos = 0;
        modificador = InventaModificador.EscolheAleatorio();
        novaPalavra();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    private void novaPalavra(){
        String novaPalavra = ConjuntoPalavras.escolhePalavraAleatoria();
        palavraCerta = novaPalavra;
        palavraErrada = modificador.Muda(novaPalavra);
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    public void acertou(){
        pontos += 15;
        vidas += (vidas < 3) ? 1 : 0 ;
        novaPalavra();
    }

    public void errou(){
        vidas--;
    }

    @Override
    public boolean tentarPalavra(String palavra) {
        if(palavra.equals(palavraCerta)){
            acertou();
            return true;
        }
        else{
            errou();
            return false;
        }
    }

    @Override
    public int getVidas() {
        return vidas;
    }

    public String getPalavraErrada() {
        return palavraErrada;
    }

    @Override
    public boolean acabou() {
        return vidas < 1;
    }
}
