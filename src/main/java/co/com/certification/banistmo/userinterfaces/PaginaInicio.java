package co.com.certification.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {
    public static final Target BOTON_TRANSPARENCIA = Target.the("BOTON TRANSPARENCIA DEL MENU").
            located(By.xpath("//*[@id='zz2_RootAspMenu']/li[3]/a/span/span[1]"));
}
