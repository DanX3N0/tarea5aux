package main;

public class RobotDelFuturoEdicionUltraHiperMegaDelux {

	public String modelo;
	public String color;
	public Integer id;
	
	public RobotDelFuturoEdicionUltraHiperMegaDelux(String modelo, String color, Integer id) {
		this.modelo = modelo;
		this.color = color;
		this.id = id;
	}
	
	public void showRobots() {
		System.out.println("Modelo: " + this.modelo + "\n" +
						   "Color: " + this.color + "\n" + 
						   "Id: " + this.id + "\n");
	}
	
}
