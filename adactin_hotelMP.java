package com.selenium.com;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adactin_hotelMP {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony-Pc\\eclipse-workspace\\Selenium_testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.click();
		username.sendKeys("peacockl");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	    password.click();
	    password.sendKeys("123456@");
	    WebElement login = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td/input"));
	    login.click();
	    Thread.sleep(3000);
	    WebElement location = driver.findElement(By.xpath("//select[@name='location']//option[7]"));
	    location.click();
	    WebElement Hotel= driver.findElement(By.xpath("//select[@name='hotels']//option[3]"));
	    Hotel.click();
	    WebElement rooms = driver.findElement(By.xpath("//select[@name='room_type']//option[4]"));
	    rooms.click();
	    WebElement persons = driver.findElement(By.xpath("//select[@name='room_nos']//option[4]"));
	    persons.click();
	    WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	    checkin.sendKeys("24/11/2022");
	    checkin.click();
	    WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	    checkout.sendKeys("25/11/2022");
	    checkout.click();
	    WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']//option[3]"));
	    adult.click();
	    WebElement children = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[9]/td[2]/select//option[4]"));	
	    children.click();
	    WebElement search = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input"));
	    search.click();
	    TakesScreenshot adacit = (TakesScreenshot) driver;
	    File des = adacit.getScreenshotAs(OutputType.FILE);
	    File xyz = new File("C:\\Users\\Sony-Pc\\eclipse-workspace\\Selenium_testing\\screenshot\\fn.png");
	    FileUtils.copyFile(des, xyz);
	    WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	    radiobutton.click();
	    WebElement nextpage = driver.findElement(By.xpath("//input[@name='continue']"));
	    nextpage.click();
	    TakesScreenshot screen = (TakesScreenshot)driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File abc = new File("C:\\Users\\Sony-Pc\\eclipse-workspace\\Selenium_testing\\screenshot\\hm.png");
		FileUtils.copyFile(source, abc);
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.click();
	    firstname.sendKeys("ooty");
	    JavascriptExecutor scroll = (JavascriptExecutor) driver;
	    scroll.executeScript("window.scroll(0,300)","");
	    WebElement lastname = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[13]/td[2]/input"));
	    lastname.click();
	    lastname.sendKeys("kodaikanal");
	    WebElement address = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/textarea"));
	    address.click();
	    address.sendKeys("No:72; koruku theru; Germany");
	    WebElement creditcard = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[15]/td[2]/input"));
	    creditcard.click();
	    creditcard.sendKeys("12345678912564895");
	    WebElement cardname = driver.findElement(By.xpath("//select[@name='cc_type']//option[3]"));
	    cardname.click();
	    WebElement expmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']//option[3]"));
	    expmonth.click();
	    WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']//option[5]"));
	    expyear.click();
	    WebElement cvv = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[18]/td[2]/input"));
	    cvv.click();
	    cvv.sendKeys("0000");
	    TakesScreenshot bn = (TakesScreenshot) driver;
	    File booknow = bn.getScreenshotAs(OutputType.FILE);
	    File now = new File("C:\\Users\\Sony-Pc\\eclipse-workspace\\Selenium_testing\\screenshot\\book.png");
	    FileUtils.copyFile(booknow, now);
	    WebElement nb = driver.findElement(By.xpath("//input[@name='book_now']"));
	    nb.click();
	    //WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
	    //logout.click();
	    WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout"))).click();
	    
	    
	
	}

}
