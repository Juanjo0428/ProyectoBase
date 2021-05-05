package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {

    public static Login onThePage(){

        return Tasks.instrumented(Login.class);
    }

    @Override

    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("IngresatuUsuario").into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue("IngresatuContraseña*").into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.LOGIN_BUTTON)
        );

    }
}
