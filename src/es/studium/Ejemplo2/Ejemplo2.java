package es.studium.Ejemplo2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejemplo2 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Horas");
	Label lblHh1 = new Label("HH");
	TextField txtHh1 = new TextField(2);
	Label lblMm1 = new Label("MM");
	TextField txtMm1 = new TextField(2);
	Label lblHh2 = new Label("HH");
	TextField txtHh2 = new TextField(2);
	Label lblMm2 = new Label("MM");
	TextField txtMm2 = new TextField(2);
	Button btnCalcular = new Button("Calcular");
	TextField txtResultado = new TextField(10);

	public Ejemplo2()
	{
		ventana.setLayout(new GridLayout(3, 4));
		ventana.add(lblHh1);
		ventana.add(txtHh1);
		ventana.add(lblMm1);
		ventana.add(txtMm1);
		ventana.add(lblHh2);
		ventana.add(txtHh2);
		ventana.add(lblMm2);
		ventana.add(txtMm2);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
        // Añadir el Listener a la ventana y al botón
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setSize(450, 100);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo2();
	}

	public void actionPerformed(ActionEvent e)
	{
        // Cogemos los datos de los cuadros de texto
		int horas1 = Integer.parseInt(txtHh1.getText());
		int minutos1 = Integer.parseInt(txtMm1.getText());
		int horas2 = Integer.parseInt(txtHh2.getText());
		int minutos2 = Integer.parseInt(txtMm2.getText());
		String resultado;
		if (horas1 <= horas2)
		{
			int horas = horas2 - horas1;
			int minutos = minutos2 - minutos1;
			if (minutos < 0)
			{
				minutos = 60 + minutos;
				horas = horas - 1;
			}
			if (horas < 10)
			{
				resultado = "0" + horas + ":";
			} else
			{
				resultado = horas + ":";
			}
			if (minutos < 10)
			{
				resultado = resultado + "0" + minutos;
			} else
			{
				resultado = resultado + minutos;
			}
			txtResultado.setText(resultado);
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
