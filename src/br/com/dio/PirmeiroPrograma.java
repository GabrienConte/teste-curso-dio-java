package br.com.dio;

import br.com.dio.model.Gato;

public class PirmeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		int a = 5;
		int b = 5;
		System.out.println("Olá Mundo!" + (a + b) + gato.toString());
	}

} 
