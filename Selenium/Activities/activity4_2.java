package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Fst");
        lastName.sendKeys("user");

        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("fstUser@example.com");

        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9872345678");

        driver.findElement(By.xpath("//textarea")).sendKeys("the text is in green");

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}