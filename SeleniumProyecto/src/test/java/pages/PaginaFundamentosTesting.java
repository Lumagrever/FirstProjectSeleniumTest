package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroducionTestingLink(){
        clickElement(fundamentosTestingLink);
    }
    
}
