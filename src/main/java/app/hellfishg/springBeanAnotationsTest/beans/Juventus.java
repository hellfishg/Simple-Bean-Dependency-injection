package app.hellfishg.springBeanAnotationsTest.beans;

import org.springframework.stereotype.Component;

import app.hellfishg.springBeanAnotationsTest.interfaces.Equipo_Inter;

@Component
public class Juventus implements Equipo_Inter{

	public String mostrar() {
		
		return "Juventus";
	}

}
