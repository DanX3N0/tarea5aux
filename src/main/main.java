package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PilaEstatica verificacion = new PilaEstatica(100);
		ColaEstatica empaque = new ColaEstatica(100);
		
		while(true) {
			menu();
			
			Integer opcion = Integer.parseInt(sc.nextLine());
			
			if(opcion == 1) {
				
				String modelo = sc.nextLine();
				String color = sc.nextLine();
				Integer id = Integer.parseInt(sc.nextLine());
				
				verificacion.push(new RobotDelFuturoEdicionUltraHiperMegaDelux(modelo, color, id));
				
			}else if(opcion == 2) {
				//eliminar con id
				
				Integer idBusqueda = Integer.parseInt(sc.nextLine());
				
				PilaEstatica aux = new PilaEstatica(100);
				
				while(!verificacion.empty()) {
					RobotDelFuturoEdicionUltraHiperMegaDelux robot = verificacion.pop();
				
					if(robot.id != idBusqueda) {
						aux.push(robot);
					}
				}
				
				while(!aux.empty()) {
					verificacion.push(aux.pop());
				}
				
				
			}else if(opcion == 3) {
				
				Integer numeroDeRobotsAEnviar = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < numeroDeRobotsAEnviar; i++) {
					empaque.push(verificacion.pop());
				}
				
			}else if(opcion == 4) {
			
				Integer numeroDeRobotsAElminar = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < numeroDeRobotsAElminar; i++) {
					empaque.pop();
				}
				
			}else if(opcion == 5) {
				
				empaque.pop().showRobots();
				
			}else if(opcion == 6) {
				System.exit(0);
			}else{
				System.out.println("OPCION NO VALIDA!");
			}
			
		}
		
	}
	
	public static void menu() {
		System.out.println("1.- Insertar un nuevo robot en una pila de verificacion. \n"  +
						   "2.-  Eliminar un robot de la pila de verificacion.\n" + 
				 	       "3.-  Enviar un conjunto de robots a la cola de empaque.\n" +
						   "4.-  Eliminar un conjunto de robots de la cola de empaque.\n" +
				 	       "5.-  Envio de paquete de robots a tiendas.\n" + 
						   "6.- Salir.\n");
	}

}
