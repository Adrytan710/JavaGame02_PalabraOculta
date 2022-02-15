package Objetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ahorcado 
{
	private List <String> palabras;
	private int lifeNumber = 5;
	private String eleccion = "";
	private String palabraSecreta;
	private boolean canPlay;
	private int intents;
	private int contador;
	private char letra;
	private String [] tematica = {"Superhéroes", "Misterio", "Deportes", "Literatura"};;
	
	//DEFECTO
	public Ahorcado() {
		this.eleccion = "";
		this.canPlay = false;
		this.intents = 0;
		this.contador = 0;
	}
	
	public Ahorcado(int intents, String opcion) {
		this.intents = intents;
		this.eleccion = opcion;
	}
	

	public int getLifeNumber() {
		return intents;
	}

	public void setLifeNumber(int lifeNumber) {
		this.intents = lifeNumber;
	}

	public String getEleccion() {
		return eleccion;
	}

	public void setEleccion(String eleccion) {
		for(int i = 0; i < tematica.length; i++) {
			if(eleccion.equals(tematica[i])) {
				this.eleccion = eleccion;
			}
		}
	}
	
	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public List<String> getPalabras() {
		return palabras;
	}

	public void setPalabras()  
	{
		switch(this.eleccion) {
			case "Superhéroes":
				List <String> superheroes = new ArrayList<String>(Arrays.asList("ironman","spiderman","hulk","superman","batman","aquaman","supergirl","flash","starlord","groot"));
				this.palabras = new ArrayList<String>(superheroes);
				break;
			case "Misterio":
				List <String> misterio = new ArrayList<String>(Arrays.asList("agatha","allan","conan","john","dashiel","edogawa","raymond","josephine","truman","juan"));
				this.palabras = new ArrayList<String>(misterio);
				break;
			case "Deportes":
				List <String> deportes = new ArrayList<String>(Arrays.asList("futbol","tenis","baloncesto","badminton","volleyball","ciclismo","hockey","balomano","natacion","motociclismo"));
				this.palabras = new ArrayList<String>(deportes);
				break;
			case "Literatura":
				List <String> literatura = new ArrayList<String>(Arrays.asList("aventuras","terror","misterio","policiaca","cuento","humor","romantica","poesia","teatro","mitologia"));
				this.palabras = new ArrayList<String>(literatura);
				break;
		}
	}
	
	public String getPalabraSecreta() {
		return palabraSecreta;
	}

	public void setPalabra() {
		int numero = (int) (Math.random() * palabras.size());
		
		palabraSecreta = palabras.get(numero);	
	}
	
	public boolean weCanPlay() {
		if(intents > 0) {
			canPlay = true;
		}	
		return canPlay;
	}
	
	public void Adivina(char letra) {
		if(weCanPlay()) {
			for(int i = 0; i < palabraSecreta.length(); i++) {
				if(palabraSecreta.charAt(i) == letra) {
					System.out.println(letra);
					System.out.println("acierto");
				} else {
					contador++;
					intents--;
				}
			}
		}
	}
}
