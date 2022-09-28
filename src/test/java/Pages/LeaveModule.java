package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveModule {
    WebDriver driver;
    By clickOnLeaveLeftNavi= By.xpath("(//a[@class='oxd-main-menu-item active'])//span");
    public LeaveModule(WebDriver driver)
    {
        this.driver = driver;
    }
     public void leave() throws InterruptedException
     {
         driver.findElement(clickOnLeaveLeftNavi).click();
     }
}
