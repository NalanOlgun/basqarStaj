package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftnavigationBudget extends _Parent{
    WebElement myElement;
    public  LeftnavigationBudget() { PageFactory.initElements(driver, this); }
    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budgetButton;

    @FindBy(xpath = "//span[text()='Budget Accounts']")
    private WebElement budgetAccountsButton;





    public void  findElementAndClickFunction(String ElementName) {
        /**
         * Buraya sadece tiklanacak elemanin adi gönderiliyor
         * burada adindan hangi eleman oldugu bulunuyor
         * ve sonra tiklaniyor
         */
        switch (ElementName) {
            case "budgetButton":
                myElement = budgetButton;
                break;

            case "budgetAccountsButton":
                myElement = budgetAccountsButton;
                break;


        }
        clickFunction(myElement);


    }
}
