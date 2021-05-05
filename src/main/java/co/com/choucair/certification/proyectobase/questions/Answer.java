package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private static Object Question;
    private String question;

    public Answer(String question){

        this.question = question;
    }

    public Answer(Object question) {
    }

    public static Answer toThe(String question){

        return new Answer(Question);


    }

    @Override
    public Boolean answerBy(Actor actor){
        boolean result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).vieweBy(actor).asString();
        if(question.equals(nameCourse)){

            result = true;

        }else{

            result = false;
        }

        return result;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
