package qsp5;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowseropen5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.google.co.in/");
		String title= c1.getTitle();
		System.out.println(title);
		

		
		
	
		
	
		
		
		
	
	

	}

}
