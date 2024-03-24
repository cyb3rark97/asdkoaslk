package raf.cyb3rark97;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Calendar;

public class redbus {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wb = new ChromeDriver();
        wb.get("https://www.redbus.in/");

        wb.findElement(By.xpath("//input[@id='src']")).sendKeys("Ben");
        FluentWait<WebDriver> wait = new FluentWait<>(wb);
        wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li//text[text()='Benniganahalli']"))).click();

        wb.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mum");
        FluentWait <WebDriver> wait1 = new FluentWait<>(wb);
        wait1.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li//text[text()='Mumbai']"))).click();


        //Calendar
        wb.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();



        //wb.findElement(By.xpath("//button[@class='sc-dxgOiQ iztAdt']")).click();
        wb.quit();
    }
}
