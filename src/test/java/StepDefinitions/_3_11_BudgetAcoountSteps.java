package StepDefinitions;

import Pages.DialogContent_Budget_SubjectCategories;
import Pages.LeftnavigationBudget;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_11_BudgetAcoountSteps {
    LeftnavigationBudget leftnavigationBudget=new LeftnavigationBudget();
    DialogContent_Budget_SubjectCategories dialogContentBudgetSubjectCategories =new DialogContent_Budget_SubjectCategories();
    @When("^navigate to Budget Account$")
    public void navigateToBudgetAccount() {
        leftnavigationBudget.findElementAndClickFunction("budgetButton");
        leftnavigationBudget.findElementAndClickFunction("budgetAccountsButton");

    }

    @Then("^create a Budget Account Categories$")
    public void createABudgetAccountCategories() {
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("addbudgetbutton");

       dialogContentBudgetSubjectCategories.findElementAndSendKeysFunction("nameInput","nn4");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("typeButton");
       dialogContentBudgetSubjectCategories.findElementAndClickFunction("groupButton");
       dialogContentBudgetSubjectCategories.findElementAndClickFunction("balanceTypeButton");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("debitButton");
        dialogContentBudgetSubjectCategories.findElementAndSendKeysFunction("codeInput","94");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("saveButton");
    }

  // @And("^success  message should  be displayed$")
  //public void successMessageShouldBeDisplayed() {
    //dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");

  // }

    @Then("^edit a Budget Account$")
    public void editABudgetAccount()  {
        leftnavigationBudget.findElementAndClickFunction("budgetButton");
        leftnavigationBudget.findElementAndClickFunction("budgetAccountsButton");
        leftnavigationBudget.findElementAndClickFunction("budgetButton");
        leftnavigationBudget.findElementAndClickFunction("budgetAccountsButton");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("typeButton");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("groupButton");
        dialogContentBudgetSubjectCategories.findElementAndSendKeysFunction("nameInputForSearch","nn4");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("searchButton");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("editButton");
        dialogContentBudgetSubjectCategories.findElementAndSendKeysFunction("nameInput","nn4");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("saveButton");


    }

    @Then("^delete a Budget Account$")
    public void deleteABudgetAccount() {
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("typeButton");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("groupButton");
        dialogContentBudgetSubjectCategories.findElementAndSendKeysFunction("nameInputForSearch","nn4");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("deleteButton");
        dialogContentBudgetSubjectCategories.findElementAndClickFunction("yesButton");
    }

    @And("^success    message should  be displayed$")
    public void successMessageShouldBeDisplayed1() {
        dialogContentBudgetSubjectCategories.findElementAndVerifyContainsText("msjContainer","successfully");
    }


}
