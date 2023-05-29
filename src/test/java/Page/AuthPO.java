package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthPO extends BasePO {
    public AuthPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='create-account_form']/h3")
    public WebElement LBLCreateAccount;

    @FindBy(className = "page-subheading")
    public WebElement LBLPersonInfo;

    @FindBy(id = "email_create")
    public WebElement INPEmailCreate;

    @FindBy(id = "SubmitCreate")
    public WebElement BTNCreateAccount;

    @FindBy(id = "email")
    public WebElement INPEmailLogin;

    @FindBy(id = "passwd")
    public WebElement INPPasswordLogin;

    @FindBy(id = "SubmitLogin")
    public WebElement BTNLoginAccount;

    @FindBy(xpath = "//*[@id='center_column']/div[1]/p")
    public WebElement MSGErrorLogin;

    public void fillInputEmailCreate(String email) {
        INPEmailCreate.sendKeys(email);
    }

    public void initCreateAccount() {
        BTNCreateAccount.click();
    }

    public void fillInputEmailLogin(String email) {
        INPEmailLogin.sendKeys(email);
    }

    public void fillInputPasswordLogin(String password) {
        INPPasswordLogin.sendKeys(password);
    }

    public void initLoginAccount() {
        BTNLoginAccount.click();
    }
}
