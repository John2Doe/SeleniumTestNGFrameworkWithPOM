import org.testng.Assert;
import org.testng.annotations.Test;
import texts.ExpectedText;
import utilities.ConfigReader;
import utilities.Waiter;

public class UnitedAirlinesTest extends Base{

    @Test(testName = "Validate Main menu navigation items", priority = 1)
    public void validateMainMenuNavigationItems(){
        driver.get(ConfigReader.getProperty("unitedAirlinesURL"));
        Assert.assertTrue(unitedAirlinesMenu.book.isDisplayed());
        Assert.assertTrue(unitedAirlinesMenu.myTrips.isDisplayed());
        Assert.assertTrue(unitedAirlinesMenu.travelInfo.isDisplayed());
        Assert.assertTrue(unitedAirlinesMenu.mileageplusProgram.isDisplayed());
        Assert.assertTrue(unitedAirlinesMenu.deals.isDisplayed());
        Assert.assertTrue(unitedAirlinesMenu.help.isDisplayed());
    }

    @Test(testName = "Validate Book travel menu navigation items", priority = 2)
    public void  ValidateBookTravelMenuNavigationItems(){
        driver.get(ConfigReader.getProperty("unitedAirlinesURL"));
        Assert.assertTrue(unitedAirlinesBookTravelMenu.book.isDisplayed());
        Assert.assertTrue(unitedAirlinesBookTravelMenu.flightStatus.isDisplayed());
        Assert.assertTrue(unitedAirlinesBookTravelMenu.check_In.isDisplayed());
        Assert.assertTrue(unitedAirlinesBookTravelMenu.myTrips.isDisplayed());
    }

    @Test(testName = " Validate Round-trip and One-way radio buttons", priority = 3)
    public void  validateRound_tripAndOne_wayRadioButtons(){
        driver.get(ConfigReader.getProperty("unitedAirlinesURL"));

        Assert.assertTrue(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.roundTrip.isDisplayed());
        Assert.assertTrue(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.roundTripInputBox.isSelected());
        Assert.assertTrue(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.roundTripInputBox.isEnabled());

        Assert.assertTrue(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.oneWay.isDisplayed());
        Assert.assertFalse(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.oneWayInputBox.isSelected());

        Assert.assertTrue(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.oneWayInputBox.isEnabled());

        unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.oneWayInputBox.click();

        Assert.assertFalse(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.roundTripInputBox.isSelected());
        Assert.assertTrue(unitedAirlinesTestValidateRound_tripAndOne_wayRadioButtons.oneWayInputBox.isSelected());
    }

    @Test(testName = "Validate Book with miles and Flexible dates checkboxes", priority = 4)
    public void validateBookWithMilesAndFlexibleDatesCheckboxes(){
        driver.get(ConfigReader.getProperty("unitedAirlinesURL"));

        Assert.assertTrue(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMiles.isDisplayed());
        Assert.assertTrue(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMilesInputBox.isEnabled());
        Assert.assertFalse(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMilesInputBox.isSelected());

        Assert.assertTrue(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDates.isDisplayed());
        Assert.assertTrue(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDatesInputBox.isEnabled());
        Assert.assertFalse(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDatesInputBox.isSelected());

        unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMiles.click();
        unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDates.click();

        Assert.assertTrue(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMilesInputBox.isSelected());
        Assert.assertTrue(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDatesInputBox.isSelected());

        unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMiles.click();
        unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDates.click();

        Assert.assertFalse(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.bookWithMilesInputBox.isSelected());
        Assert.assertFalse(unitedAirlinesValidateBookWithMilesAndFlexibleDatesCheckboxes.flexibleDatesInputBox.isSelected());
    }

    @Test(testName = "Validate One-way ticket search results from Chicago, IL, US (ORD) to Miami, FL, US (MIA)", priority = 5)
    public void ValidateOne_wayTicketSearchResultsFromChicagoIlUsORDtoMiamiFlUsMIA(){
        driver.get(ConfigReader.getProperty("unitedAirlinesURL"));
        unitedAirlinesTestCase5.oneWay.click();

        unitedAirlinesTestCase5.fromInputBox.sendKeys(ExpectedText.chicago);

        unitedAirlinesTestCase5.toToInputBox.sendKeys(ExpectedText.miami);

        unitedAirlinesTestCase5.dateInputBox.clear();
        unitedAirlinesTestCase5.dateInputBox.sendKeys(ExpectedText.date);

        unitedAirlinesTestCase5.travelersButton.click();
        unitedAirlinesTestCase5.increaseTraveler.click();

        unitedAirlinesTestCase5.cabinDropdown.click();
        unitedAirlinesTestCase5.business.click();

        unitedAirlinesTestCase5.findFlightButton.click();

        Assert.assertEquals(unitedAirlinesTestCase5.expectedMessage.getText(), ExpectedText.departureMessage);

    }

}
