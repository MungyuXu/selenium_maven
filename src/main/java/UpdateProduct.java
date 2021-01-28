import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author: 徐梦雨
 * @date: 2021/1/28 17:49
 * @description:跳过登录对线路的基本信息、库存进行修改并提交
 */
public class UpdateProduct {
    public static void main(String[] args) {
        System.setProperty("a","C:\\selenium\\chrome85\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        浏览器全屏以定位元素
        driver.manage().window().maximize();
        driver.manage().addCookie();
        driver.get("http://ms.hcgtravels.com/product/ProductSegMents/Index?id=1207244#tab=0");
    }
}
