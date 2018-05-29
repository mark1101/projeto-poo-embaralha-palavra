package trabalhopoo;

/**
 * Created by Wagner Silvestre on 5/28/2018.
 */

public interface FuncionamentoModificador {
    public String getNome();
    public String getDesc();

    public int getPontos();

    public int getVidas();

    public void acertou();
    public void errou();

    public boolean tentarPalavra(String palavra);

    public String getPalavraErrada();

    public boolean acabou();

}
