package View;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author JOAN
 *
 */
public class Formulario extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btn;

	public Formulario() 
	{
		setResizable(false);
		setBounds(500, 300, 550, 400);
		setVisible(true);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dificultad = new JLabel("Dificultad");
		dificultad.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton facil = new JRadioButton("Facil", true);
		JRadioButton normal = new JRadioButton("Normal");
		JRadioButton dificil = new JRadioButton("Dificil");
		JLabel categoria = new JLabel("Categoria");
		categoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		JComboBox<Object> comboBox = new JComboBox<Object>();
		ButtonGroup grupo = new ButtonGroup();
		btn = new JButton("Enviar");
		
		grupo.add(facil);
		grupo.add(normal);
		grupo.add(dificil);
		
		dificultad.setBounds(56, 108, 69, 15);
		facil.setBounds(100, 133, 109, 23);
		normal.setBounds(100, 159, 109, 23);
		dificil.setBounds(100, 185, 109, 23);
		categoria.setBounds(298, 108, 69, 14);
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Superheroes", "Misterio", "Deportes", "Literatura"}));
		comboBox.setBounds(326, 133, 109, 22);
		btn.setBounds(199, 263, 109, 22);
		
		contentPane.add(dificultad);
		contentPane.add(facil);
		contentPane.add(normal);
		contentPane.add(dificil);
		contentPane.add(categoria);
		contentPane.add(comboBox);
		contentPane.add(btn);
	}

}
