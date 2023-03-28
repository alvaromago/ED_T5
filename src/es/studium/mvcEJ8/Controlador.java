package es.studium.mvcEJ8;

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
		v.agendadecitasNuevo.addActionListener(this);
		v.agendadecitasEliminar.addActionListener(this);
		v.agendadecitasConsultar.addActionListener(this);
		v.agendadecitasModificar.addActionListener(this);
		v.eventoNuevo.addActionListener(this);
		v.eventoEliminar.addActionListener(this);
		v.eventoConsultar.addActionListener(this);
		v.eventoModificar.addActionListener(this);
		v.libretadedireccionesNueva.addActionListener(this);
		v.libretadedireccionesEliminar.addActionListener(this);
		v.libretadedireccionesConsultar.addActionListener(this);
		v.libretadedireccionesModificar.addActionListener(this);
		v.ventana.addWindowListener(this);
		v.dlgDialogo.addWindowListener(this);
	}
	
	public void windowActivated(WindowEvent we)
	{}

	public void windowClosed(WindowEvent we)
	{}

	public void windowClosing(WindowEvent we)
	{
		if (vista.dlgDialogo.hasFocus())
		{
			vista.dlgDialogo.setVisible(false);
		} else
		{
			System.exit(0);
		}
	}

	public void windowDeactivated(WindowEvent we)
	{}

	public void windowDeiconified(WindowEvent we)
	{}

	public void windowIconified(WindowEvent we)
	{}

	public void windowOpened(WindowEvent we)
	{}

	public void actionPerformed(ActionEvent ae)
	{
		Object a;
		a = ae.getSource();
		if (a.equals(vista.agendadecitasNuevo))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Nueva Cita"));
		} else if (a.equals(vista.agendadecitasEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Eliminar Cita"));
		} else if (a.equals(vista.agendadecitasConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Consultar Cita"));
		} else if (a.equals(vista.agendadecitasModificar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Modificar Cita"));
		} else if (a.equals(vista.eventoNuevo))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Nuevo Evento"));
		} else if (a.equals(vista.eventoEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Eliminar Evento"));
		} else if (a.equals(vista.eventoConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Consultar Evento"));
		} else if (a.equals(vista.eventoModificar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Modificar Evento"));
		} else if (a.equals(vista.libretadedireccionesNueva))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Nuevo Contacto"));
		} else if (a.equals(vista.libretadedireccionesEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Eliminar Contacto"));
		} else if (a.equals(vista.libretadedireccionesConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Consultar Contacto"));
		} else
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Modificar Contacto"));
		}
		vista.dlgDialogo.add(vista.lblMensaje);
		vista.dlgDialogo.setVisible(true);
	}
}
