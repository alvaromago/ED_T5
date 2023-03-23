package es.studium.EJ2;

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
	
	public void actionPerformed(ActionEvent e)
	{
		Object a = e.getSource();
		if (a.equals(vista.btnCalcular))
		{
			float cantidad = Float.parseFloat(vista.txt1.getText());
			float porcentaje = Float.parseFloat(vista.txt2.getText());
			float resultado = modelo.porcentaje(cantidad, porcentaje);
			vista.txt1.selectAll();
			vista.txt1.setText("");
			vista.txt2.selectAll();
			vista.txt2.setText("");
			vista.txt1.requestFocus();
			vista.txtResultado.setText(resultado + "");
		}
	}

	public void windowOpened(WindowEvent e)
	{}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent e)
	{}

	public void windowIconified(WindowEvent e)
	{}

	public void windowDeiconified(WindowEvent e)
	{}

	public void windowActivated(WindowEvent e)
	{}

	public void windowDeactivated(WindowEvent e)
	{}

}
