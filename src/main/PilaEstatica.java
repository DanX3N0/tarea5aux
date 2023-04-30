package main;

public class PilaEstatica {
	
	public Integer tamañoPorDefecto = 7;
	public RobotDelFuturoEdicionUltraHiperMegaDelux[] pila;
	public Integer tope = -1;
	
	//CONSTRUCTOR
	public PilaEstatica(){
		pila = new RobotDelFuturoEdicionUltraHiperMegaDelux[this.tamañoPorDefecto];
	}
	//SOBRECARGA DE CONSTRUCTOR
	public PilaEstatica(Integer tamaño2) {
		tamañoPorDefecto = tamaño2;
		pila = new RobotDelFuturoEdicionUltraHiperMegaDelux[tamaño2];
	}
	
	public void push(RobotDelFuturoEdicionUltraHiperMegaDelux nombre) {
		tope++;
		pila[tope] = nombre;
	}
	
	public RobotDelFuturoEdicionUltraHiperMegaDelux pop() {
		return pila[tope--];
	}
	
	public boolean empty() {
		if(tope == -1) {
			return true;
		}
		return false;
	}
	
}
