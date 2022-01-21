
import POM.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class Base {

    WebDriver driver;
    Faker faker;
    UnitedAirlinesMenu unitedAirlinesMenu;
    UnitedAirlinesBookTravelMenu unitedAirlinesBookTravelMenu;
    UnitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons;
    UnitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes;
    UnitedAirlinesTestCase5 unitedAirlinesTestCase5;


    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        faker = new Faker();
        unitedAirlinesMenu = new UnitedAirlinesMenu(driver);
        unitedAirlinesBookTravelMenu = new UnitedAirlinesBookTravelMenu(driver);
        unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons =
                new UnitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons(driver);
        unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes =
                new UnitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes(driver);
        unitedAirlinesTestCase5 = new UnitedAirlinesTestCase5(driver);

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}