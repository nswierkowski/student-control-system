package Uzytkownik;

import java.util.Random;

public class Pracownik extends Uzytkownik {

	String kierunekJakiUczy;
	Student [] studenci;
	
	public Pracownik() {
		super();
		kierunekJakiUczy = "";
		studenci = null;
	}
	
	public Pracownik(String login, String haslo, String imie, String nazwisko, String kierunekJakiUczy, Student [] studenci) {
		super(login, haslo, imie, nazwisko);
		this.kierunekJakiUczy = kierunekJakiUczy;
		this.studenci = studenci;
	}
	
	public Student [] getStudenci() {
		return studenci;
	}
	
	public String getKierunekJakiUczy() {
		return kierunekJakiUczy;
	}
	
	public void setStudent(Student [] studenci) {
		this.studenci = studenci;
	}
	
	public void setKierunek(String kierunekJakiUczy) {
		this.kierunekJakiUczy = kierunekJakiUczy;
	}
	
	public void dodajStudenta(Student s) {
		//metoda dodaje nowego studenta do grupy pracownika naukowego
		Student [] t = new Student [studenci.length + 1];
		for(int i = 0; i < studenci.length; i++) {
			t[i] = studenci[i];
		}
		
		t[studenci.length + 1] = s;
		setStudent(t);
	}
}
