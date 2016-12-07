package Software;


import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static Software.DriverManager.driver;

/**
 * Created by Mehul on 30/11/2016.
 */
public class RunTest extends DriverManager
{



     @org.testng.annotations.Test
    public void homepage() throws InterruptedException

     {   Thread.sleep(3000);
                  try
         {

             Alert alert = driver.switchTo().alert();
             alert.accept();

         }
         catch (Exception e){
         }

         String hopmePage = driver.getWindowHandle();
         System.out.println(hopmePage);

         driver.findElement(By.id("id=loginsubmit")).click();

         String popPage = driver.getWindowHandle();
         System.out.println(popPage);
//         try
//         {
//
//             Alert alert = driver.switchTo().alert();
//             alert.accept();
//
//         }
//         catch (Exception e){
//         }

//         driver.getWindowHandle();



     }
}
