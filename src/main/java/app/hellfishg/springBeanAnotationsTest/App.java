package app.hellfishg.springBeanAnotationsTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.hellfishg.springBeanAnotationsTest.beans.Barcelona;
import app.hellfishg.springBeanAnotationsTest.beans.Jugador;

public class App {
	
    public static void main( String[] args ){
    	
    	ApplicationContext appContext = new AnnotationConfigApplicationContext(
    			AppConfig.class);
    	
    	Jugador jug = (Jugador) appContext.getBean("jugador");
    	jug.setEquipo(new Barcelona());
    	
    	System.out.println(jug.toString());
    	
    	((ConfigurableApplicationContext)appContext).close();
    	
    }
}
