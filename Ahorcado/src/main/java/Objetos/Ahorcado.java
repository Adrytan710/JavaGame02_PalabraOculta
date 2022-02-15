package Objetos;

import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado 
{
	private ArrayList<String> palabras;
	private int lifeNumber = 5;
	private String palabraSecreta;
	private String palabraSecretaMostrar;
	private boolean canPlay;
	private int intents = 0;
	private int intentsMax;
	private int contador;
	private char letra;
	
	public Ahorcado(int intents, String opcion) 
	{
		this.intentsMax = intents;
		setPalabras(opcion);
		setPalabraSecreta();
		setPalabraSecretaMostrar();
	}

	public int getContador() 
	{
		return contador;
	}

	public void setContador(int contador) 
	{
		this.contador = contador;
	}

	public int getLifeNumber() 
	{
		return lifeNumber;
	}

	public void setLifeNumber(int lifeNumber) 
	{
		this.lifeNumber = lifeNumber;
	}
	
	public char getLetra() 
	{
		return letra;
	}

	public void setLetra(char letra) 
	{
		this.letra = letra;
	}
	
	public ArrayList<String> getPalabras() 
	{
		return palabras;
	}

	public void setPalabras(String opcion)  
	{
		switch(opcion) 
		{
			case "Superhéroes":
				this.palabras = new ArrayList<String>(Arrays.asList("ironman","spiderman","hulk","superman","batman","aquaman","supergirl","flash","starlord","groot"));
				break;
			case "Misterio":
				this.palabras = new ArrayList<String>(Arrays.asList("agatha","allan","conan","john","dashiel","edogawa","raymond","josephine","truman","juan"));
				break;
			case "Deportes":
				this.palabras = new ArrayList<String>(Arrays.asList("futbol","tenis","baloncesto","badminton","volleyball","ciclismo","hockey","balomano","natacion","motociclismo"));
				break;
			case "Literatura":
				this.palabras = new ArrayList<String>(Arrays.asList("aventuras","terror","misterio","policiaca","cuento","humor","romantica","poesia","teatro","mitologia"));
				break;
		}
	}
	
	public String getPalabraSecreta() 
	{
		return palabraSecreta;
	}

	public void setPalabraSecreta() 
	{
		int numero = (int) (Math.random() * palabras.size());
		
		palabraSecreta = palabras.get(numero).toUpperCase();
	}
	
	public boolean weCanPlay() 
	{
		if(intentsMax > intents) 
		{
			canPlay = true;
		}	
		return canPlay;
	}
	
	public void Adivina(char letra) 
	{
		if(weCanPlay()) 
		{
			for(int i = 0; i < palabraSecreta.length(); i++) 
			{
				if(palabraSecreta.charAt(i) == letra) 
				{
					System.out.println(letra);
					System.out.println("acierto");
					contador++;
				} 
				else 
				{
					contador++;
					intents++;
				}
			}
		}
	}

	public int getIntents() {
		return intents;
	}

	public String getPalabraSecretaMostrar() 
	{
		String str = "";
		
		for (int i = 0; i < palabraSecretaMostrar.length(); i++) 
		{
			str += palabraSecretaMostrar.charAt(i) + " ";
		}
		return str;
	}

	public void setPalabraSecretaMostrar() 
	{
		String str = "";
		
		for (int i = 0; i < palabraSecreta.length(); i++) 
		{
			str += "_";
		}
		this.palabraSecretaMostrar = str;
	}
}
