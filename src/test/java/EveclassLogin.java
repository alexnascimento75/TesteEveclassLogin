package webTest;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class EveclassLogin {
    // Atributos
    WebDriver driver;
    // Antes do Teste
    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));

    }
    // Depois do Teste
    @AfterEach
    public void tearDown(){
        //driver.quit();
    }
    // Testes
    @Test
    public void testeLogin(){
        driver.get("https://testando.eveclass.com");
        driver.findElement(By.id("support-action")).click();
    }
}
