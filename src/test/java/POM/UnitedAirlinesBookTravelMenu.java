package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesBookTravelMenu {

    public UnitedAirlinesBookTravelMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "travelTab")
    public WebElement book;

    @FindBy(id = "statusTab")
    public WebElement flightStatus;

    @FindBy(id = "checkInTab")
    public WebElement check_In;

    @FindBy(id = "tripsTab")
    public WebElement myTrips;


}
