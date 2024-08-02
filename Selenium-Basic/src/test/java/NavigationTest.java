import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    @Test
    public void navigateToGoogle() throws InterruptedException {
        // Configura el path del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jequiroga\\IdeaProjects\\Selenium-Basic\\src\\test\\resources\\chromedriver.exe");

        // Crea una instancia del controlador de Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // Navega a la página web
            driver.get("https://conexiones.saviasaludeps.com/savia/home.faces");

            // Introduce el nombre de usuario
            driver.findElement(By.cssSelector("input#login\\:usuario")).sendKeys("jquirogg");

            // Introduce la contraseña
            driver.findElement(By.cssSelector("input#login\\:contrasena")).sendKeys("e0EwIqMH");

            // Realiza clic en el botón de login
            driver.findElement(By.cssSelector("button[name='login:j_idt23']")).click();

            // Espera por un momento para observar el resultado
            Thread.sleep(4000);
        } finally {
            // Cierra el navegador

        }
    }
}
