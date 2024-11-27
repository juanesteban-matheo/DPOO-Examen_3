package código;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public JTextField rValue, gValue, bValue;
	public JButton squareButton, circleButton;
	
	public Window() {
		setLayout(new BorderLayout());
		
		rValue = new JTextField("R");
		add(rValue, BorderLayout.WEST);
		rValue.addActionListener((ActionListener) this);
		
		gValue = new JTextField("G");
		add(gValue, BorderLayout.WEST);
		gValue.addActionListener((ActionListener) this);
		
		bValue = new JTextField("B");
		add(bValue, BorderLayout.WEST);
		bValue.addActionListener((ActionListener) this);
		
		setTitle("Ventana de Juan Esteban López");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 700);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		paintCircle();
	}
}
