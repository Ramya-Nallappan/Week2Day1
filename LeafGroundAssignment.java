//LeafGround Assignment
package Week2Day1;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		System.out.println("1. Select Training Program using index: ");
		WebElement elementDropDown = driver.findElement(By.id("dropdown1"));
        Select dd =new Select(elementDropDown);
        dd.selectByIndex(3);
        //Print the value of selected dropdown using getFirstSelectedOption() & getText()
       /* WebElement option = dd.getFirstSelectedOption();
        String defaultItem = option. getText();
        System. out. println(defaultItem );
        */
        System. out. println(dd.getFirstSelectedOption().getText());
        
        System.out.println("2. Select Training Program using text: ");
        WebElement elementDropDown2 = driver.findElement(By.name("dropdown2"));
        Select dd2 =new Select(elementDropDown2);
        dd2.selectByVisibleText("Selenium");
        System. out. println(dd2.getFirstSelectedOption().getText());
        
        System.out.println("3. Select Training Program using value: ");
            
        WebElement elementDropDown3 = driver.findElement(By.id("dropdown3"));
        Select dd3 =new Select(elementDropDown3);
        dd3.selectByValue("4");
        System. out. println(dd3.getFirstSelectedOption().getText());
        
        System.out.println("4. Get the number of dropdown options: ");
        WebElement elementDropDown4 = driver.findElement(By.className("dropdown"));
        Select dd4 =new Select(elementDropDown4);
     List<WebElement> options = dd4.getOptions();
        int size = options.size();
        System.out.println(size);
        
        for(int i =0; i<size ; i++)
        {
          String webElement = options.get(i).getText();
           System.out.println(webElement);
        }
        
        System.out.println("5. Send Keys to Select: ");
        driver.findElement(By.xpath("(//div[@class ='example'])[5]/select")).sendKeys("Appium");
       
        
        System.out.println("6. Retrieve the Selected option");
        
        WebElement elementDropDown6 = driver.findElement(By.xpath("(//div[@class ='example'])[6]/select"));
        Select dd6 = new Select(elementDropDown6);
        // WebElement elementSelecteOption = dd6.getFirstSelectedOption();
        //System.out.println(elementSelecteOption.getText());
        System.out.println(dd6.getFirstSelectedOption().getText());
        }
	}
	



