package Uzytkownik;

import java.util.Random;

public class Student extends Uzytkownik {

	int indeks;
	String kierunek;
	int [] oceny;
	
	public Student() {
		super();
		indeks = 0;
		kierunek = "";
		oceny = null;
	}
	
	public Student(String login, String haslo, String imie, String nazwisko, String kierunek) {
		super(login, haslo, imie, nazwisko);
		this.kierunek = kierunek;
		this.indeks = indeks();
		oceny = new int [10];
	}
	
	public int indeks() {
		Random g = new Random();
		return g.nextInt(100000)+200000;
	}
	
	public int [] getOceny() {
		return oceny;
	}
	
	public int getIndeks() {
		return indeks;
	}
	
	public String getKierunek() {
		return kierunek;
	}
	
	public void setOceny(int [] oceny) {
		this.oceny = oceny;
	}
	
	public void dodajOcene(int m, int o) {
		oceny[m] = o;
	}
	
	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}
	
	public String toString() {
		return imie +" "+ nazwisko +" "+ login + " studiuje: " + kierunek +" indeks: " +indeks;
	}
}
