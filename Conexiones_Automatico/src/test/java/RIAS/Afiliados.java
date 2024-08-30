import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Afiliados {
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
    public void testMatricular() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1250, 900));
        driver.get("http://10.250.2.35:8080/savia/login.faces");
        esperar(1200);
        driver.findElement(By.cssSelector("input#login\\:usuario")).sendKeys("jquirogg");
        driver.findElement(By.cssSelector("input#login\\:contrasena")).sendKeys("e0EwIqMH");
        driver.findElement(By.cssSelector("button[name='login:j_idt23']")).click();
        esperar(1200);

        driver.get("http://10.250.2.35:8080/savia/especial/gestion_afiliados.faces");
        esperar(1200);
        driver.findElement(By.cssSelector("button#frmGestion\\:j_idt45")).click();
        esperar(1500);
        seleccionarAfiliado();
        esperar(700);

        ProgramaEspecial();
        esperar(700);

        Diagnostico();
        esperar(700);

        BOTONGUARDAR();
        esperar(800);

    }
    private void seleccionarAfiliado() throws InterruptedException {
        driver.findElement(By.cssSelector("button#frmAfiliado\\:j_idt268")).click();
        esperar(1500);
        driver.findElement(By.cssSelector("input#frmAfiliadoLista\\3AtablaRegistrosAfiliados\\3Aj_idt718")).sendKeys("7973958");
        esperar(1000);
        driver.findElement(By.cssSelector("button#frmAfiliadoLista\\:j_idt710")).click();
        esperar(500);
        driver.findElement(By.id("frmAfiliadoLista:tablaRegistrosAfiliados_data")).click();
        esperar(500);
    }

    private void ProgramaEspecial() throws InterruptedException {
        driver.findElement(By.cssSelector("span#frmCrear\\:SomPrograma_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:SomPrograma_48")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:SomResponsable_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:SomResponsable_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:SomIps_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:SomIps_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmCrear\\:fechaInicio_input")).sendKeys("2024-08-12");
        esperar(1000);
        driver.findElement(By.cssSelector("span#frmCrear\\:estadoDiagnostico_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:estadoDiagnostico_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmCrear\\:fechaDx_input")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("input#frmCrear\\:fechaDx_input")).sendKeys("2024-08-29");
        esperar(2000);
        driver.findElement(By.cssSelector("span#frmCrear\\:SomCausasActivo_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:SomCausasActivo_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:CNotiSivi_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:CNotiSivi_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:SelEstadoSivi_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:SelEstadoSivi_2")).click();
        esperar(500);
    }
    private void Diagnostico() throws InterruptedException {
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt365")).click();
        esperar(1500);
        driver.findElement(By.cssSelector("input#frmDiagnosticoBusqueda\\3AtablaRegistrosDiagnoticos\\3Aj_idt1086")).sendKeys("V954");
        esperar(1000);
        driver.findElement(By.cssSelector("button#frmDiagnosticoBusqueda\\:j_idt1077")).click();
        esperar(500);
        driver.findElement(By.id("frmDiagnosticoBusqueda:tablaRegistrosDiagnoticos_data")).click();
        esperar(500);
    }
    private void BOTONGUARDAR() throws InterruptedException {
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt387")).click();
    }
    //driver.findElement(By.cssSelector("")).click();
}

