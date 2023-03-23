package es.studium.mvcEJ5;

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
		v.choProvincias.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		int posicion = 0;
		for (String provincia : vista.provincias)
		{
			if (provincia.equals(e.getItem()))
			{
				vista.txtGentilicio.setText(modelo.gentilicios[posicion]);
			}
			posicion++;
		}
	}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	public void windowActivated(WindowEvent we)
	{}

	public void windowClosed(WindowEvent we)
	{}

	public void windowDeactivated(WindowEvent we)
	{}

	public void windowDeiconified(WindowEvent we)
	{}

	public void windowIconified(WindowEvent we)
	{}

	public void windowOpened(WindowEvent we)
	{}
}
