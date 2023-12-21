import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lyfngo {
    WebDriver driver;
    String emailid = "imvk14@gmail.com";
    String password = "Test@123";
    String name = "Vinesh";

    Long mobilenumber = 9942777792l;

    @BeforeTest
    public void bf() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 0,enabled = true)
    public void Login() throws InterruptedException {

        // Navigating to LYFnGO SIT
        driver.get("https://flash.sit.rigelsoft.com/");

        // Maximizing the Window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Entering the email id
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div/div/div[1]/div[1]/div[1]/div[3]/form/div[1]/div/input")).sendKeys(emailid);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Entering the Password
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div/div/div[1]/div[1]/div[1]/div[3]/form/div[2]/div/input")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Clicking Submit Button
        driver.findElement(By.xpath(" //*[@id=\"fuse-main\"]/div/div/div[1]/div[1]/div[1]/div[3]/form/button")).click();
        Thread.sleep(10000);


    }

    @Test (priority = 1,enabled = false)
    public void AddPatient() throws InterruptedException {

        //Clicking Add Patient icon
        driver.findElement(By.xpath("//*[@data-testid='PersonAddAlt1Icon']")).click();
        Thread.sleep(2000);

        //Entering Patient Name
        driver.findElement(By.xpath("//*[@id=\"Patientname\"]")).sendKeys(name);
        Thread.sleep(2000);

        //Selecting Patient Gender
        driver.findElement(By.xpath("//*[@name='male']")).click();
        //*[@name='male']
        //*[@name='female']
        //*[@name='others']
        Thread.sleep(2000);

        //Clicking Mobile Number
        driver.findElement(By.xpath("//*[@id='mobileNumber']")).click();
        Thread.sleep(2000);

        //Entering Mobile number
        driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys("9942777792");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Clicking Save Button
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test (priority = 2,enabled = false)
    public void Selectingpatient() throws InterruptedException {

        //Slecting Patient
        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/nav[5]/a/div[1]/span")).click();
        Thread.sleep(5000);

        //Clicking the Search field
        driver.findElement(By.xpath("//*[@id='searchOptions']")).click();
        Thread.sleep(2000);

        //Entering the Customer Name
        driver.findElement(By.xpath("//*[@id='searchOptions']")).sendKeys("rambo");
        Thread.sleep(2000);

        //Selecting the Patient
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div[2]/div[1]/div/div/div/div/div/div/div[2]/p")).click();
        Thread.sleep(2000);

        //Selecting Appointment
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div/div/div[1]/div/ul[2]/div/div[2]/span")).click();
        Thread.sleep(2000);

        //Clilcking Add Appointment Button
        driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/p/div[1]/div[1]/div[2]/div/button")).click();
        Thread.sleep(3000);

        //Confirming Add Appointment
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

        //Add Bill
        driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/p/div[1]/div[2]/div/div[3]/div[2]/button[3]")).click();
        Thread.sleep(5000);

        //Clicking Procedure
        driver.findElement(By.xpath("//*[@id=\"Treatment\"]")).click();
        Thread.sleep(5000);


    }

    @Test (priority = 3,enabled = false)
    public void AddBill() throws InterruptedException {

        //Add Bill
        driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/p/div[1]/div[2]/div/div[3]/div[2]/button[3]")).click();
        Thread.sleep(5000);

        //Clicking Procedure
        driver.findElement(By.xpath("//*[@id=\"Treatment\"]")).click();
        Thread.sleep(5000);
    }


    @Test (priority = 4,enabled = false)
    public void AddAppointment() throws InterruptedException {

        //Add Appointment
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div/div/div[1]/div/ul[2]/div/div[2]/span")).click();
        Thread.sleep(5000);

        //Confirming Add Appointment
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

    }


    @Test (priority = 5,enabled = false)
    public void AddMembership() throws InterruptedException {

        //Add Membership
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div/div/div[1]/div/ul[2]/div/div[2]/span")).click();
        Thread.sleep(5000);

        //Confirming Add Appointment
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

    }


    @Test (priority = 6,enabled = false)
    public void EditPatient() throws InterruptedException {

       //Click Patient
        driver.findElement(By.xpath("//*[@data-testid='EditNoteIcon']")).click();
        Thread.sleep(5000);

        //Adding Email Address
        driver.findElement(By.xpath("//*[@id='EmailID']")).sendKeys("vinesh@putsbox.com");
        Thread.sleep(2000);

        //Click Save
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);

    }

    @Test (priority = 7,enabled = false)
    public void DeletePatient() throws InterruptedException {

        //Selecting Delete Patient
        driver.findElement(By.xpath("//*[@id='fuse-main']/div[2]/div/div[2]/div/div/div[1]/div/ul[18]/div/div[2]/span")).click();
        Thread.sleep(5000);

        //Selecting Delete Patient
        driver.findElement(By.xpath("//*[@id='simple-tabpanel-17']/div/p/div/button")).click();
        Thread.sleep(2000);

        //Confirm Delete
        driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/button[2]/div")).click();
        Thread.sleep(2000);

    }

    @Test (priority = 8,enabled = false)
    public void Dashboards() throws InterruptedException {


        //Total sales
        //Appointments
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/button[2]")).click();
        Thread.sleep(5000);

        // Other sales
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/button[3]")).click();
        Thread.sleep(5000);

        //Appointments
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/button[1]")).click();
        Thread.sleep(5000);

    }



    @Test (priority = 9,enabled = false)
    public void Quicksale() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/nav[2]/a/div[1]/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='search-patients']")).sendKeys("Vinesh");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Create object of the Select class
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div/div[3]/button[1]")));

// Select the option by index
        se.selectByIndex(1);

        System.out.println(se);

    }

    @Test (priority = 10,enabled = false)
    public void Leads() throws InterruptedException {

        // Creating Lead
        //Selecting Leads
        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/nav[9]/a/div[1]/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Add Lead
        driver.findElement(By.xpath("//*[@id=\"additembtn\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Entering Lead name
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Entering Lead number
        driver.findElement(By.xpath("//*[@id=\"mobilenumber\"]")).sendKeys("9942777792");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Clicking Save Button
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div[1]/div/div[2]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Updating Lead
        // Select Leads
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[2]/p")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Cliking Edit Button
        driver.findElement(By.xpath("//*[@data-testid=\'EditNoteIcon\']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Editing User Name
        //Selecting the user
        driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Clearing the Name Field
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Entering the User Name
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Vineshkumar");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        // Clicking Update Button
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div[1]/div/div[2]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Delete Leads
        // Select Leads
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[2]/p")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Delete Leads
        driver.findElement(By.xpath("//*[@id=\"fuse-main\"]/div[2]/div/div[2]/div/div/div[1]/div/ul[4]/div/div[2]/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Confirming Delete Leads
        driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-3\"]/div/p/div/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Clicking Yes Button
        driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/button[2]/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test(priority = 10,enabled = false)
    public void Logout() throws InterruptedException {

        Thread.sleep(5000);
        // Clicking Owner
        driver.findElement(By.xpath(" //*[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault md:mx-4 w-45 h-45 css-1gicyv2']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Clicking Logout
        driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1eahxfw'])[22]")).click();
        Thread.sleep(2000);

        // Confirming Logout
        driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/button[2]/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

//     @AfterTest
//        public void close()
//        {
//            driver.close();
//        }

}
