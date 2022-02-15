package View;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author JOAN
 *
 */
public class InterfazJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, menu, palabra, vidas, palabra_secreta, botones, imagenes;
	private JButton[] array = new JButton[27];
	
	public JButton inicio;
	
	public InterfazJuego() 
	{
		setResizable(false);
		setTitle("Ahorcado");
		setBounds(400, 200, 750, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menu = new JPanel();
		palabra = new JPanel();
		vidas = new JPanel();
		botones = new JPanel();
		imagenes = new JPanel();
		palabra_secreta = new JPanel();
		inicio = new JButton("Iniciar juego");
		
		JButton resolver = new JButton("Resolver");
		resolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog("La palabra es: ");
			}
		});
		JTextField textPalabra = new JTextField();
		
		menu.setBounds(10, 10, 378, 161);
		menu.setLayout(null);
		inicio.setBounds(10, 16, 358, 57);
		resolver.setBounds(10, 84, 358, 66);
		menu.add(inicio);
		menu.add(resolver);
		menu.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		palabra.setBounds(10, 182, 378, 189);
		palabra.setBorder(new LineBorder(new Color(0, 0, 0)));
		palabra.setLayout(null);
		vidas.setBounds(10, 11, 358, 64);
		vidas.setBorder(new EmptyBorder(0, 0, 0, 0));
		palabra.add(vidas);
		palabra_secreta.setBounds(10, 114, 358, 64);
		palabra_secreta.setLayout(null);
		textPalabra.setBounds(21, 21, 314, 32);
		textPalabra.setEditable(false);
		textPalabra.setBackground(Color.BLACK);
		textPalabra.setForeground(Color.WHITE);
		textPalabra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		palabra_secreta.add(textPalabra);
		palabra_secreta.setBorder(new TitledBorder(null, "Palabra Secreta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		palabra.add(palabra_secreta);
		
		botones.setBounds(10, 382, 378, 168);
		botones.setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		addBotones();
		
		imagenes.setBounds(398, 10, 326, 540);
		imagenes.setBorder(new LineBorder(new Color(0, 0, 0)));
		//imagenes.add(new JLabel(new ImageIcon(new ImageIcon("../intento1.png").getImage().getScaledInstance(315, 530, Image.SCALE_SMOOTH))));
		vidas.add(new JLabel(new ImageIcon(new ImageIcon("../pista5.png").getImage().getScaledInstance(350, 55, Image.SCALE_SMOOTH))));

		contentPane.add(menu);
		contentPane.add(palabra);
		contentPane.add(botones);
		botones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(imagenes);
	}
	
	public void addBotones()
	{
		int aux = 0;
		for (int i = 0; i < array.length; i++) 
		{
			if(i != 14)
			{
				array[i] = new JButton("" + (char)(65+aux));
				aux++;
			}
			else
			{
				array[i] = new JButton("Ñ");
			}

			array[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton)e.getSource();
					btn.setEnabled(false);
				}
			});
			
			botones.add(array[i]);
		}
	}
}