package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TShirtPO extends BasePO {
    public TShirtPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "category-name")
    public WebElement LBLCategoryName;

    @FindBy(xpath = "//*[@id='special_block_right']/p/a")
    public WebElement SECSpecialsBlock;
}
