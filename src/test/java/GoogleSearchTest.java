import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.SocketTimeoutException;
import java.util.WeakHashMap;

public class GoogleSearchTest {

    @Test
    public void testSearchAndVerifyResults() {
        String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\temal\\OneDrive\\Рабочий стол\\QA\\webdriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String fullXath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
            String xPath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
            String selector = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";

            driver.get("https://www.google.com/");

        }
    }


    @Test
    public void testOSVersion() {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }
}
