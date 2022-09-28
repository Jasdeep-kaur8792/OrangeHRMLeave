package Pages;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebDriver;
public class PageFactory {
    WebDriver driver;
    private LogInPage logInPage;
    private AdminPage adminPageDetail;
    private LeaveModule leaveModuleClick;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public LogInPage getLogInPage()

    {
        if (logInPage == null) {
            logInPage = new LogInPage(driver);
        }
        return logInPage;
    }
    public AdminPage getAdminDetail()

    {
        if (adminPageDetail == null) {
            adminPageDetail = new AdminPage(driver);
        }
        return adminPageDetail;
    }
    public LeaveModule getLeavePage()

    {
        if (leaveModuleClick == null) {
            leaveModuleClick= new LeaveModule(driver);
        }
        return leaveModuleClick;
    }
}