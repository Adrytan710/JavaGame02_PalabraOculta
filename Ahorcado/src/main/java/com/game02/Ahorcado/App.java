package com.game02.Ahorcado;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Objetos.Ahorcado;
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
			public void run() 
			{
				try 
				{
					form = new Formulario();
					
					form.getBtn().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							form.setVisible(false);
							interfaz.setVisible(true);
							
							int intentos;
							
							if(form.getFacil().isSelected())
							{
								intentos = 10;
							}
							else if(form.getNormal().isSelected())
							{
								intentos = 8;
							}
							else
							{
								intentos = 6;
							}
							
							interfaz.setJuego(new Ahorcado(intentos, (String)form.getComboBox().getSelectedItem()));
							interfaz.iniciarJuego();
						}
					});
					
					
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{					
					interfaz = new InterfazJuego();
					interfaz.getInicio().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							
							form.setVisible(true);
							interfaz.setVisible(false);
							
						}
					});

					interfaz.getNewGame().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) 
						{
							
							form.setVisible(true);
							interfaz.setVisible(false);
							
						}
					});
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
    }
}
