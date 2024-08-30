import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Casos {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jequiroga\\IdeaProjects\\Pruebas_Conexiones\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    private void esperar(int milisegundos) throws InterruptedException {
        Thread.sleep(milisegundos);
    }

    @Test
    public void testCasos() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1250, 900));
        driver.get("http://10.250.3.66:8080/savia/");
        esperar(1200);
        driver.findElement(By.cssSelector("input#login\\:usuario")).sendKeys("jquirogg");
        driver.findElement(By.cssSelector("input#login\\:contrasena")).sendKeys("e0EwIqMH");
        driver.findElement(By.cssSelector("button[name='login:j_idt23']")).click();
        esperar(1200);

        driver.get("http://10.250.3.66:8080/savia/atencionusuario/casos.faces");
        esperar(1200);
        driver.findElement(By.cssSelector("button#frmCasos\\:j_idt57")).click();
        esperar(700);

        DatosPersona();
        esperar(700);
    }
    private void DatosPersona() throws InterruptedException{
        driver.findElement(By.cssSelector("span#frmCrear\\:tipoDocumento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:tipoDocumento_3")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmCrear\\:documento")).sendKeys("81182720");
        esperar(500);
        driver.findElement(By.cssSelector("input#frmCrear\\:documento")).sendKeys(Keys.TAB);
        esperar(1500);
        driver.findElement(By.cssSelector("span#frmCrear\\:sexo_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:sexo_3")).click();
        esperar(500);


    }

}
