//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//
//
//        driver.get("https://www.flipkart.com/");
//        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
//        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("shoes");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(500);
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[2]")).click();
//        int size=driver.getWindowHandles().size();
//        System.out.println("window size is "+size);
//        driver.findElement(By.xpath("//button[@type='button']")).click();
//        driver.findElement(By.xpath("(//a[@class='_1fGeJ5 _2UVyXR _31hAvz'])[3]")).click();
//        driver.findElement(By.xpath("//button[@type='button']")).click();
//        driver.close();
//        Thread.sleep(500);
//
//        System.out.println("Hello world!");
//    }
//}