package co.com.choucair.certification.elizabethcano.stepdefinitions;


import co.com.choucair.certification.elizabethcano.model.AcademyChoucairData;
import co.com.choucair.certification.elizabethcano.questions.Answer;
import co.com.choucair.certification.elizabethcano.tasks.Login;
import co.com.choucair.certification.elizabethcano.tasks.OpenUp;
import co.com.choucair.certification.elizabethcano.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class ChoucairAcademyStepDefintions {
@Before
public void  setStage(){
    OnStage.setTheStage(new OnlineCast());

}
    @Given("^than Elizabeth wants to learn automation at the academy Choucair$")
    public void thanElizabethWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
       OnStage.theActorCalled("Elizabeth").wasAbleTo(OpenUp.thePage(), Login.
        onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }
   @When("^she search for the course on the Choucair Academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));


    }
    @Then("^she finds the course called $")
    public void sheFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception  {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}
