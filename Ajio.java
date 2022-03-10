package assignment.week3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@for='Men']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
Thread.sleep(2000);
String total = driver.findElement(By.className("length")).getText();
System.out.println(total);
System.out.println("List of the Brands:");
List<WebElement> bagBrandList= driver.findElements(By.className("brand"));
System.out.println("Size:" + bagBrandList.size());
for(WebElement webelement: bagBrandList) {
	String text=webelement.getText();
	System.out.println(text);
}
System.out.println("List of the Names of the Bag");
List<WebElement> bagNameList= driver.findElements(By.className("nameCls"));
System.out.println("Size:" + bagNameList.size());
for(WebElement webelement1: bagNameList) {
	String text1=webelement1.getText();
	System.out.println(text1);
}

	}

}
