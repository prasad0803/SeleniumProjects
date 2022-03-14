package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab5 {
	public static WebDriver driver;
	static String ExpTitle="ShoppingApp";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\CAPGEMINI\\Module4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title=driver.getTitle();
		String str1="Your Store";
		if (title.equals(str1)) {
			System.out.println("Title Verified");
		}
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		String reg=driver.getTitle();
		String str2="Register Account";
		if (reg.equals(str2)) {
			System.out.println("Registration Account title Verified");
		}
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement warning=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		if(warning!=null) {
			System.out.println("Warning displayed");
		}
		
		//First Name
		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Prasad");
		
		String fn=fname.getAttribute("value");
		  if (fn.length()<1 || fn.length()>33 ) { 
			  WebElement warningfn=driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")); 
			  if(warningfn!=null) { 
				  System.out.println("First Name Warning displayed");
			  } 
		}
		 
		//Last Name  
		WebElement lname = driver.findElement(By.id("input-lastname"));
		lname.sendKeys("Ghumare");
		
		String ln=lname.getAttribute("value");
		
		  if (ln.length()<1 || ln.length()>33 ) {
			  WebElement warningln=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")); 
			  if(warningln!=null) { 
				  System.out.println("Last Name Warning displayed");
			  } 
	    }
		
		//Email
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("pg18@gmail.com");
		String em=email.getAttribute("value");
		
		  if (em.length()<1 || em.length()>33 ) {
			  WebElement warningem=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")); 
			  if(warningem!=null) { 
				  System.out.println("Email Warning displayed");
			  } 
	    }
		
		//Telephone
		WebElement tele = driver.findElement(By.id("input-telephone"));
		tele.sendKeys("1800578965");
		String tp=tele.getAttribute("value");
		
		  if (tp.length()<3 || tp.length()>33 ) {
			  WebElement warningtp=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")); 
			  if(warningtp!=null) { 
				  System.out.println("Email Warning displayed");
			  } 
	    }
		WebElement pwd = driver.findElement(By.id("input-password"));
		pwd.sendKeys("prasad18@");
		String pw=pwd.getAttribute("value");
		
		  if (pw.length()<4 || pw.length()>20 ) {
			  WebElement warningpw=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")); 
			  if(warningpw!=null) { 
				  System.out.println("Email Warning displayed");
			  } 
	    }
		WebElement pwdc = driver.findElement(By.id("input-confirm"));
		pwdc.sendKeys("prasad18@");
		String pwc=pwdc.getAttribute("value");
		
		  if (pwc.length()<4 || pwc.length()>20 ) {
			  WebElement warningpwc=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")); 
			  if(warningpwc!=null) { 
				  System.out.println("Email Warning displayed");
			  } 
	    }
		driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement msg=driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
		if (msg!=null) {	
			System.out.println("Account created message displayed.");
		}
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='View your order history']")).click();
	}

}
