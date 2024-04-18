package Enuns;

public enum Jogadas {
    CANTO_ESQUERDO_SUP(0,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]"),
    MEIO_SUPERIOR(1,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]"),
    CANTO_DIREITO_SUP(2,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]"),
    CANTO_ESQUERDO_MEIO(3,"//*[@id=\"rso\"]/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[1]"),
    MEIO(4,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]"),
    CANTO_DIREITO_MEIO(5,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]"),
    CANTO_ESQUERDO_INF(6,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[1]"),
    MEIO_INFERIOR(7,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]"),
    CANTO_DIREITO_INF(8,"/html/body/div[4]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[3]");


    private int indice;
    private String path;
    Jogadas(int indice, String path){
        this.indice = indice;
        this.path = path;
    }
}
