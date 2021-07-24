package co.com.choucair.certification.elizabethcano.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair").located
            (By.xpath("//div[@id='Universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el Curso").located(By.id("coursssearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located
            (By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located
            (By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso").located
            (By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));


}
