package es.studium.mvcEJ1;

public class Modelo
{
	public float celsiusAF(float celsius)
	{
		return (celsius * 9.0f / 5.0f) + 32.0f;
	}
	public float FahrenAC(float fahrenheit)
	{
		return (fahrenheit - 32.0f) * 5.0f / 9.0f;
	}
}
