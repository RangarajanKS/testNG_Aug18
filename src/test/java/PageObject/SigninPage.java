package PageObject;

public class SigninPage {
    public String Username() {

        return "//input[@id='user-name']";
    }

    public String Password() {

        return "//input[@id='password']";
    }

    public String Submit() {

        return "//input[@id='login-button'] ";
    }


}
