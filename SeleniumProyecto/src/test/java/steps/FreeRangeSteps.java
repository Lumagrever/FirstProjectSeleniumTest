package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*; // El "*" nos trae el Given, When, And y todo lo necesario
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;
import org.testng.asserts.SoftAssert;


public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal ();
    PaginaCursos cursosPage= new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();
    
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
    landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("^(?:I|The user|The client) selects? Introducción al Testing$")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickIntroducionTestingLink();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 11 productos",
                "Academia: $176 / año • 11 productos", "Free: Gratis • 1 producto");
 
        Assert.assertEquals(listaEsperada, lista);
        
    }

    SoftAssert soft = new SoftAssert();
        //Y así se ven (exactamente como las assertions comunes, pero con el potente assertAll(); al final!
        public void Ejemplulis() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
 
        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        soft.assertAll();
 
    }

}
