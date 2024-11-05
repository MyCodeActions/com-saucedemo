package browsertesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Project-4 - ProjectName: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser
 */

public class EdgeBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";

        // 1. Launch the chrome browswer
        WebDriver driver = new EdgeDriver();

        // 2. open url
        driver.get(baseUrl);

        // 3.Print title of the page
        System.out.println("The title of page is : " + driver.getTitle());

        // 4.Get current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 5.Get page source code
        System.out.println("The page source is below: \n" + driver.getPageSource());

        // 6. Enter the email in the email field.
        driver.findElement(By.id("user-name")).sendKeys("prashant@gmail.com");

        // 7. Enter the password in the password field.
        driver.findElement(By.id("password")).sendKeys("123456");

        // 8. Click on the Login Button.
        driver.findElement(By.id("login-button")).click();

        // 9. Print the current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 10. Navigate to baseUrl
        driver.navigate().to(baseUrl);

        // 11. Refresh the page
        driver.navigate().refresh();

        // 12. Close the browser
        driver.close();
    }
}