import Enuns.Jogadas;
import pages.GooglePage;
import org.testng.annotations.Test;

public class TesteGoogle {



    @Test
    public void pesquisarFadergs(){
        GooglePage campoBusca = GooglePage.abrirGoogle();
        campoBusca.realizarPesquisa("fadergs");
        String statusAproximadamente = campoBusca.getStatusAproximadamente();
        System.out.println(statusAproximadamente);
    }
    @Test
    public void jogaDaVelha(){
        GooglePage campoBusca = GooglePage.abrirGoogle();
        campoBusca.realizarPesquisa("jogo da velha");
        campoBusca.realizarJogada(Jogadas.MEIO);
    }

}