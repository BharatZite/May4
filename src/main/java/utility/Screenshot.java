package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void ClickScreenshot(WebDriver driver,String name ) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter time=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String S=date.format(time);
		File destination=new File("C:\\Users\\Bharat\\Documents\\eclipse\\automation\\src\\May4\\Screenshot\\"+name+"-"+".png");
		
		FileHandler.copy(source, destination);
		
	}
	
}
