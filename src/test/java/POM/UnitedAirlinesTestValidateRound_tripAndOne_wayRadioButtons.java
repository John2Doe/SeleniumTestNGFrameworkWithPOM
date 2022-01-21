package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons {
    public UnitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@for='roundtrip']")
    public WebElement roundTrip;

    @FindBy(id = "roundtrip")
    public WebElement roundTripInputBox;

    @FindBy(xpath = "//label[@for='oneway']")
    public WebElement oneWay;

    @FindBy(id = "oneway")
    public WebElement oneWayInputBox;
}
