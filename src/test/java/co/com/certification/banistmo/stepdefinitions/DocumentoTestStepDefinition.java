package co.com.certification.banistmo.stepdefinitions;

import co.com.certification.banistmo.taks.DocumentoGenerado;
import co.com.certification.banistmo.taks.VaALaSeccionDeDocumentos;
import co.com.certification.banistmo.taks.VaALaSeccionDeInformes;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.*;
import org.openqa.selenium.WebDriver;
import static co.com.certification.banistmo.utils.Constantes.URL;

public class DocumentoTestStepDefinition {
    @Managed
            (driver = "chrome")
    protected WebDriver browser;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
        OnStage.theActorCalled("Actor");
    }

    @Given("que el cliente quiere aaceder a la pagina de la aereonautica civil")
    public void queElClienteQuiereAacederALaPaginaDeLaAereonauticaCivil() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }
    @When("va a la la seccion de plan de accion ubicada en transparencia")
    public void vaALaLaSeccionDePlanDeAccionUbicadaEnTransparencia() {
        OnStage.theActorInTheSpotlight().attemptsTo(VaALaSeccionDeDocumentos.deTransparencia());
    }
    @When("visualiza el documento")
    public void visualizaElDocumento() {
        OnStage.theActorInTheSpotlight().attemptsTo(VaALaSeccionDeInformes.deGestion());
    }
    @Then("deberia ver el documento generado")
    public void deberiaVerElDocumentoGenerado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(DocumentoGenerado.es("https://www.aerocivil.gov.co/atencion/planeacion/Plan%20de%20accin/Presentaci%C3%B3n%20a%20la%20Ciudadania.pdf")));
    }
}
