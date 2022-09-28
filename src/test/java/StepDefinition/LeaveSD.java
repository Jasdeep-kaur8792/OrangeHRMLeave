//package StepDefinition;
//
//import BaseClass.BaseClass;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//
//import java.io.IOException;
//
//public class LeaveSD extends BaseClass {
//    @Given("user is on Login Page")
//    public void user_is_on_Login_Page() throws IOException, InterruptedException {
//        setup();
//    }
//
//    @And("User puts Login Credentials and click on Leave left side Navigator")
//    public void user_Clicked_Login_Button_and_clickOn_Leave() throws IOException, InterruptedException {
//        pageFactory.getLogInPage().logInSubmitButton();
//        pageFactory.getLeavePage().leave();
//
//    }
//}
