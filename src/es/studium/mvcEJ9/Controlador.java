package es.studium.mvcEJ9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

public class Controlador implements WindowListener, ActionListener
{
	Modelo modelo;
	Vista vista;

	public Controlador(Modelo modelo, Vista vista)
	{
		this.modelo = modelo;
		this.vista = vista;
		vista.proximo.addActionListener(this);
		vista.anterior.addActionListener(this);
		vista.primero.addActionListener(this);
		vista.ultimo.addActionListener(this);
		vista.ventana.addWindowListener(this);
		try
		{
			vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
			vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
		} catch (SQLException e)
		{
			System.out.println("Error en la sentencia SQL" + e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		// Hemos pulsado Próximo
		if (vista.proximo.equals(actionEvent.getSource()))
		{
			try
			{
				// Si no hemos llegado al final
				if (modelo.rs.next())
				{
					// Poner en los TextField los valores obtenidos
					vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
					vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
				} else
				{
					// Mueve el cursos al registro anterior
					modelo.rs.previous();
					vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
					vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
				}
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" + e.getMessage());
			}
		}
		// Hemos pulsado anterior
		if (vista.anterior.equals(actionEvent.getSource()))
		{
			try
			{
				// Si no hemos llegado al final
				if (modelo.rs.previous())
				{
					// Poner en los TextField los valores obtenidos
					vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
					vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
				} else
				{
					modelo.rs.next();
					vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
					vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
				}
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" + e.getMessage());
			}
		}
		if (vista.primero.equals(actionEvent.getSource()))
		{
			try
			{
				modelo.rs.first();
				vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
				vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" + e.getMessage());
			}
		}
		if (vista.ultimo.equals(actionEvent.getSource()))
		{
			try
			{
				modelo.rs.last();
				vista.idEmpleado.setText(Integer.toString(modelo.rs.getInt("idEmpleado")));
				vista.nombreEmpleado.setText(modelo.rs.getString("nombreEmpleado"));
			} catch (SQLException e)
			{
				System.out.println("Error en la sentencia SQL" + e.getMessage());
			}
		}
	}

	public void windowActivated(WindowEvent we)
	{
	}

	public void windowClosed(WindowEvent we)
	{
	}

	public void windowClosing(WindowEvent we)
	{
		// cerrar los elementos de la base de datos
		try
		{
			modelo.rs.close();
			modelo.stmt.close();
			modelo.con.close();
		} catch (SQLException e)
		{
			System.out.println("error al cerrar " + e.toString());
		}
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent we)
	{
	}

	public void windowDeiconified(WindowEvent we)
	{
	}

	public void windowIconified(WindowEvent we)
	{
	}

	public void windowOpened(WindowEvent we)
	{
	}
}
