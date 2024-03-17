package org.example.stepDefintions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginSteps {
    WebDriver driver=null;

    String URL = "https://www.saucedemo.com/";
    @Given("user and password is entered")
    public void user_and_password_is_entered() {
        System.getProperty("webdriver.chrome.driver.","C:/Users/MuhammadFarhanBashir/IdeaProjects/testProject/src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();



        System.out.println("Inside Step - user cred is entered");

    }

    @When("Login button is clicked")
    public void login_button_is_clicked() {
        System.out.println("inside step - user clicks login btn");

    }

    @Then("page is redirected to Home screen")
    public void page_is_redirected_to_home_screen() {
        System.out.println("inside step - page redirected");

    }
}
