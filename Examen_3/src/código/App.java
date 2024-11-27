package código;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


@SuppressWarnings("deprecation")
public class App extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	// Tipo de Figura
	public String shape;
	// Colores de la figura
	public int r, g, b;
	
	public void paintSquare(int r, int g, int b, Graphics render) {
		Graphics2D draw = (Graphics2D)render;
		draw.setColor(new Color(r,g,b));
		draw.fillRect(300, 300, 600, 600);
	}
	
	public void paintCircle(int r, int g, int b, Graphics render) {
		Graphics2D draw = (Graphics2D)render;
		draw.setColor(new Color(r,g,b));
	    draw.drawOval(300, 600, 300, 300);
	}
	
	@Override
	public void update(Observable o, Object shape) {
		this.repaint();
	}
	
	public static void main(String[] args) {
		new Window();
	}
	

}
