package co.com.choucair.certification.elizabethcano.tasks;

import co.com.choucair.certification.elizabethcano.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
        private ChoucairAcademyPage choucairAcademyPage;
    private Actor actor;

    public static  OpenUp thePage(){
            return Tasks.instrumented(OpenUp.class);

        }

    @Override
    public <T extends Actor> void performAs(T Actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
        }
}