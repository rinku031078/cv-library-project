package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Results Per Page:']")
    WebElement resultText;

    public String verifyTheResults() {
        String message = getTextFromElement(resultText);
        CustomListeners.node.log(Status.PASS, "Get result text : " + resultText.getText());
        Reporter.log("Get result text " + resultText.getText() + "<br>");
        return message;
    }
}
