package pages;

public class PaginaPrincipal extends BasePage {


    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String searchButton = "//*[@id=\"page_section_48252437\"]/div/section/div[2]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public PaginaPrincipal(){
        super(driver); // Hace una llamada al constructor padre del BasePage para pasar el Webdriver como Argumento
    }

        //Método para navegar a www.freerangetesters.com
        public void navigateToFreeRangeTesters(){
            navigateTo("https://freerangetesters.com");
            clickElement(searchButton);
        }

        public void clickOnSectionNavigationBar(String section){
            // Reemplaza el marcador de posicion en sectionLink con el nombre
            String xpathSection = String.format(sectionLink, section);
            clickElement(xpathSection);
        }

        public void clickOnElegirPlanButton() {
            clickElement(elegirUnPlanButton);
        }
    
}
