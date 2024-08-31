package lk.omesh.testaad;


import lk.omesh.testaad.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
