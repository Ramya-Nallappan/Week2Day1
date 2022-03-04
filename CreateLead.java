//Assignment 1:CreateLead
package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.out.println("To open Chrome Browser");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("To Load Webpage URL");
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("To maximixe the webpage after loading:");
		driver.manage().window().maximize();
		System.out.println("The title is : " + driver.getTitle());
		
		System.out.println("To find element for Username button:");
		//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		System.out.println("To find element for Password button:");
		//<input class="inputLogin" type="password" id="password" name="PASSWORD" size="50">
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("To find element for Click button");
		//<input class="decorativeSubmit" type="submit" value="Login">
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("To find element for CRMSFA link:");
		//<a style="color: black;" href="/crmsfa/control/main?externalLoginKey=EL788264595750">CRM/SFA</a>
        driver.findElement(By.linkText("CRM/SFA")).click();
         System.out.println("To find element for Leads");
       //<a href="/crmsfa/control/leadsMain" id="ext-gen602">Leads</a>
         driver.findElement(By.linkText("Leads")).click();
         System.out.println("To find element for CreateLead");
         //<a href="/crmsfa/control/createLeadForm;jsessionid=877D3DC361453090AAD232852467C08D.jvm1" id="ext-gen623">Create Lead</a>
         driver.findElement(By.linkText("Create Lead")).click();
         System.out.println("To find element for CompanyName");
        //<input type="text" class="inputBox" name="companyName" size="30" maxlength="100" id="createLeadForm_companyName">
        WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
        elementCompanyName.sendKeys("TestLeaf");
        //<input type="text" class="inputBox" name="firstName" size="30" maxlength="100" id="createLeadForm_firstName">
        WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
        elementFirstName.sendKeys("Ramya");
        //<input type="text" class="inputBox" name="lastName" size="30" maxlength="100" id="createLeadForm_lastName">
        WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
        elementLastName.sendKeys("N");
        //<input type="text" class="inputBox" name="firstNameLocal" size="30" maxlength="100" id="createLeadForm_firstNameLocal">
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("test");
        // <input type="text" class="inputBox" name="departmentName" size="30" maxlength="100" id="createLeadForm_departmentName">
                driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
              //  <textarea class="inputBox" name="description" cols="60" rows="3" id="createLeadForm_description"></textarea>
                driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Testing");
              //  <input type="text" class="inputBox" name="primaryEmail" size="30" maxlength="100" id="createLeadForm_primaryEmail">
                driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramya19.nallappan@gmail.com");
        /*
          //<select class="inputBox" name="generalStateProvinceGeoId" id="createLeadForm_generalStateProvinceGeoId" 
      size="1"><option value="">&nbsp;</option><option value="USA-84057">84057</option><option value="AL">Alabama</option>
      <option value="AK">Alaska</option><option value="AZ">Arizona</option><option value="AR">Arkansas</option><option value="AA">Armed Forces Americas</option><option value="AE">Armed Forces Europe</option><option value="AP">Armed Forces Pacific</option><option value="CA">California</option><option value="CO">Colorado</option><option value="CT">Connecticut</option><option value="DE">Delaware</option><option value="DC">District of Columbia</option><option value="FL">Florida</option><option value="GA">Georgia</option><option value="GU">Guam</option><option value="HI">Hawaii</option><option value="ID">Idaho</option><option value="IL">Illinois</option><option value="IN">Indiana</option><option value="IA">Iowa</option><option value="KS">Kansas</option><option value="KY">Kentucky</option><option value="LA">Louisiana</option><option value="ME">Maine</option><option value="MD">Maryland</option><option value="MA">Massachusetts</option><option value="MI">Michigan</option><option value="MN">Minnesota</option><option value="MS">Mississippi</option><option value="MO">Missouri</option><option value="MT">Montana</option><option value="NE">Nebraska</option><option value="NV">Nevada</option><option value="NH">New Hampshire</option><option value="NJ">New Jersey</option><option value="NM">New Mexico</option><option value="NY">New York</option><option value="NC">North Carolina</option><option value="ND">North Dakota</option><option value="OH">Ohio</option><option value="OK">Oklahoma</option><option value="OR">Oregon</option><option value="PA">Pennsylvania</option><option value="PR">Puerto Rico</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option><option value="SD">South Dakota</option><option value="TN">Tennessee</option><option value="TX">Texas</option><option value="UT">Utah</option><option value="VT">Vermont</option><option value="VI">Virgin Islands</option><option value="VA">Virginia</option><option value="WA">Washington</option><option value="WV">West Virginia</option><option value="WI">Wisconsin</option><option value="WY">Wyoming</option></select>
             */  
                WebElement elementDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
                Select dd =new Select(elementDropDown);
                dd.selectByVisibleText("Arizona");
                WebElement elementSubmit = driver.findElement(By.className("smallSubmit"));
                elementSubmit.click();
               // <div class="x-panel-header sectionHeaderTitle" style="float:left" id="sectionHeaderTitle_leads">View Lead</div>
                driver.getTitle();
                System.out.println(driver.getTitle());
              
	}

}
