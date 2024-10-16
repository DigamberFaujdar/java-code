//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.Scanner;
//
//public class Mercury_tour {
//    public static void main(String [] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\LapMall\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        driver.findElement(By.xpath("//a[text()='Flights']")).click();
//        Select airline=new Select(driver.findElement(By.xpath("//select[@name='airline']")));
//        airline.selectByVisibleText("Unified Airlines");
//        Thread.sleep(10000);
//        if (airline.isMultiple())
//        {
//            System.out.println("There are multiple drop down ");
//        }
//        else
//        System.out.println("There are not multiple drop down");
//
//        //Actions class mouse hover
//        Actions actions=new Actions(driver);
////        actions.doubleClick();
//        int fact =1;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int num =scanner.nextInt();
//        for (int i=1;i<=num;i++)
//        {
//            fact*=i;
//        }
//        System.out.println("factorial is "+fact);
//
//        driver.close();
//    }
//}