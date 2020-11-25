package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavigationSubjectCategories extends _Parent {
    WebElement myElement;
    public LeftNavigationSubjectCategories() { PageFactory.initElements(driver, this); }

    @FindBy(xpath = "//span[text()='Education']" )
    private WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[5]" )
    private WebElement setupButton;


    @FindBy(xpath = "//span[text()='Subject Categories']" )
    private WebElement subjectcatogeriesButton;


    @FindBy(css ="#ms-table-1_buttons > ms-table-toolbar > div > ms-add-button > div > button")
    private WebElement addnalanButton;




    public void  findElementAndClickFunction(String ElementName) {
        /**
         * Buraya sadece tiklanacak elemanin adi gönderiliyor
         * burada adindan hangi eleman oldugu bulunuyor
         * ve sonra tiklaniyor
         */
        switch (ElementName) {
            case "educationButton":
                myElement = educationButton;
                break;

            case "setupButton":
                myElement = setupButton;
                break;
            case "subjectCatogeriesButton":
                myElement = subjectcatogeriesButton;
                break;

            case "addnalanButton":
                myElement=addnalanButton;
                break;

        }
        clickFunction(myElement);


    }




}
