package org.beta.pratiksha.allseleniumconcepts.codingpractice.javacoding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationTesterAssignment {
    @Test
    public void verifyTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://fitpeo.com/revenue-calculator");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
        ////span[@class='MuiSlider-rail css-3ndvyc']//span[@class='MuiSlider-rail css-3ndvyc']
        Thread.sleep(2000); // Wait for the page to load

        // Locate the slider element using the correct XPath
        WebElement slider = driver.findElement(By.xpath("//input[contains(@class ,'MuiInputBase-input MuiOutlinedInput-input')]"));
        slider.sendKeys("820");
//        // Scroll the slider into view
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", slider);
//
//        Thread.sleep(2000);
//        /// Calculate the xOffset to move the slider to 820
//        // Calculate the xOffset to move the slider to 820
//        WebElement sliderHandle = driver.findElement(By.xpath("//span[contains(@class, 'MuiSlider-thumb')]"));
//        int sliderWidth = slider.getSize().getWidth();
//        int maxSliderValue = 2000; // Maximum value of the slider
//        int sliderValue = 820; // Target value
//
//        // Adjust offset calculation
//        double valueRatio = sliderValue / (double) maxSliderValue;
//        int xOffset = (int) (valueRatio * sliderWidth);
//
//        // Perform the drag-and-drop action using Actions class
//        Actions move = new Actions(driver);
//        move.clickAndHold(sliderHandle)
//                .moveByOffset(xOffset - sliderHandle.getSize().getWidth() / 2, 0) // Adjust offset if needed
//                .release()
//                .perform();
//
//        // Verify the text field value
//        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
//        String fieldValue = inputField.getAttribute("value");
//        if (fieldValue.equals("820")) {
//            System.out.println("Slider successfully set to 820.");
//        } else {
//            System.out.println("Failed to set the slider to 820. Current value: " + fieldValue);
//        }

//        // Update the text field and trigger the change event
//        inputField.clear();
//        inputField.sendKeys("560");

        // Trigger the change event using JavaScript
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", inputField);

        // Add a short wait to ensure the slider has time to update
        Thread.sleep(2000);

        // Verify that the slider has updated
//        fieldValue = inputField.getAttribute("value");
//        if (fieldValue.equals("560")) {
//            System.out.println("Text field successfully set to 560 and slider updated.");
//        } else {
//            System.out.println("Failed to set the text field to 560. Current value: " + fieldValue);
//        }

        // Locate the checkbox using its ID and click it
//                checkbox = driver.find_element(By.ID, "checkbox_id")
//        checkbox.click()

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='57']"));
        checkbox.click();

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='19.19']"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='63']"));
        checkbox2.click();

        WebElement checkbox3 = driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='15']"));
        checkbox3.click();


        // Validate Total Recurring Reimbursement
        // Locate the element displaying Total Recurring Reimbursement
        WebElement totalRecurringElement = driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']"));
        System.out.println(totalRecurringElement.getText());
        String actualTitle = totalRecurringElement.getText();
        System.out.println("actualValue: " +actualTitle);
        String expectedTitle = "Total Recurring Reimbursement for all Patients Per Month:$127305";
        System.out.println("expectedvalue: " +expectedTitle);
Thread.sleep(10000);
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Actual and expected values are matching");
        }else{
            System.out.println("Actual and expected values are not matching ");
        }

      //  Assert.assertEquals(actualTitle, expectedTitle);

//        // Extract the text and convert it to a number
//        String totalRecurringText = totalRecurringElement.getText();
//        double totalRecurringValue = Double.parseDouble(totalRecurringText);
//
//        // Define the expected value
//        double expectedTotalRecurringValue = 123.19; // Replace this with the actual expected value
//
//        // Compare the extracted value to the expected value
//        if (totalRecurringValue == expectedTotalRecurringValue) {
//            System.out.println("Total Recurring Reimbursement is correct: " + totalRecurringValue);
//        } else {
//            System.out.println("Total Recurring Reimbursement is incorrect. Expected: " + expectedTotalRecurringValue + ", Actual: " + totalRecurringValue);
//        }








    }


}
