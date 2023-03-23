package es.studium.mvc1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Modelo modelo;
	Vista vista;
	
	public Controlador(Modelo m, Vista v)
	{
		modelo = m;
		vista = v;
		v.btnCalcular.addActionListener(this);
		v.ventana.addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int numero = Integer.parseInt(vista.txtNumero.getText());
		vista.txtResultado.setText(modelo.doble(numero) + "");
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
