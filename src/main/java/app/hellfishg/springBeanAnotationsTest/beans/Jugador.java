package app.hellfishg.springBeanAnotationsTest.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import app.hellfishg.springBeanAnotationsTest.interfaces.Equipo_Inter;

@Component
public class Jugador {
	
	@Value("1")
	private int id;
	@Value("Messi")
	private String nombre;
	@Autowired
	@Qualifier("barcelona")
	private Equipo_Inter Equipo;
	@Autowired
	private Camiseta camiseta;
	
	public Jugador() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo_Inter getEquipo() {
		return Equipo;
	}
	public void setEquipo(Equipo_Inter equipo) {
		Equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}
	
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", Equipo=" + Equipo + ", camiseta=" + camiseta + "]";
	}

}
