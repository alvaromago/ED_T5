package es.studium.mvc1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Vista
{
	Frame ventana = new Frame("Doble");
	TextField txtNumero = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	TextField txtResultado = new TextField(20);
	
	public Vista()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(240, 140);
		ventana.add(txtNumero);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
