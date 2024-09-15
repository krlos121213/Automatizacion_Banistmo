package co.com.certification.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInforme {
    public static final Target BOTON_PLAN_ACCION= Target.the("BOTON PLAN DE ACCION").
            located(By.xpath("//*[@id='WebPartWPQ11']/div[1]"));

    public static final Target LINK_PRESENTACION= Target.the("LINK PRESENTACION CIUDADANIA").
            located(By.xpath("//*[@id='paging_container3']/ul/li[10]/div/div/a/h2"));

    public static final Target BOTON_VISUALIZACION = Target.the("BOTON VISUALIZACION DOCUMENTO").
            located(By.xpath("//*[@id='paging_container3']/ul/li[10]/div/div/div/a[1]"));


}

