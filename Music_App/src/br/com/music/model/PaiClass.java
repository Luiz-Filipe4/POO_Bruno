package br.com.music.model;

import java.util.Scanner;

public class PaiClass {

	Scanner scanner = new Scanner(System.in);

	private String nome, nome2;
	private double duracao, duracao2;
	private int totalReproducoes, totalReproducoes2;
	protected int curtidas, curtidas2;
	private String genero, genero2;
	private String banda, banda2;
	private double tempoEscutado, tempoEscutado2;

	public double getTempoEscutado() {
		return tempoEscutado;
	}

	public void setTempoEscutado(double tempoEscutado) {
		this.tempoEscutado = tempoEscutado;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public void setTotalReproducoes(int totalReproducoes) {
		this.totalReproducoes = totalReproducoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getTempoEscutado2() {
		return tempoEscutado2;
	}

	public void setTempoEscutado2(double tempoEscutado2) {
		this.tempoEscutado2 = tempoEscutado2;
	}

	public String getBanda2() {
		return banda2;
	}

	public void setBanda2(String banda2) {
		this.banda2 = banda2;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public double getDuracao2() {
		return duracao2;
	}

	public void setDuracao2(double duracao2) {
		this.duracao2 = duracao2;
	}

	public int getTotalReproducoes2() {
		return totalReproducoes2;
	}

	public void setTotalReproducoes2(int totalReproducoes2) {
		this.totalReproducoes2 = totalReproducoes2;
	}

	public int getCurtidas2() {
		return curtidas2;
	}

	public void setCurtidas2(int curtidas2) {
		this.curtidas2 = curtidas2;
	}

	public String getGenero2() {
		return genero2;
	}

	public void setGenero2(String genero2) {
		this.genero2 = genero2;
	}

	public void infoAudio() {

		System.out.println("Nome da música: " + nome);
		System.out.println("Genero: " + genero);
		System.out.println("Banda: " + banda);
		System.out.println("Duração: " + duracao);
		System.out.println("Total de reproduções: " + totalReproducoes);
		System.out.println("Curtidas: " + curtidas);
	}

	public void infoAudio2() {
		System.out.println("Nome da música: " + nome2);
		System.out.println("Genero: " + genero2);
		System.out.println("Banda: " + banda2);
		System.out.println("Duração: " + duracao2);
		System.out.println("Total de reproduções: " + totalReproducoes2);
		System.out.println("Curtidas: " + curtidas2);
	}

	public double TempoReproducoes() {

		return totalReproducoes * duracao;

	}

	public double TempoReproducoes2() {

		return totalReproducoes2 * duracao2;

	}

	public void Curtir() {
		System.out.println("Gostaria de curtir a música Don't Stop Me Now?");
		System.out.println("1. Sim");
		System.out.println("2. Não");

		int escolha2 = scanner.nextInt();

		if (escolha2 == 1) {
			curtidas++;
			System.out.println("Curtidas: " + curtidas + " ♥");
		}
	}

	public void Curtir2() {
		System.out.println("Gostaria de curtir a música Butter?");
		System.out.println("1. Sim");
		System.out.println("2. Não");

		int escolha3 = scanner.nextInt();

		if (escolha3 == 1) {
			curtidas2++;
			System.out.println("Curtidas: " + curtidas2 + " ♥");
		}
	}
}