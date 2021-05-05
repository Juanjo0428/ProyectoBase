package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certification.proyectobase.questions.Answer.*;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {


        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser().academyChoucairData.get(0).getStrPassword()));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @When("^he search for the course (.*) on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse()));
    }
}
