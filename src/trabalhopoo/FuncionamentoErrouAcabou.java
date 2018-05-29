package trabalhopoo;

/**
 * Created by Wagner Silvestre on 5/29/2018.
 */

public class FuncionamentoErrouAcabou implements FuncionamentoModificador {
    private int pontos;
    private int vidas;
    private String nome;
    private String desc;
    private String palavraCerta;
    private String palavraErrada;
    private Modificador modificador;

    public FuncionamentoErrouAcabou(){
        nome = "Errou acabou";
        desc = "Modo de jogo com apenas uma vida, com palavras embaralhadas aleatoriamente";
        vidas = 1;
        pontos = 0;
        modificador = InventaModificador.Escolhe(1);
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
        pontos += 100;
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
    private void novaPalavra(){
        String novaPalavra = ConjuntoPalavras.escolhePalavraAleatoria();
        palavraCerta = novaPalavra;
        palavraErrada = modificador.Muda(novaPalavra);
    }
}
