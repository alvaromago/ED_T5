package es.studium.mvcEJ1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.studium.mvcEJ1.Modelo;
import es.studium.mvcEJ1.Vista;

public class Controlador implements WindowListener, ActionListener
{
	Modelo modelo;
	Vista vista;
	
	public Controlador(Modelo m, Vista v)
	{
		modelo = m;
		vista = v;

		v.ventana.addWindowListener(this);
		v.btnCelFah.addActionListener(this);
		v.btnFahCel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(vista.btnCelFah))
		{
			float celsius = Float.parseFloat(vista.txtCelsius.getText());
			float fahrenheit = modelo.celsiusAF(celsius);
			vista.txtFahrenheit.setText(fahrenheit + "");
		} else
		{
			float fahrenheit = Float.parseFloat(vista.txtFahrenheit.getText());
			float celsius = modelo.FahrenAC(fahrenheit);
			vista.txtCelsius.setText(celsius + "");
		}
	}

	public void windowOpened(WindowEvent e){}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}
}
