package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Wait;

public class MainPage extends BasePage{

    Wait waiter;
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebDriver driver;
    @FindBy(how = How.ID, using = "query_top_search_form")
    public WebElement searchField;

    @FindBy(how = How.NAME, using = "yt0")
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//input[@class='js-autocomplete-cities js-toggle-top-cities b-search__general-city']")
    public WebElement searchLocation;

    public MainPage filledSearch(String name){
        searchField.sendKeys(name);
        return this;
    }

    public MainPage selectLocation(String location){
        searchLocation.sendKeys(location);
        return this;
    }

}
