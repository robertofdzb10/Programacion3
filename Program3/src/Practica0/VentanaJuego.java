package Practica0;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaJuego extends JFrame {
	
	public JFrame ventana;
	 public CocheJuego coche;
	
	public VentanaJuego() {
		
		ventana = new JFrame();
		coche = new CocheJuego();
		
		//0.Configurar el coche


		
		//1. Configuracion de la ventana
		
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		setSize(600, 400); //Tamaño ventana
		setTitle("Game"); //No necesita getContentPane, ya que se hace sobre la ventana
		
		
		//2. Creación de contenedores (paneles) y componenetes
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		JPanel botonera = new JPanel();
		botonera.setBackground(Color.LIGHT_GRAY);
		JButton bAcelera = new JButton( "Acelera");
		JButton bFrena = new JButton( "Frena");
		JButton bGiraIzq = new JButton( "Gira Izq.");
		JButton bGiraDer = new JButton( "Gira Der.");

		
		
		//3.Decoraciones
		
		
		
		//4.Asignacion de componenetes a contenedores
		
		getContentPane().add( panel, null);
		panel.add(coche.getCocheImg());
		getContentPane().add( botonera, BorderLayout.SOUTH);
		botonera.add(bAcelera);
		botonera.add(bFrena);
		botonera.add(bGiraDer);
		botonera.add(bGiraIzq);
		
		
		//5.Eventos
		
		bAcelera.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.acelera(5);
				System.out.println(coche.getMiVelocidad());	
			}
		});
		
		bFrena.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (coche.getMiVelocidad() > 0 ){
					coche.acelera(-5);
					System.out.println(coche.getMiVelocidad());	
				} else {
					System.out.println(coche.getMiVelocidad());	
				}
			}
		});
		
		bGiraIzq.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(10);
				System.out.println(coche.getMiDireccionActual());	
			}
		});
		
		bGiraDer.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				coche.gira(-10);
				System.out.println(coche.getMiDireccionActual());	
			}
		});
			
			
			
	}


}
