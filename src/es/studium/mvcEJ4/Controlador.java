package es.studium.mvcEJ4;

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
		v.ventana.addWindowListener(this);
		v.btnCalcular.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		modelo.presupuesto = 0;
		if (vista.chkGasolina.getState() == true)
		{
			modelo.presupuesto = modelo.total(7000);
		}
		if (vista.chkDiesel.getState() == true)
		{
			modelo.presupuesto = modelo.total(8000);
		}
		if (vista.chkHibrido.getState() == true)
		{
			modelo.presupuesto = modelo.total(9000);
		}
		if (vista.chkElectrico.getState() == true)
		{
			modelo.presupuesto = modelo.total(8500);
		}
		if (vista.chkTresPuertas.getState() == true)
		{
			modelo.presupuesto = modelo.total(2000);
		}
		if (vista.chkCuatroPuertas.getState() == true)
		{
			modelo.presupuesto = modelo.total(3000);
		}
		if (vista.chkCincoPuertas.getState() == true)
		{
			modelo.presupuesto = modelo.total(2500);
		}
		if (vista.chkPinturaMetalizada.getState() == true)
		{
			modelo.presupuesto = modelo.total(1500);
		}
		vista.txtPresupuesto.setText(modelo.presupuesto + " $");
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
}
