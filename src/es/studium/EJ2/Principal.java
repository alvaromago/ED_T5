package es.studium.EJ2;

public class Principal
{

	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		new Controlador(modelo, vista);
	}

}
