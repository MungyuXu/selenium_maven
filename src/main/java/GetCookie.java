import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author: 徐梦雨
 * @date: 2021/1/29 9:15
 * @description:登录获取cookie
 */
public class GetCookie {
    public static void main(String[] args) {
        System.setProperty("a","C:\\selenium\\chrome85\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        浏览器全屏以定位元素
        driver.manage().window().maximize();
        driver.get("http://ms.hcgtravels.com");
//        登录
        User user=new User();
        user.setName("xumengyu");
        user.setPwd("xmy12345678");
        driver.findElement(By.xpath("//*[@id=\"uid\"]")).sendKeys(user.getName());
        driver.findElement(By.id("pwd")).sendKeys(user.getPwd());
        driver.findElement(By.xpath("/html/body/div/div/div[3]/form/input[4]")).click();

        System.out.println(driver.manage().getCookies());
        System.out.println(driver.manage().getCookieNamed("ValidateCode"));
        System.out.println(driver.manage().getCookieNamed("yhUser"));
        System.out.println(driver.manage().getCookieNamed("yhUser").getName());
        System.out.println(driver.manage().getCookieNamed("yhUser").getValue());
        System.out.println(driver.manage().getCookies().size());

    }
}
