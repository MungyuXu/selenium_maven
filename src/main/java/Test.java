import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {
        System.setProperty("a","C:\\selenium\\chrome85\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.baidu.com");
    }
}
