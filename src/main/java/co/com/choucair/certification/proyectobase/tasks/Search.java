package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
private String course;
    public Search(String Course) {

        this.course = course;
    }

    public static Search the(String course) {

        return Tasks.instrumented(Search.class);
    }

    @Override

    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)

                );


    }

}
