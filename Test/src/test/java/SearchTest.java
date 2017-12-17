import helpers.DataProviderTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchResultPage;

public class SearchTest extends BaseTest{
    MainPage mainPage;
    SearchResultPage searchResultPage;
    public String url = "https://rabota.nur.kz/";
    int numbers;


    @BeforeMethod
    public void beforeMethod() {

        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        mainPage.openPage(url);
    }

    @Test(dataProvider = "key", dataProviderClass = DataProviderTest.class)
    public void inputKeyPosition(String key){
        mainPage.filledSearch(key);
        mainPage.searchButton.click();
        numbers = searchResultPage.getSearchResult();
        Assert.assertTrue(searchResultPage.getSearchResult()>=10);
    }

    @Test(dataProvider = "key", dataProviderClass = DataProviderTest.class)
    public void inputKeyPositionAndLocation(String key){
        mainPage.filledSearch(key);
        mainPage.selectLocation("Алматы");
        mainPage.searchButton.click();
        numbers = searchResultPage.getSearchResult();
        Assert.assertTrue(searchResultPage.getSearchResult()>=10);
    }

    @AfterTest
    public void afterMethod() {

        driver.quit();
    }

}
