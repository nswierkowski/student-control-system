package Uzytkownik;

public abstract class Uzytkownik {

	protected String login;
	protected String haslo;
	protected String imie;
	protected String nazwisko;
	
	public Uzytkownik() {
		login = "";
		haslo = "";
		imie = "";
		nazwisko = "";
	}
	
	public Uzytkownik(String login, String haslo, String imie, String nazwisko) {
		this.login = login;
		this.haslo = haslo;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public String getHaslo() {
		return haslo;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getImie() {
		return imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	
	public String toString() {
		return imie +" "+ nazwisko +" "+ login;
	}

}
