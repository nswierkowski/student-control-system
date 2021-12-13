package StrategiaMenu;

import Uzytkownik.*;
import java.util.Scanner;
import StrategiaStatystyki.*;
import StrategiaOceny.*;

public class MenuStudent implements Menu {
	
	public void Menu(Uzytkownik [] uzytkownicy, Uzytkownik ob) {
		//Po zalogowaniu na konto typu student, użytkownik ma takie możliwości:
				boolean wylacz = false;
				int wybor;
				
				while(wylacz == false) {
					System.out.println("\n" + ob);
					System.out.println("\n Dzień dobry " +ob.getImie() + ". Co chcesz zrobić?");
					System.out.println("1) Sprawdź swoją średnią");
					System.out.println("2) Sprawdź średnią Pracownika");
					System.out.println("3) Sprawdź oceny");
					System.out.println("4) Wyloguj się");
					wybor = scanner.nextInt();
					
					switch(wybor) {
					case 1:
						sredniaStudenta.Oblicz(uzytkownicy, ob.getNazwisko());
						break;
					case 2:
						for(int i = 0; i < uzytkownicy.length; i++) {
							if(uzytkownicy[i] instanceof Pracownik) System.out.println(uzytkownicy[i]);	
						}
						
						System.out.println("\n Wpisz nazwisko pracownika, którego średnią ocen studentów chcesz zobaczyć");
						String n2 = scanner.next();
						
						sredniaPracownika.Oblicz(uzytkownicy, n2);
						break;
					case 3:
						ocenyPokaz.Oceny(uzytkownicy, ob.getNazwisko(), 0);
						break;
					case 4:
						System.out.println("Wylogowano");
						wylacz = true;
						break;
					default:
						System.out.println("Nie rozpoznaje tej komendy");
					}
				}
	}
	
}
