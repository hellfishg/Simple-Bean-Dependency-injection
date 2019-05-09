package app.hellfishg.springBeanAnotationsTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.hellfishg.springBeanAnotationsTest.beans.Barcelona;
import app.hellfishg.springBeanAnotationsTest.beans.Camiseta;
import app.hellfishg.springBeanAnotationsTest.beans.Jugador;
import app.hellfishg.springBeanAnotationsTest.beans.Marca;

@Configuration
public class AppConfig {

	@Bean
	public Jugador jugador() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
