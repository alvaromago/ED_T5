package es.studium.mvcEJ3;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Vista
{
	Frame ventana = new Frame("Aficiones");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	Button btnComprobar = new Button("Comprobar");
	String resultado = new String("");
	
	public Vista() 
	{	
		ventana.setLayout(new FlowLayout());
		ventana.add(chkCorrer);
		ventana.add(chkNadar);
		ventana.add(chkAndar);
		ventana.add(chkLeer);
		ventana.add(chkCine);
		ventana.add(chkBailar);
		ventana.add(chkFutbol);
		ventana.add(chkTenis);
		ventana.add(chkBaloncesto);
		ventana.add(chkVela);
		ventana.add(btnComprobar);
		ventana.setSize(350, 150);
		ventana.setVisible(true);
	}
}
