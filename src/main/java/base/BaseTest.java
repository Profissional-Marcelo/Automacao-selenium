 package base;
import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.BeforeClass;
public class BaseTest {
    public String driverPath;
    private String url;
    public WebDriver driver;

    @BeforeClass
    public void preCond(){
        driverPath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public BaseTest(String url){
        this.url = url;
    }
    public WebDriver getDriver() {
        	return driver;
        }
}
