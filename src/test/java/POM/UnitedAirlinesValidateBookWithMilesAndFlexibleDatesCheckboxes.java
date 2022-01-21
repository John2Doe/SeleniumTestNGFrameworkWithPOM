package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes {

    public UnitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@for='award']")
    public WebElement bookWithMiles;

    @FindBy(id = "award")
    public WebElement bookWithMilesInputBox;

    @FindBy(xpath = "//label[@for='flexibleDates']")
    public WebElement flexibleDates;

    @FindBy(id = "flexibleDates")
    public WebElement flexibleDatesInputBox;
}
