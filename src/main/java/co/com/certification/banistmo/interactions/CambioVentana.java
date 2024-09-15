package co.com.certification.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class CambioVentana implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        for (String windowHandle : driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
    }


    public static CambioVentana setWindow(){
        return new CambioVentana();
    }
}
