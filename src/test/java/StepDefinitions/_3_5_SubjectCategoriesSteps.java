package StepDefinitions;

import Pages.DialogContent_Budget_SubjectCategories;
import Pages.LeftNavigationSubjectCategories;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_5_SubjectCategoriesSteps extends LeftNavigationSubjectCategories {
    DialogContent_Budget_SubjectCategories dialogcontent = new DialogContent_Budget_SubjectCategories();
    LeftNavigationSubjectCategories leftNavigation1 = new LeftNavigationSubjectCategories();


    @When("^navigate to Subject Categories$")
    public void navigateToSubjectCategories() {
        leftNavigation1.findElementAndClickFunction("educationButton");
        leftNavigation1.findElementAndClickFunction("setupButton");
        leftNavigation1.findElementAndClickFunction("subjectCatogeriesButton");

    }

    @Then("^create a Subject Categories$")
 public void createASubjectCategories() {
      dialogcontent.findElementAndClickFunction("addButton");

      dialogcontent.findElementAndSendKeysFunction("nameInput", "group8");

       dialogcontent.findElementAndSendKeysFunction("codeInput", "837583792");
       dialogcontent.findElementAndClickFunction("saveButton");
    }

  @And("^success message should  be displayed$")
    public void successMessageShouldBeDisplayednalan() {
      dialogcontent.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @Then("^delete a Subject Categories$")
    public void deleteASubjectCategories() {
        dialogcontent.findElementAndClickFunction("nameInputArama");
        dialogcontent.findElementAndSendKeysFunction("nameInputforSearch", "group8");
        dialogcontent.findElementAndClickFunction("searchButton");
        dialogcontent.findElementAndClickFunction("deleteButton");
        dialogcontent.findElementAndClickFunction("yesButton");
    }

    @And("^success message should  be  displayed$")
    public void successMessageShouldBeDisplayed() {
        dialogcontent.findElementAndVerifyContainsText("msjContainer", "Subject Category successfully deleted");
    }
}



