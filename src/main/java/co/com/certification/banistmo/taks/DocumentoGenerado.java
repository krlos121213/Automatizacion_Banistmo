package co.com.certification.banistmo.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class DocumentoGenerado implements Question<Boolean> {

    String nombreDocumento;


    public DocumentoGenerado(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String url = driver.getCurrentUrl();

        System.out.println(url);
        if (url.contains(nombreDocumento) && url.endsWith(".pdf")){
            resultado = true;
        }
        return resultado;

    }


    public static DocumentoGenerado es(String nombreDocumento) {
        return new DocumentoGenerado(nombreDocumento);
    }
}
