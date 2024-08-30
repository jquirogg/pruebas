package Autorizaciones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anexo3 {

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
    public void testCrearAnexo3() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1250, 900));
        driver.get("http://10.250.2.35:8080/savia/login.faces");
        esperar(1200);
        driver.findElement(By.cssSelector("input#login\\:usuario")).sendKeys("jquirogg");
        driver.findElement(By.cssSelector("input#login\\:contrasena")).sendKeys("e0EwIqMH");
        driver.findElement(By.cssSelector("button[name='login:j_idt23']")).click();
        esperar(1200);

        driver.get("http://10.250.2.35:8080/savia/autorizacion/solicitudes.faces");
        esperar(1200);
        driver.findElement(By.cssSelector("button#frmBar\\:j_idt55")).click();
        esperar(1500);

        seleccionarAfiliado();
        esperar(700);

        TipoSolicitud();
        esperar(700);

        Solicitud();
        esperar(700);

        IPSSolicita();
        esperar(700);

        InfoProfesional();
        esperar(700);

        InfoAtencion();
        esperar(700);

        Diagnostico();
        esperar(700);

        SelProcedimiento();
        esperar(800);

        //SelMedicamento();
        //esperar(800);

        //SelInsumo();
        //esperar(800);

        //SelPaquete();
        //esperar(700);

        JustiClinica();
        esperar(700);

        BOTONGUARDAR();
        esperar(800);

    }

    private void seleccionarAfiliado() throws InterruptedException {
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt139")).click();
        esperar(1500);
        driver.findElement(By.cssSelector("input#frmAfiliadoLista\\3AtablaRegistrosAfiliados\\3Aj_idt1073")).sendKeys("8020905");
        esperar(1000);
        driver.findElement(By.cssSelector("button#frmAfiliadoLista\\:j_idt1065")).click();
        esperar(500);
        driver.findElement(By.id("frmAfiliadoLista:tablaRegistrosAfiliados_data")).click();
        esperar(500);
    }

    private void TipoSolicitud() throws InterruptedException {
        driver.findElement(By.cssSelector("span#frmCrear\\:ambitoCrear_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:ambitoCrear_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt203")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("input#frmServiciosHabilitacionBusqueda\\3AtablaRegistrosServiciosHabilitacion\\3Aj_idt2484")).sendKeys("417");
        esperar(1000);
        driver.findElement(By.cssSelector("button#frmServiciosHabilitacionBusqueda\\:j_idt2481")).click();
        esperar(500);
        driver.findElement(By.id("frmServiciosHabilitacionBusqueda:tablaRegistrosServiciosHabilitacion_data")).click();
        esperar(500);
    }

    private void Solicitud() throws InterruptedException {
        driver.findElement(By.cssSelector("input#frmCrear\\:fechaOrdenCrear_input")).sendKeys("2024-08-12");
        driver.findElement(By.cssSelector("input#frmCrear\\:fechaOrdenCrear_input")).sendKeys(Keys.TAB);
        esperar(500);
    }

    private void IPSSolicita() throws InterruptedException {
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt215")).click();
        esperar(1500);
        driver.findElement(By.cssSelector("input#frmIpsLista\\:tablaRegistrosIps\\:j_idt1112")).sendKeys("050451319701");
        esperar(1000);
        driver.findElement(By.cssSelector("button#frmIpsLista\\:j_idt1109")).click();
        esperar(600);
        driver.findElement(By.id("frmIpsLista:tablaRegistrosIps_data")).click();
        esperar(500);
    }

    private void InfoProfesional() throws InterruptedException{
        driver.findElement(By.cssSelector("span#frmCrear\\:tipoDocumentoProfCrear_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmCrear\\:tipoDocumentoProfCrear_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmCrear\\:numeroDocumentoProfCrear")).sendKeys("123");
        esperar(1000);
        driver.findElement(By.cssSelector("input#frmCrear\\:numeroDocumentoProfCrear")).sendKeys(Keys.TAB);
        if (driver.findElement(By.cssSelector("button#frmCrear\\:j_idt256")).isEnabled()) {
            driver.findElement(By.cssSelector("button#frmCrear\\:j_idt256")).click();
            driver.findElement(By.cssSelector("input#frmEspecialidadBusqueda\\:tablaRegistrosEspecialidades\\:j_idt2500")).sendKeys("417");
            esperar(1000);
            driver.findElement(By.cssSelector("button#frmEspecialidadBusqueda\\:j_idt2497")).click();
            esperar(500);
            driver.findElement(By.id("frmServiciosHabilitacionBusqueda:tablaRegistrosServiciosHabilitacion_data")).click();
            esperar(500);
        }

    }

    private void InfoAtencion() throws InterruptedException{
        driver.findElement(By.cssSelector("span#frmCrear\\:origenAtenCrear_label")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("li#frmCrear\\:origenAtenCrear_4")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:prioridadAtenCrear_label")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("li#frmCrear\\:prioridadAtenCrear_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:servicioAtenCrear_label")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("li#frmCrear\\:servicioAtenCrear_3")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:ubicacionAtenCrear_label")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("li#frmCrear\\:ubicacionAtenCrear_4")).click();
        esperar(500);
    }

    private void Diagnostico() throws InterruptedException{
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt273")).click();
        esperar(1500);
        driver.findElement(By.cssSelector("input#frmDiagnosticoBusqueda\\3AtablaRegistrosDiagnoticos\\3Aj_idt2401")).sendKeys("V954");
        esperar(1000);
        driver.findElement(By.cssSelector("button#frmDiagnosticoBusqueda\\:j_idt2392")).click();
        esperar(500);
        driver.findElement(By.id("frmDiagnosticoBusqueda:tablaRegistrosDiagnoticos_data")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmCrear\\:tablaDiagnosticosCrear\\:0\\:tipDiagEditarDiangostico_label")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("li#frmCrear\\:tablaDiagnosticosCrear\\:0\\:tipDiagEditarDiangostico_1")).click();
        esperar(500);
    }

    private void SelProcedimiento() throws InterruptedException{
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt301")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmTecnologiaBusqueda\\3AtablaRegistrosTecnologias\\3Aj_idt2471")).sendKeys("048301");
        esperar(500);
        driver.findElement(By.cssSelector("button#frmTecnologiaBusqueda\\:j_idt2462")).click();
        driver.findElement(By.id("frmTecnologiaBusqueda:tablaRegistrosTecnologias_data")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("span#frmGestionarProcedimiento\\:servicioProcedimiento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarProcedimiento\\:servicioProcedimiento_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmGestionarProcedimiento\\:diagnosticoProcedimiento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarProcedimiento\\:diagnosticoProcedimiento_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("textarea#frmGestionarProcedimiento\\3AindicacionesProcedimientoEditar")).sendKeys("PRUEBAS DE RELLENO SISAS");
        esperar(500);
        driver.findElement(By.cssSelector("button#frmGestionarProcedimiento\\:j_idt1168")).click();
    }

    private void SelMedicamento() throws InterruptedException{
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt302")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmMedicamentoBusqueda\\3AtablaRegistrosMedicamentos\\3Aj_idt2420")).sendKeys("20254131-9");
        esperar(500);
        driver.findElement(By.cssSelector("button#frmMedicamentoBusqueda\\:j_idt2411")).click();
        esperar(500);
        driver.findElement(By.id("frmMedicamentoBusqueda:tablaRegistrosMedicamentos_data")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmGestionarMedicamento\\:diagnosticoProcedimiento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarMedicamento\\:diagnosticoProcedimiento_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmGestionarMedicamento\\:causaExternaMedicamento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarMedicamento\\:causaExternaMedicamento_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmGestionarMedicamento\\:finalidadMedicamento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarMedicamento\\:finalidadMedicamento_3")).click();
        esperar(500);
        driver.findElement(By.cssSelector("span#frmGestionarMedicamento\\:catastroficoMedicamento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarMedicamento\\:catastroficoMedicamento_4")).click();
        esperar(1000);
        driver.findElement(By.cssSelector("input#frmGestionarMedicamento\\:dosisMedicamento_input")).sendKeys("5");
        esperar(500);
        driver.findElement(By.cssSelector("input#frmGestionarMedicamento\\:frecuenciaMedicamento_input")).sendKeys("3");
        esperar(500);
        driver.findElement(By.cssSelector("span#frmGestionarMedicamento\\:viaMedicamento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarMedicamento\\:viaMedicamento_2")).click();
        esperar(500);
        driver.findElement(By.cssSelector("textarea#frmGestionarMedicamento\\:posologiaMedicamentoEditar")).sendKeys("PRUEBAS DE RELLENO SISAS");
        driver.findElement(By.name("frmGestionarMedicamento:fechaFormularMedicamento_input")).sendKeys("2024-08-12");
        esperar(500);
        driver.findElement(By.cssSelector("input#frmGestionarMedicamento\\:fechaFormularMedicamento_input")).sendKeys(Keys.TAB);
    }

    private void SelInsumo() throws InterruptedException{
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt303")).click();
        esperar(2000);
        driver.findElement(By.cssSelector("input#frmInsumoBusqueda\\3AtablaRegistrosInsumos\\3Aj_idt2433")).sendKeys("884170");
        esperar(500);
        driver.findElement(By.cssSelector("button#frmInsumoBusqueda\\:j_idt2430")).click();
        esperar(2100);
        driver.findElement(By.id("frmInsumoBusqueda:tablaRegistrosInsumos_data")).click();
        esperar(2000);
        driver.findElement(By.cssSelector("span#frmGestionarInsumo\\:diagnosticoInsumo_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarInsumo\\:diagnosticoInsumo_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("button#frmGestionarInsumo\\:j_idt1244")).click();
    }

    private void SelPaquete() throws InterruptedException{
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt304")).click();
        esperar(500);
        driver.findElement(By.cssSelector("input#frmPaqueteBusqueda\\3AtablaRegistrosPaquetes\\3Aj_idt2449")).sendKeys("34530B");
        esperar(500);
        driver.findElement(By.cssSelector("button#frmPaqueteBusqueda\\:j_idt2446")).click();
        esperar(500);
        driver.findElement(By.id("frmPaqueteBusqueda:tablaRegistrosPaquetes_data")).click();
        esperar(2000);
        driver.findElement(By.cssSelector("span#frmGestionarPaquete\\:diagnosticoProcedimiento_label")).click();
        esperar(500);
        driver.findElement(By.cssSelector("li#frmGestionarPaquete\\:diagnosticoProcedimiento_1")).click();
        esperar(500);
        driver.findElement(By.cssSelector("button#frmGestionarPaquete\\:j_idt1261")).click();
    }

    private void JustiClinica() throws InterruptedException{
        driver.findElement(By.cssSelector("textarea#frmCrear\\:txtJustificacion")).sendKeys("PRUEBAS DE RELLENO SISAS y AQUI YO PUEDO COLOCAR LO QUE SE ME DE LA GANA E IGUALMENTE TE LO VA A REGISTRAR SI SABE OOME");

    }

    private void BOTONGUARDAR() throws InterruptedException {
        driver.findElement(By.cssSelector("button#frmCrear\\:j_idt366")).click();
    }
    //driver.findElement(By.cssSelector("")).click();
}


