package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity7_2 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("user1");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("pwd1");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]")).sendKeys("pwd1");
        driver.findElement(By.xpath("//input[starts-with(@class,'email-')]")).sendKeys("aaa@lms.com");
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        driver.close();

    }
}