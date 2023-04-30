package main;

public class ColaEstatica {
	
	public int inicio = 0;
	public int fin = 0;
	public RobotDelFuturoEdicionUltraHiperMegaDelux[] arregloCola;
	public int tamañoPorDefecto = 5;
	//CONSTRUCTOR
	public ColaEstatica() {
		arregloCola = new RobotDelFuturoEdicionUltraHiperMegaDelux[tamañoPorDefecto];
	}
	//SOBRECARGA DEL CONSTRUCTOR
	public ColaEstatica(int nuevoTamaño) {
		arregloCola = new RobotDelFuturoEdicionUltraHiperMegaDelux[nuevoTamaño];
	}
	
	public void push(RobotDelFuturoEdicionUltraHiperMegaDelux dato) {
		arregloCola[fin] = dato;
		fin++;
		//arregloCola[fin++] = dato;
	}
	
	public RobotDelFuturoEdicionUltraHiperMegaDelux pop() {
		
		return arregloCola[inicio++];
	}
	
	public boolean empty() {
		if(inicio == fin)
			return true;
		return false;
	}
	
	public boolean full() {
		if(fin == arregloCola.length)
			return true;
		return false;
	}
	
}
