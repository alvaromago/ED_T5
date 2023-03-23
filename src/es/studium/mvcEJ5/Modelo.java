package es.studium.mvcEJ5;

public class Modelo
{
	String[] gentilicios =
	{ "No ha elegido ninguna opción", "Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na",
			"Almeriense, Urcitano/na", "Asturiano/na", "Abulense, Avilés/esa",
			"Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña",
			"Gaditano/na", "Cántabro/a", "Castellonense", "Ciudadrealeño/ña", "Cordobés/esa", "Coruñés", "Conquense",
			"Gerundense, Gironés/esa", "Granadino/na", "Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na",
			"Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense", "Leonés/esa", "Leridano",
			"Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na",
			"Palmense", "Pontevedrés/esa", "Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense",
			"Soriano/na", "Tarracconense/a", "Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
			"Pucelano/na", "Vizcaíno/na", "Zamorano/na", "Zaragozano/na" };

	public String getGentilicio(int indice)
	{
		return gentilicios[indice];
	}
}
