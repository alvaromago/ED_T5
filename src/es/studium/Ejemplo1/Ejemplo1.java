package es.studium.Ejemplo1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejemplo1 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Doble");
	TextField txtNumero = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	TextField txtResultado = new TextField(20);

	public Ejemplo1()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(240, 140);
		ventana.add(txtNumero);
		btnCalcular.addActionListener(this);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
		ventana.addWindowListener(this);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo1();
	}

	public void actionPerformed(ActionEvent e)
	{
		int numero = Integer.parseInt(txtNumero.getText());
		txtResultado.setText(2 * numero + "");
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
	public void windowOpened(WindowEvent e){}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}
}
