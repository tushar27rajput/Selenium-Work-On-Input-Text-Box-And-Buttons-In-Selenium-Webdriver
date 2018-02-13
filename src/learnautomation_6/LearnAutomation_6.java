/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
          
          WebDriver driver= new FirefoxDriver();
          
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
         // WebElement obj=driver.findElement(By.xpath("//*[@id=\"u_0_n\"]"));
//WebElement obj=(WebElement) driver.findElements(By.xpath("//*[@id=\"u_0_n\"]"));
          //obj.sendKeys("tushar");
          WebElement obj1=driver.findElement(By.xpath("//*[@id=\"u_0_p\"]"));
          obj1.sendKeys("rajput");
          driver.findElement(By.xpath("//*[@id=\"u_0_15\"]")).submit();
         System.out.println("Test Complete");
          driver.quit();
          
          
          
    }
    
}
