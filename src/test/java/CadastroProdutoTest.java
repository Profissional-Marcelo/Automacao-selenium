import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroProdutoPage;
import java.sql.SQLException;

public class CadastroProdutoTest {

    private final char[] listaNumeros = {'0','1','2','3','4','5','6','7','8','9'};
    private final BaseTest baseTest = new BaseTest("");

    @Test
    public void testarLetraEmNumero () throws SQLException {
        CadastroProdutoPage pagina = getPagina("testarLetraEmNumero()");
        pagina.informarEstoqueMinimo("8");
        String estoque = pagina.getEstoqueMinimo();

        boolean retorno = false;

        for(char c: estoque.toCharArray()){
            if (isDigit(c)) {
                retorno = true;
                break;
            }

        }

        Assert.assertTrue(retorno);

    }

    @Test
    public void verificarNomeIsNumero(){
        CadastroProdutoPage pagina = getPagina("verificarNomeIsNumero()");

        pagina.informarNomeProduto("numero");

        Assert.assertEquals(pagina.getNomeProduto(), "número");
    }

    private CadastroProdutoPage getPagina(String nomeMetodo){
        System.out.println("iniciando teste: " + nomeMetodo);
        baseTest.preCond();
        return  new CadastroProdutoPage(baseTest.getDriver());
    }

    private boolean isDigit(char c){

        for(char b : listaNumeros){
            if(b == c)
                return true;
        }

        return false;
    }

}
