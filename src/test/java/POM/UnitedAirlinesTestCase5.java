package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesTestCase5 {
    public UnitedAirlinesTestCase5(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@for='oneway']")
    public WebElement oneWay;

    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromInputBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toToInputBox;

    @FindBy(id = "DepartDate")
    public WebElement dateInputBox;

    @FindBy(xpath = "//button[@aria-label='Move backward to switch to the previous month.']")
    public WebElement dateArrow;

    @FindBy(xpath = "(//table/tbody/tr[6])/td[1]")
    public  WebElement givenDate;

    @FindBy(xpath = "//button[@aria-labelledby='stuff']")
    public WebElement travelersButton;

    @FindBy(xpath = "//button[@aria-label='Substract one Adult']")
    public WebElement increaseTraveler;

    @FindBy(id = "cabinType")
    public WebElement cabinDropdown;

    @FindBy(id = "cabinType_item-2")
    public WebElement business;

    @FindBy(xpath = "//span[text()='Find flights']/parent::button")
    public WebElement findFlightButton;

    @FindBy(xpath = "//h2/div")
    public WebElement expectedMessage;


}
