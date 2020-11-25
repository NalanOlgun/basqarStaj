package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Set;


public class DialogContent_Budget_SubjectCategories extends _Parent {
    WebElement myElement;

    public DialogContent_Budget_SubjectCategories() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]")
    private WebElement addBudgetButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy (xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement nameInputForSearch;


    @FindBy(xpath = "//span[text()='Type']")
    private WebElement typeButton;
    @FindBy(xpath = "//span[text()=' Group ']")
    private  WebElement groupButton;
    @FindBy(xpath = "//span[text()='Balance Type']")
    private WebElement balanceTypeButton;
    @FindBy(xpath="//span[text()=' Debit ']")
    private WebElement debitButton;
    @FindBy(xpath = "//span[text()='Category']")
    private WebElement categoryButton;
    @FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;
    @FindBy (xpath = "//span[text()=' Search ']")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton;
    @FindBy(xpath= "//ms-delete-button/button")
    private WebElement deleteButton;
    @FindBy (xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;


    public List<WebElement> userTypeAllOptions;
    public void findElementandSelectFunction(String userType) {
        for (WebElement userTypes : userTypeAllOptions) {
            if (userTypes.getText().contains(userType)) {
                userTypes.click();
                break;
            } } }

    public void findElementAndClickFunction(String ElementName) {
        /**
         * Buraya sadece tiklanacak elemanin adi gönderiliyor
         * burada adindan hangi eleman oldugu bulunuyor
         * ve sonra tiklaniyor
         */
        switch (ElementName){
        case "loginButton":
        myElement = loginButton;
        break;

        case "gotItBtn":


        if (gotItBtns.size() == 0)
            return;

        myElement = gotItBtn;
        break;

        case "addButton":
        myElement = addButton;
        break;
            case "addbudgetbutton":
                myElement=addBudgetButton;
                break;
            case "groupButton" :
                myElement=groupButton;
                break;
            case "typeButton":
                myElement=typeButton;
                break;
                case "balanceTypeButton":
                    myElement=balanceTypeButton;
                 break;
            case "debitButton":
                  myElement=debitButton;
                  break;
            case "saveButton":
                  myElement = saveButton;
                  break;
            case "searchButton":
                 myElement=searchButton;
                  break;
            case "editButton":
                myElement=editButton;
                break;
            case "deleteButton":
                myElement=deleteButton;
                break;
            case "yesButton":
                myElement=yesButton;
                break;
            case "nameInputForSearch":
                myElement=nameInputForSearch;
                break;


        }
        clickFunction(myElement);


    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {


        switch (ElementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement=nameInput;
                break;

            case "codeInput":
             myElement=codeInput;
              break;

            case "nameInputForSearch":
                myElement=nameInputForSearch;
                break;


        }
        sendsKeysFunction(myElement, value);
    }

    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
                case "msjContainer":
                  myElement = msjContainer;
                break;
        }

        verifyElementContaisText(myElement, msg);
    }


    public String getMainPageID() {
        String mainPageid = driver.getWindowHandle();
        return mainPageid;
    }

    //for dongusuyle yeni sayfaya gecildi
    public void changePageAndAssert(String anaSaydaID, String title) {
        Set<String> pageIDs = driver.getWindowHandles();
        for (String pageID : pageIDs) {
            if (!pageID.equals(anaSaydaID))
                driver.switchTo().window(pageID);
        }

        String newPageUrl = driver.getCurrentUrl();

        Assert.assertTrue(newPageUrl.contains(title));
        driver.close();
        driver.switchTo().window(anaSaydaID);

    }
}

