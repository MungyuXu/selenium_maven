import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import sun.awt.SunHints;

import javax.swing.*;
import java.awt.*;
import java.security.Key;

/**
 * @author: 徐梦雨
 * @date: 2021/1/28 17:49
 * @description:跳过登录对线路的基本信息、库存进行修改并提交,
 * 设置cookie前需要访问一次网页，设置cookie后再访问一次网页以解决invalid cookie domain
 */
public class UpdateProduct {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("a","C:\\selenium\\chrome85\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        浏览器全屏以定位元素
        driver.manage().window().maximize();
//        设置cookie
        String name="ValidateCode";
        String value="ppyD4BNsbeY=";
        String domain=".hcgtravels.com";
        String name2="yhUser";
        String value2="jNX/wLHZGPE=";
        String name3="userName";
        String value3="xumengyu";
        Cookie cookie=new Cookie(name,value);
        Cookie cookie1=new Cookie(name2,value2);
        Cookie cookie2=new Cookie(name3,value3);
        driver.get("http://ms.hcgtravels.com/product/ProductSegMents/Index?id=1207249#tab=0");
        driver.manage().addCookie(cookie);
        driver.manage().addCookie(cookie1);
        driver.manage().addCookie(cookie2);
        System.out.println("cookie数量为"+driver.manage().getCookies().size());
        driver.get("http://ms.hcgtravels.com/product/ProductSegMents/Index?id=1207244#tab=0");
//        线路基本信息填写提交,亮点推荐
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[1]/div[2]/p[5]/textarea")).sendKeys("这是亮点推荐");
//       选择目的地
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[1]/div[2]/p[9]/span[1]/select")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[1]/div[2]/p[9]/span[1]/select/option[1]")).click();
//        滚动到指定元素
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[3]/span/input")));
//        选择浏览城市
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[3]/span/input")).sendKeys("上海海");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[3]/span/input")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("/html/body/div[16]/div/a")).click();
//        选择餐食
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[9]/select[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[9]/select[1]/option[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[9]/select[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[9]/select[2]/option[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[9]/select[3]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[2]/p[9]/select[3]/option[1]")).click();
//        滚动
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[4]/div[2]/p[3]/span/select")));
//        账务归属
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[4]/div[2]/p[3]/span/select")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[4]/div[2]/p[3]/span/select/option[2]")).click();
        Thread.sleep(2000);
//        选择完财务归属后，在操作输入框点击一下，使财务归属不提示空
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[4]/div[2]/p[1]/span[3]/input")).click();
//        先保存，等页面刷新后，再提交
        System.out.println("选完了账务归属，点击了操作输入框");
        Thread.sleep(1000);
//        滚动到保存按钮并点击
//        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[2]/a[1]")));
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[2]/a[1]")).click();
        System.out.println("点击了保存按钮");
//        加载完成后滚动到提交按钮并点击
        Thread.sleep(6000);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[4]/div[2]/p[3]/span/select/option[2]")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/div[4]/div[2]/p[3]/span/select/option[2]")).click();
        System.out.println("点击了提交按钮");

    }
}
