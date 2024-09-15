package co.com.certification.banistmo.taks;

import co.com.certification.banistmo.interactions.CambioVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.certification.banistmo.userinterfaces.PaginaInforme.*;

public class VaALaSeccionDeInformes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PLAN_ACCION),
                Scroll.to(LINK_PRESENTACION),
                Click.on(BOTON_VISUALIZACION),
                CambioVentana.setWindow()


        );
    }


    public static VaALaSeccionDeInformes deGestion(){
        return Tasks.instrumented(VaALaSeccionDeInformes.class);
    }
}
