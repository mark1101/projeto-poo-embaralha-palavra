package trabalhopoo;

/**
 * Created by Wagner Silvestre on 5/29/2018.
 */

public class FuncionamentoTresVidas implements FuncionamentoModificador{
    private int pontos;
    private int vidas;
    private String nome;
    private String desc;

    private String palavraCerta;
    private String palavraErrada;

    private Modificador modificador;

    public FuncionamentoTresVidas(){
        nome = "Tres vidas";
        desc = "Modo de jogo com tres vidas, com modificador aleatório";
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

    @Override
    public int getPontos() {
        return pontos;
    }

    public void acertou(){
        pontos += 30;
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

    private void novaPalavra(){
        String novaPalavra = ConjuntoPalavras.escolhePalavraAleatoria();
        palavraCerta = novaPalavra;
        palavraErrada = modificador.Muda(novaPalavra);
    }

    @Override
    public boolean acabou() {
        return vidas < 1;
    }
}
