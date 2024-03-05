package es.neesis.annotations;

import es.neesis.annotations.applications.Menu;
import es.neesis.annotations.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Menu application = new Menu();
        application.showMenu();
    }
}
