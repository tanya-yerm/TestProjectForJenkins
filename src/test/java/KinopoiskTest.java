import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class KinopoiskTest {
    @Test
    public void findMovie() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\TeachMeSkills\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.kinopoisk.ru/");
        driver.findElement(By.name("kp_query")).click();
        driver.findElement(By.name("kp_query")).sendKeys("Furious 10");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/header/div/div/div[2]/div/div[2]/div/form/div/div/button")).click();
        driver.findElement(By.partialLinkText("F9")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div/button")).click();
    }
}
