package co.com.certification.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaTransparencia {
    public static final Target BOTON_PLANEACION= Target.the("BOTON PLANEACION DEL MENU").
            located(By.xpath("//*[@id='chordion']/div[5]"));

    public static final Target PLAN_DE_ACCION_LINK= Target.the("LINK PLAN DE ACCION").
            located(By.xpath("//*[@id='WebPartWPQ18']/div[1]/table/tbody/tr[3]/td/a"));

}
