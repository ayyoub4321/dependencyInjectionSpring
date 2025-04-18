package net.ayyoub.presentation;

import net.ayyoub.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.ayyoub");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("res = "+metier.calcul());
    }
}
