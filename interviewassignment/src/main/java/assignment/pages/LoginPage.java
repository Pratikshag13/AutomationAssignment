package assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    public void loginToApplication(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();

        Thread.sleep(2000); // Wait for the page to load

        // Locate the slider element using the correct XPath
        WebElement slider = driver.findElement(By.xpath("//span[contains(@class, 'MuiSlider-root')]"));
        // Scroll the slider into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", slider);

        driver.findElement(By.xpath("//input[contains(@class ,'MuiInputBase-input MuiOutlinedInput-input')]")).sendKeys("820");



        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='57']"));
        checkbox.click();

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='19.19']"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='63']"));
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='15']"));
        checkbox3.click();

        WebElement totalRecurringElement = driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']"));
        System.out.println(totalRecurringElement.getText());
        String actualTitle = totalRecurringElement.getText();
        System.out.println("actualValue: " +actualTitle);
        String expectedTitle = "Total Recurring Reimbursement for all Patients Per Month:$27000";
        System.out.println("expectedvalue: " +expectedTitle);
        Thread.sleep(10000);
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Actual and expected values are matching");
        }else{
            System.out.println("Actual and expected values are not matching ");
        }

        Assert.assertEquals(actualTitle, expectedTitle);


    }
}
