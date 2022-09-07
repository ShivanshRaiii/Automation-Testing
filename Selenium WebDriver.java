//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAutomation {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Browser Driver\\chromedriver_win32\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        // driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
        driver.get("http://resumegenerator.rf.gd/ResumeGenerator.html");

        Thread.sleep(3000);
        driver.findElement(By.id("nameField")).sendKeys("Shivansh Rai");
        Thread.sleep(2000);
        driver.findElement(By.id("contactField")).sendKeys("2222020446");
        Thread.sleep(2000);
        driver.findElement(By.id("addressField")).sendKeys("Flat-606, Pipewala Bld, 4 Pastha Lane, Near Uco Bank, Cuffe Parade, Mumbai, Maharashtra, 400005");
        Thread.sleep(2000);
        
        // Photo Selection
        // Opens the windows file upload
        // WebElement element4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/input"));
        // JavascriptExecutor executor4 = (JavascriptExecutor)driver;
        // executor4.executeScript("arguments[0].click();", element4);
        
        // Directly given photo location
        WebElement chooseFile = driver.findElement(By.id("imgField"));
        chooseFile.sendKeys("F:\\Software Testing\\Main Profile Picture.jpg");
        Thread.sleep(2000);
        
        // For links
        driver.findElement(By.id("fbField")).sendKeys("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("instaField")).sendKeys("https://twitter.com/explore");
        Thread.sleep(2000);
        driver.findElement(By.id("LinkedInField")).sendKeys("https://in.linkedin.com/");
        Thread.sleep(2000);
        
        // Objectives
        driver.findElement(By.id("objectiveField")).sendKeys("Looking for a challenging role in a reputed company "
                + "to utilize my engineering skills that can contribute to the company's growth as well as enhance "
                + "my knowledge by exploring new things.");
        Thread.sleep(2000);
        
        // Work Experience 
        driver.findElement(By.xpath("//*[@id=\"we\"]/textarea")).sendKeys("Manages project budgets and outside labor "
                + "costs, providing accurate forecasts based on current workload and projected future spend in "
                + "bi-weekly updates");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"weAddButton\"]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"we\"]/textarea[2]")).sendKeys("Establishing work methods that improve "
                + "efficiencies Assisting all customers with placing print orders online and providing guidance "
                + "about best practices when placing print orders");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"weAddButton\"]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"we\"]/textarea[3]")).sendKeys("Manage all in-house, temporary and "
                + "freelance copywriting and editing associates including but not limited to hiring, scheduling, "
                + "training and reviews");
        Thread.sleep(2000);
        
        // Academic Qualification
        driver.findElement(By.xpath("//*[@id=\"aq\"]/textarea")).sendKeys("12th from Govt. Sen. School - B.S.E. Board, Haryana - 2003");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"aq\"]/textarea[2]")).sendKeys("10th from V.S High School in 2001 - B.S.E. Board Haryana - 2003");
        Thread.sleep(2000);
        
        // Generate CV Button
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/button"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", element1);
        Thread.sleep(3000);
        
        // Print CV Button
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/button"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();", element2);
        
        // Cancel Button
        // WebElement element3 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]"));
        // JavascriptExecutor executor3 = (JavascriptExecutor)driver;
        // executor3.executeScript("arguments[0].click();", element3);
        
        // Reload the page
        driver.navigate().refresh();
        Thread.sleep(1000);
        
        driver.close();
    }
}
