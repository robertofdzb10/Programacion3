package Practica0;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

public class JLabelCoche extends JLabel {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JLabel coche = new JLabel();
		coche.setIcon(new ImageIcon("src/Practica0/coche.png"));
		coche.setSize(100, 100);
	}
	

	
	
}
