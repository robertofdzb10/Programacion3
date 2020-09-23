package Practica0;

public class CocheJuego extends Coche{
	
	public JLabelCoche cocheImg = new JLabelCoche();

	public void setPosX(double posX) { //Cambio
		this.posX = posX;
		int posIX = (int) posX;
		cocheImg.setAlignmentX(posIX);
	}
	
	public void setPosY(double posY) { //Cambio
		this.posY = posY;
		int posIY = (int) posY;
		cocheImg.setAlignmentY(posIY);
	}

	public JLabelCoche getCocheImg() {
		return cocheImg;
	}
}
