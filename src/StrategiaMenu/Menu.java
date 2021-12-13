package StrategiaMenu;

import java.util.Scanner;

import StrategiaOceny.*;
import StrategiaStatystyki.*;
import Uzytkownik.*;

public interface Menu {

	Scanner scanner = new Scanner(System.in);
	Statystyki sredniaStudenta = new ŚredniaStudenta();
	Statystyki sredniaPracownika = new ŚredniaStudentówPracownika();
	Oceny ocenyPokaz = new WyswietlOceny();
	Oceny ocenyWpisz = new WpiszOcene();
	
	public abstract void Menu(Uzytkownik [] uzytkownicy, Uzytkownik ob);
}
