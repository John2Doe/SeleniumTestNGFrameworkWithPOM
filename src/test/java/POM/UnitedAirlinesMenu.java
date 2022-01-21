package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesMenu {

    public UnitedAirlinesMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "headerNav0")
    public WebElement book;

    @FindBy(id = "headerNav1")
    public WebElement myTrips;

    @FindBy(id = "headerNav2")
    public WebElement travelInfo;

    @FindBy(id = "headerNav3")
    public WebElement mileageplusProgram;

    @FindBy(id = "headerNav4")
    public WebElement deals;

    @FindBy(id = "headerNav5")
    public WebElement help;


}
