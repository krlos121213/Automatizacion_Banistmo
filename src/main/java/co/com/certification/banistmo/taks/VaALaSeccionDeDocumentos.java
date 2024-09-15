package co.com.certification.banistmo.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.certification.banistmo.userinterfaces.PaginaInicio.BOTON_TRANSPARENCIA;
import static co.com.certification.banistmo.userinterfaces.PaginaTransparencia.BOTON_PLANEACION;
import static co.com.certification.banistmo.userinterfaces.PaginaTransparencia.PLAN_DE_ACCION_LINK;

public class VaALaSeccionDeDocumentos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_TRANSPARENCIA),
                Click.on(BOTON_PLANEACION),
                Scroll.to(PLAN_DE_ACCION_LINK),
                Click.on(PLAN_DE_ACCION_LINK)
        );
    }

    public static VaALaSeccionDeDocumentos deTransparencia(){
        return Tasks.instrumented(VaALaSeccionDeDocumentos.class);
    }
}
