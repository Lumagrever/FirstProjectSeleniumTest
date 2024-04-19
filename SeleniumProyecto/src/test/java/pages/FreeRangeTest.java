package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {

    private WebDriver driver;

    // Ejecuta el codigo colocado dentro al ANTES de las pruebas
    @BeforeMethod
    public void setUp() {
        // Inicializa el Webdriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    // 
    @Test
    public void navegamosaFreeRangeTesters() {
        //Navega a la pagina web
        driver.get("https://www.freerangetesters.com");
    }

    // Ejecuta el codigo colocado dentro al DESPUES de las pruebas
    @AfterMethod
    public void tearDown() {
        //Cierra el navegador despues de la prueba
    if (driver != null) {
        driver.quit();
        }
    }
    
}
