package house_bolton_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validation {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validation.RooseBolton();
		Methods_Classes_Url_Title_Validation.RamsayBolton();
		
		Methods_Classes_Url_Title_Validation HouseBolton = new Methods_Classes_Url_Title_Validation();
		HouseBolton.DomericBolton();
		HouseBolton.BethanyBolton();
		
		Methods_Classes_Url_Title_Validation HouseBolton1 = new Methods_Classes_Url_Title_Validation();
		HouseBolton1.WaldaFreay();
		
		
		
	}
	public static void RooseBolton() {
		System.out.println("Leech Lord");
	}
	public static void RamsayBolton() {
		System.out.println("The Bastard of the DreadFort");
	}
	public static void DomericBolton() {
		System.out.println("First Green");
	}
	public static void BethanyBolton() {
		System.out.println("Dread Leech Lady");
	}
	public static void WaldaFreay() {
		System.out.println("Fat Walda");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Bolton");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Bolton";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Bolton - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
		
	
		

	}


