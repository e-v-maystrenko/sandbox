package LaunchBrowsers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {
    WebDriver driver;
    //ChromeDriverManager.chromedriver().setup;
    
    @Before
    public void start (){
        driver = new ChromeDriver();

    }
    @After
    public void stop (){
        driver.quit();

    }

    @Test
    public void firstRun (){
    driver.get("https://www.ukr.net/ua");
    }
}
