
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
* Test cases to verify functionality of ITExps web application
* 
* @author Scott/Hashim
*/

public class ProjectworkTest {
    
    private WebDriver driver;
    
    /**
     *
     */
    public ProjectworkTest() {
    }

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     */
    @BeforeMethod
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\thest\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        //chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     *
     * @throws Exception
     */
    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }    
  
    /**
     *
     * @throws Exception
     */
    @Test (priority=0)
    public void testItexpsNavigation() throws Exception {
        FileUtil fileutil = new FileUtil();
        
        driver.get("https://www.itexps.net/");
        // The following will traverse the ITEXPS Page Tabs and Login
        driver.findElement(By.id("DrpDwnMn00label")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("DrpDwnMn01label")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("DrpDwnMn02label")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("DrpDwnMn03label")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn04label\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn05label\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn06label\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn00label\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
        driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).click();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys(fileutil.login.getUsername());
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys(fileutil.login.getPassword());
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"iew9cwvzactionTitle\"]")).click();
    }

    /**
     *
     * @throws Exception
     */
    @Test (priority=1)
    public void testLogin() throws Exception {
        FileUtil fileutil = new FileUtil();
        
        driver.get("https://www.itexps.net/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"iew9cwvzactionTitle\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"signUpDialogswitchDialogLink\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).click();      
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys(fileutil.login.getUsername());
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys(fileutil.login.getPassword());
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("DrpDwnMn05label")).click();
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
    }
    
    /**
     *
     * @throws Exception
     */
    @Test (priority=2)
    public void testLoginFail() throws Exception {
        FileUtil fileutil = new FileUtil();
        
        driver.get("https://www.itexps.net/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"iew9cwvzactionTitle\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"signUpDialogswitchDialogLink\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).click();      
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).clear();
        //driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys("example123@hotmail.com");
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys(fileutil.login.getUsername());      
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys(fileutil.login.getInvPassword());
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[@id='memberLoginDialogpasswordInputerrorMessage']"));
        driver.findElement(By.xpath("//div[@id='memberLoginDialogpasswordInput']/p"));
        driver.findElement(By.xpath("//p[contains(.,'Wrong email or password')]")); 
        Thread.sleep(5000);
        driver.findElement(By.id("memberLoginDialogxButton")).click();
    }
           
    /**
     *
     * @throws Exception
     */
    @Test (priority=3)
    public void testSignupExists() throws Exception {
        FileUtil fileutil = new FileUtil();
        
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("itexps");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        Thread.sleep(4000);     // Using sleep() to allow Page to download and sync-up before continuing.
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
        Thread.sleep(5000);
        //driver.findElement(By.id("signUpDialogemailInputinput")).click();
        driver.findElement(By.xpath("//*[@id=\"signUpDialogemailInputinput\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogemailInputinput")).clear();
        //driver.findElement(By.xpath("//*[@id=\"signUpDialogemailInputinput\"]")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogemailInputinput")).sendKeys(fileutil.login.getUsername());
        driver.findElement(By.id("signUpDialogpasswordInputinput")).click();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).clear();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).sendKeys(fileutil.login.getPassword());
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//*[@id=\"signUpDialogerrMsg\"]"));
        driver.findElement(By.id("signUpDialogokButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[@id='signUpDialogerrMsg']"));
        driver.findElement(By.xpath("//div[@id='signUpDialogcontent']/p"));
        driver.findElement(By.xpath("//div[2]/div[2]/div/div/p"));
        driver.findElement(By.xpath("//p[contains(.,'An account with this email already exists.')]"));
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys(fileutil.login.getUsername());
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys(fileutil.login.getPassword());
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(5000);
       
    }
    
    /**
     *
     * @throws Exception
     */
    @Test (priority=4)
    public void testSignupNew() throws Exception {
        FileUtil fileutil = new FileUtil();
        
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("itexps");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        Thread.sleep(5000);     // Using sleep() to allow Page to download and sync-up before continuing.
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("signUpDialogemailInputinput")).click();
        driver.findElement(By.xpath("//*[@id=\"signUpDialogemailInputinput\"]")).clear();
        Thread.sleep(2000);
        //driver.findElement(By.id("signUpDialogemailInputinput")).sendKeys("helloworldz@hotmail.com");
        driver.findElement(By.id("signUpDialogemailInputinput")).sendKeys(fileutil.signup.getNewusername());

        driver.findElement(By.id("signUpDialogpasswordInputinput")).click();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).clear();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).sendKeys(fileutil.signup.getNewpassword());    
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogokButton")).click();
        Thread.sleep(4000);

    }
  
    /**
     *
     * @throws Exception
     */
    @Test (priority=5)
    public void testAppoint2() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("itexps");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        driver.findElement(By.id("DrpDwnMn06label")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Give us your feedback")).click();
        Thread.sleep(5000);
    }
   
    //@Test (priority=6)

    /**
     * Verify end to end Appointment booking (work in progress) 
     * 
     * @throws Exception
     */
    public void testAppointment() throws Exception {
        driver.get("https://www.itexps.net/");
        
        driver.findElement(By.id("DrpDwnMn06label")).click();
        driver.findElement(By.xpath("//p[@id='DrpDwnMn06label']"));
        driver.findElement(By.xpath("//div[@id='DrpDwnMn06bg']/p"));
        driver.findElement(By.xpath("//li[7]/a/div/div/div/p"));
        driver.findElement(By.xpath("//p[contains(.,'APPOINTMENT')]"));
        
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"7da72496-1c7e-4256-a4a7-fedf355bfd93\"]/div[1]/bks-offering-tile/boost-service-tile/ng-include/div/div[2]/button"));
        driver.findElement(By.xpath("//button[contains(.,'Book It')]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[4]/div/table/tbody/tr/td[7]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/main/div/bks-app/div/div[1]/boost-calendar-page/div[2]/div/div/div/ul/boost-time-slots-list[1]/li/div[4]/span")).click();
        driver.findElement(By.xpath("//div[@id='mCSB_2_container']/boost-staff-picker/div/div[2]/div[2]/div")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//boost-next-step-label/span"));
        driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();

        // fill in the appointment details
        Thread.sleep(4000);
        driver.findElement(By.id("47d42cc2-4865-4473-b52a-8fd463c1f77d")).click();
        driver.findElement(By.id("47d42cc2-4865-4473-b52a-8fd463c1f77d")).clear();
        driver.findElement(By.id("47d42cc2-4865-4473-b52a-8fd463c1f77d")).sendKeys("Hashim Rasheed");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::div[2]")).click();
        driver.findElement(By.id("08e7e849-9500-4c60-b161-99a8218168d3")).click();
        driver.findElement(By.id("08e7e849-9500-4c60-b161-99a8218168d3")).clear();
        driver.findElement(By.id("08e7e849-9500-4c60-b161-99a8218168d3")).sendKeys("hashim.k.rasheed@gmail.com");
        driver.findElement(By.id("84c9a365-e43c-458f-8380-1c0ba2df64a6")).clear();
        driver.findElement(By.id("84c9a365-e43c-458f-8380-1c0ba2df64a6")).sendKeys("18474813322");
        driver.findElement(By.id("84c9a365-e43c-458f-8380-1c0ba2df64a6")).clear();
        driver.findElement(By.id("84c9a365-e43c-458f-8380-1c0ba2df64a6")).sendKeys("8474819844");
        driver.findElement(By.id("d226d4f9-a3fa-4ad5-b0b2-03abd275e32a")).click();
        driver.findElement(By.id("d226d4f9-a3fa-4ad5-b0b2-03abd275e32a")).clear();
        driver.findElement(By.id("d226d4f9-a3fa-4ad5-b0b2-03abd275e32a")).sendKeys("This is a test for the selenium project - Pls ignore");
        
        //driver.findElement(By.xpath("/html/body/main/div/bks-app/div/div[1]/bks-contact-info-page/section/div[2]/boost-visitor-sidebar/section/div[1]/div[1]/button/boost-next-step-label/span")).click();
                
        driver.switchTo().defaultContent();
        Thread.sleep(10000);
        
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
