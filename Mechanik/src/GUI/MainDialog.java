package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainDialog extends JDialog {
	
	private static JPanel panel;
	private static Konsola txtArea;
	
	public MainDialog(){
		
		super();
		panel =new GamePanel();
		txtArea = new Konsola();
		
		setLayout(new BorderLayout(20, 20));
		setTitle("Napraw swoje auto !");
		setVisible(true);
		setSize(new Dimension(800, 650));
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		
		add(panel );
		add(new SouthMainPanel(), BorderLayout.SOUTH);
		add(txtArea, BorderLayout.EAST);
		add(new JLabel(""), BorderLayout.WEST);
		add(new TopMainPanel(),BorderLayout.PAGE_START);
	
	}
	
	public static JPanel getPanel() {
		return panel;
	}
	
	public static Konsola getKonsola() {
		return txtArea;
	}
}
