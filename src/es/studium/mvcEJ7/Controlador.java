package es.studium.mvcEJ7;

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
		v.articuloNuevo.addActionListener(this);
		v.articuloEliminar.addActionListener(this);
		v.articuloConsultar.addActionListener(this);
		v.clientesNuevo.addActionListener(this);
		v.clientesEliminar.addActionListener(this);
		v.clientesConsultar.addActionListener(this);
		v.facturasNueva.addActionListener(this);
		v.facturaConsultar.addActionListener(this);
		v.facturaEliminar.addActionListener(this);
		v.dlgDialogo.addWindowListener(this);
		v.ventana.addWindowListener(this);
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
		} 
		else
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
		if (a.equals(vista.articuloNuevo))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Artículo Nuevo"));
		} 
		else if (a.equals(vista.articuloEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Artículo Eliminar"));
		} 
		else if (a.equals(vista.articuloConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Artículo Consultar"));
		} 
		else if (a.equals(vista.clientesNuevo))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Cliente Nuevo"));
		} 
		else if (a.equals(vista.clientesEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Cliente Eliminar"));
		} 
		else if (a.equals(vista.clientesConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Cliente Consultar"));
		} 
		else if (a.equals(vista.facturasNueva))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Factura Nueva"));
		} 
		else if (a.equals(vista.facturaConsultar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Factura Consultar"));
		}
		else if(a.equals(vista.facturaEliminar))
		{
			vista.lblMensaje.setText(modelo.rellenarEtiqueta("Factura Eliminar"));
		}
		vista.dlgDialogo.add(vista.lblMensaje);
		vista.dlgDialogo.setVisible(true);
	}
}
