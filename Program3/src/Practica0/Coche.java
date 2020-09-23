package Practica0;

public class Coche {
	
	 public double miVelocidad; // Velocidad en pixels/segundo
	 public double miDireccionActual; // Direcci�n en la que estoy mirando en grados (de 0 a 360)
	 public double posX; // Posici�n en X (horizontal)
	 public double posY; // Posici�n en Y (vertical)
	 private String piloto; // Nombre de piloto
	 
	 public Coche() { 
		miVelocidad = 0;
		miDireccionActual = 0;
		posX = 0;
		posY = 0;
	}
	 
	public double getMiVelocidad() {
		return miVelocidad;
	}
	
	public void setMiVelocidad(double miVelocidad) {
		this.miVelocidad = miVelocidad;
	}
	
	public double getMiDireccionActual() {
		return miDireccionActual;
	}
	
	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
	}
	
	public double getPosX() {
		return posX;
	}
	
	public void setPosX(double posX) {
		this.posX = posX;
	}
	
	public double getPosY() {
		return posY;
	}
	
	public void setPosY(double posY) {
		this.posY = posY;
	}
	
	public String getPiloto() {
		return piloto;
	}
	
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	
	public String toString() {
		return "Piloto: " + piloto + " ubicado en una posici�n (" + posX + "," + posY + ") A una velocidad de " + miVelocidad + " m/s y en una direeci�n de " + miDireccionActual+ " grados.";
	}
	
	/** Cambia la velocidad actual del coche
	 * @param aceleracion Incremento de la velocidad en pixels/segundo
	 */
	 public void acelera( double aceleracion ) {
		this.setMiVelocidad(this.getMiVelocidad() + aceleracion);
	 }
	 
	 /** Cambia la direcci�n actual del coche
	 * @param giro Angulo de giro a sumar o restar de la direcci�n actual, en grados (-180 a +180)
	 */
	 public void gira( double giro ) {
		 this.setMiDireccionActual( this.getMiDireccionActual() + giro);
	 }
	 
	 /** Cambia la posici�n del coche dependiendo de su velocidad y direcci�n
	 * @param tiempoDeMovimiento Tiempo transcurrido, en segundos
	 */
	 public void mueve( double tiempoDeMovimiento ) {
		 this.setPosX(this.getPosX() + miVelocidad*tiempoDeMovimiento*Math.cos(miDireccionActual));
		 this.setPosY(this.getPosY() + miVelocidad*tiempoDeMovimiento*Math.cos(miDireccionActual));
		 System.out.println(tiempoDeMovimiento);

	 }
	 
}
