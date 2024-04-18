package pages;

import Enuns.Jogadas;
import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {
    private static final String url = "https://www.google.com";
    @FindBy(id = "APjFqb")
    private WebElement txtAreaPesquisa;
    @FindBy(id = "result-stats")
    private WebElement statusAproximadamente;

    @FindBy(xpath = "/html/body/div[4]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")
    private WebElement clicarLink;


    public GooglePage(WebDriver driver){
        super(driver);
    }


    public static GooglePage abrirGoogle(){
        BaseTest baseTest = new BaseTest(url);
        baseTest.preCond();
        return new GooglePage(baseTest.getDriver());
    }

    public void realizarPesquisa(String pesquisa){
        txtAreaPesquisa.sendKeys(pesquisa);
        txtAreaPesquisa.sendKeys(Keys.ENTER);


    }


    public String getStatusAproximadamente() {
        return statusAproximadamente.getText();
    }

    public void pesquisar() {
        clicarLink.click();
    }

    public void realizarJogada(Jogadas jogadas) {

    }
}
