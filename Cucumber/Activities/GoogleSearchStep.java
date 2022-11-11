package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchStep {

    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Google Home Page$")
    public void User_Is_On_Google_Home_Page() throws Throwable{
        driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @When("^User types in Cheese and hits ENTER$")
    public void User_types_in_cheese_and_hits_enter() throws Throwable{
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Cheese");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

    }

    @Then("^Show how many search results were shown$")
    public void Show_how_many_Search_results_were_shown() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable{
        driver.quit();
    }
}