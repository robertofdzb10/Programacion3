package Practica0;

import java.awt.Component;


public class Main {
	
	public static void main(String[] args) {
		VentanaJuego ventana = new VentanaJuego();
		System.out.println(ventana.coche.toString());
		ventana.setVisible( true );
		Thread Hilo = new Thread() {
			public void run() {
				while (ventana.isVisible() == true) {
					ventana.repaint();
					ventana.coche.mueve(0.04);
					System.out.println("Ubicado en una posición (" + ventana.coche.getPosX() + "," + ventana.coche.getPosY() + ") A una velocidad de " + ventana.coche.getMiVelocidad() + " m/s y en una direeción de " + ventana.coche.getMiDireccionActual()+ " grados.");
					//ventana.setVisible( true );
					try
					{
						Thread.sleep (40);  // Dormimos el hilo
					} 
					catch (Exception e)
					{
						System.out.println("Error");
					}
				}
			}
		}; 
		System.out.println(ventana.coche.getCocheImg());
		Hilo.start();
	}
	
	
}
