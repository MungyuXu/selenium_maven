import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
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

        WebElement cp=driver.findElement(By.xpath("//*[@id=\"page-header\"]/div[1]/a[2]"));
       if (cp.isEnabled()){
           cp.click();
           System.out.println("点击了产品模块");
       }

//       列表新建线路
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/span[2]/a")).click();
        Thread.sleep(3000);
        if (driver.findElement(By.xpath("/html/body/div[11]/div[1]/section/div/p[1]/span[1]/input")).isEnabled()){
            driver.findElement(By.xpath("/html/body/div[11]/div[1]/section/div/p[1]/span[1]/input")).sendKeys("xmy测试");
            driver.findElement(By.xpath("/html/body/div[11]/div[1]/section/div/p[3]/span[1]/input")).sendKeys("shanghai");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[11]/div[3]/div/a")).click();
            driver.findElement(By.xpath("/html/body/div[11]/div[1]/section/div/p[3]/span[2]/input")).sendKeys("shanghai");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[11]/div[4]/div/a")).click();
            driver.findElement(By.xpath("/html/body/div[11]/div[1]/section/div/p[4]/span[2]/input[1]")).sendKeys("3");
            driver.findElement(By.xpath("/html/body/div[11]/div[1]/section/div/p[4]/span[2]/input[2]")).sendKeys("2");
            driver.findElement(By.xpath("/html/body/div[11]/div[1]/div/a[1]")).click();



        }
            }
}
