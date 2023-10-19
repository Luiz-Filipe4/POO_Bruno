package br.com.music.model;
import java.util.Scanner;

public class Audio extends PaiClass {
	
	public static void Reproduzir() {
		
		Scanner scanner = new Scanner(System.in);
		Audio audios = new Audio();
		
		System.out.println("Escolha a musica a ser reproduzida:");
	     System.out.println("1. Don't Stop Me Now");
	     System.out.println("2. Butter");
	     
	    int escolha = scanner.nextInt();
	    
	    if (escolha == 1) {
	    	
	    	audios.setNome("Don't Stop Me Now");
			audios.setGenero("Rock");
			audios.setBanda("Queen");
			audios.setDuracao(3.29);
			audios.setTotalReproducoes(80);
			System.out.println("A musica Don't Stop Me Now está sendo reproduzida");
	    	audios.infoAudio();
	    	System.out.println("Tempo total escutado: " + audios.TempoReproducoes() + " minutos");
	    	System.out.println("/------------------------------------------/");
	    	audios.Curtir();
	    	
	    } else {
	    	
	    	audios.setNome2("Butter");
			audios.setGenero2("Kpop");
			audios.setBanda2("BTS");
			audios.setDuracao2(2.44);
			audios.setTotalReproducoes2(50);
			System.out.println("A musica Butter está sendo reproduzida");
	    	audios.infoAudio2();
	    	System.out.println("Tempo total escutado: " + audios.TempoReproducoes2() + " minutos");
	    	System.out.println("/------------------------------------------/");
	    	audios.Curtir2();
	    }
	    
	}

}