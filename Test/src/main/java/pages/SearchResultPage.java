package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Wait;

public class SearchResultPage extends BasePage{

    Wait waiter;
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//span[@class='fount-count-items']")
    public WebElement SearchResult;

    public Integer getSearchResult(){
        String str = SearchResult.getText();
        Integer numbers = Integer.valueOf(str.replaceAll("[^0-9]", ""));
        return numbers;
    }
}
