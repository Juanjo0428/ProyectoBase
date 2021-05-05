package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.aspectj.apache.bcel.classfile.Module;

public class OpenUp implements Task {
    private ChoucairAcademyPage ChoucairAcademyPage;
    public static OpenUp thePage() {


        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Open.browserOn(ChoucairAcademyPage));
    }
}
