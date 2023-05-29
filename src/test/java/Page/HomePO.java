package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO extends BasePO {
    public HomePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "login")
    public WebElement BTNLogin;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li/a[@title='T-shirts']")
    public WebElement BTNTShirtMenu;
}
