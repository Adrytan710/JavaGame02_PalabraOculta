package com.game02.Ahorcado;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Formulario;
import View.InterfazJuego;

/**
 * 
 * @author JOAN
 *
 */
public class App 
{
	private static Formulario form;
	private static InterfazJuego interfaz;
	
    public static void main( String[] args )
    {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form = new Formulario();
					
					form.btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							form.setVisible(false);
							interfaz.setVisible(true);
							
							
						}
					});
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					interfaz = new InterfazJuego();
					interfaz.inicio.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							form.setVisible(true);
							interfaz.setVisible(false);
							
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
