package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location1;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance1;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moresearchoption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salarytype;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobt;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findjob;

    public void setAcceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String job) {
        sendTextToElement(jobtitle, job);
        CustomListeners.node.log(Status.PASS, "Enter JobTitle '" + job + "' to JobTitle field : "
                + jobtitle.getText());
        Reporter.log("Enter JobTitle" + job + " to email JobTitle " + jobtitle.getText() + "<br>");
    }

    public void enterLocation(String location) {
        sendTextToElement(location1, location);
        CustomListeners.node.log(Status.PASS, "Enter Location '" + location + "' to Location field : "
                + location1.getText());
        Reporter.log("Enter Location" + location + " to email Location " + jobtitle.getText() + "<br>");
    }

    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distance1, distance);
        CustomListeners.node.log(Status.PASS, "Select distance '" + distance + "'");
        Reporter.log("Select distance '" + distance + "'" + "<br>");

    }
    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moresearchoption);
        CustomListeners.node.log(Status.PASS, "Click on MoreSearchOptionLink");
        Reporter.log("Clicking on MoreSearchOptionLink <br>");
    }
    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.node.log(Status.PASS, "Enter minSalary '" + minSalary + "' to minSalary field : "
                + salaryMin.getText());
        Reporter.log("Enter minSalary" + minSalary + " to email minSalary " + jobtitle.getText() + "<br>");
    }
    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.node.log(Status.PASS, "Enter maxSalary '" + maxSalary + "' to maxSalary field : "
                + salaryMax.getText());
        Reporter.log("Enter maxSalary" + maxSalary + " to email maxSalary " + jobtitle.getText() + "<br>");
    }
    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salarytype, sType);
        CustomListeners.node.log(Status.PASS, "Select Salary Type '" + sType + "'");
        Reporter.log("Select Salary Type '" + sType + "'" + "<br>");

    }
    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobt, jobType);
        CustomListeners.node.log(Status.PASS, "Select Job Type'" + jobType + "'");
        Reporter.log("Select Job Type '" + jobType + "'" + "<br>");

    }
    public void clickOnFindJobsButton() {
        clickOnElement(findjob);
        CustomListeners.node.log(Status.PASS, "clickOnFindJobsButton");
        Reporter.log("clickOnFindJobsButton <br>");
    }
}