package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();		
		//driver.get("https://www.google.com/");
		driver.get("https://www.choucairtesting.com/empleos-testing/");
		
		
		
	    //Para darle click al botón 
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/figure/a/img")).click();

	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/figure/a/img")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/figure/a/img")).click();

		//video
	    driver.findElement(By.xpath("//*[@id=\"player_uid_962413223_1\"]/div[4]/button/svg/path[1]")).click();
	    
	    //filtro de busquedas
	    driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).click();
		    
	    
	 // Inserta el texto "q" y ejecuta la accion del teclado "Enter"
	      driver.findElement(By.name("q")).sendKeys("pruebas" + Keys.ENTER);
	      
	      
	      //filtro de busquedas
		    driver.findElement(By.xpath("//*[@id=\"search_location\"]")).click();
			    
		    
		 // Inserta el texto "q" y ejecuta la accion del teclado "Enter"
		      driver.findElement(By.name("q")).sendKeys("cali" + Keys.ENTER);
	    
		      
		      System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		      driver = new FirefoxDriver();
				
				driver.get("https://www.choucairtesting.com/empleos-testing/");
	    
	}

}
