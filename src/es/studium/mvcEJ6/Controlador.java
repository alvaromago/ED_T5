package es.studium.mvcEJ6;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ItemListener
{
	Modelo modelo;
	Vista vista;
	
	public Controlador(Modelo m, Vista v)
	{
		modelo = m;
		vista = v;
		v.ventana.addWindowListener(this);
		v.lisEquipos.addItemListener(this);
	}

	public void windowActivated(WindowEvent we)
	{}

	public void windowClosed(WindowEvent we)
	{}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent we)
	{}

	public void windowDeiconified(WindowEvent we)
	{}

	public void windowIconified(WindowEvent we)
	{}

	public void windowOpened(WindowEvent we)
	{}

	public void itemStateChanged(ItemEvent ie)
	{
		String ciudad = new String();
		ciudad = modelo.ciudad(vista.lisEquipos.getSelectedIndex());
		System.out.println(ciudad);
	}
}
